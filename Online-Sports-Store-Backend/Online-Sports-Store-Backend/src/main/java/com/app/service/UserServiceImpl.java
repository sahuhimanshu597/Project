package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dao.UserRepository;
import com.app.dto.LoginRequest;
import com.app.exceptions.UserNotFoundException;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private EmailSenderService service;
	
	@Override
	public User registerOrEditUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		 userRepo.save(user);
		service.sendSimpleEmail(user.getEmail(),"Hello "+user.getFirstName() +" ,Welcome to Sportify Family, Looking forward to serve you.", "Successfully Registered");
		return user;
	}

	@Override
	public User authenticateUser(LoginRequest request) {
		return userRepo.findByEmailAndPassword(request.getEmail(), request.getPassword())
				.orElseThrow(() -> new UserNotFoundException("Invalid Credentials!"));
	}

	@Override
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	@Override
	public User findById(Integer userId) {
		return userRepo.findById(userId).orElseThrow(() -> new UserNotFoundException("Invalid Credentials"));
	}

	@Override
	public List<User> getUsersByRole(String role) {
		return userRepo.findAll().stream().filter(user -> user.getRole().name().equals(role))
				.collect(Collectors.toList());
	}

	@Override
	public String deleteUserById(Integer uid) {
		userRepo.deleteById(uid);
		return "User with id: " + uid + " deleted successfully!!";
	}
}

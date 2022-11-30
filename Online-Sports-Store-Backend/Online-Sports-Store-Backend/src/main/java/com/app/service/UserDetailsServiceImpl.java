package com.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.dao.UserRepository;
import com.app.pojos.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	public UserDetailsServiceImpl() {
		log.info("\n---------- CTOR: "+ getClass().getName() +" -----------\n");
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	
		log.info("\n------------ IN UserDetailsServiceImpl.loadUserByUsername ---------------\n");
	
		log.info("Email: " + email);
		
		User user = userRepo.findByEmail(email);
		
		log.info("User from loadUserByUsername: " + user);
		return new org.springframework.security.core.userdetails.User(user.getId().toString(), user.getPassword(), new ArrayList<GrantedAuthority>());
	}
	
	public UserDetails loadUserById(Integer id) throws UsernameNotFoundException {
		
		log.info("\n------------ IN UserDetailsServiceImpl.loadUserById ---------------\n");
	
		log.info("Id: " + id);
		
		User user = userRepo.findById(id).get();
		
		System.out.println("User from loadUserById: " + user);
		return new org.springframework.security.core.userdetails.User(user.getId().toString(), user.getPassword(), new ArrayList<GrantedAuthority>());
	}

}

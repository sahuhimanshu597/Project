package com.app.dto;

import com.app.pojos.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoginResponse {
	private String status;
	private User data;
	private String token;
	
	public LoginResponse(String status, User user, String token) {
		log.info("\n----------- CTOR: LoginResponse - generating response with user details and JWT --------------\n");
		this.status = status;
		this.data = user;
		this.token = token;
	}

}

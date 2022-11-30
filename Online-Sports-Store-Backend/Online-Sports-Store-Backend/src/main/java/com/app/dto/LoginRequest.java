package com.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoginRequest {
	
	private String email, password;
	
	public LoginRequest(String email, String password) {
		this.email = email;
		this.password = password;
	}	
}

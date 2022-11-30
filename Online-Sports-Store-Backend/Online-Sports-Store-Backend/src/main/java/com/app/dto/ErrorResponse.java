package com.app.dto;


import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse {
	private String status;
	private String message;
	private LocalDateTime timeStamp;
	private String errDetails;

	public ErrorResponse(String status, String message,String errDetails) {
		super();
		this.status=status;
		this.message = message;
		this.errDetails=errDetails;
		this.timeStamp=LocalDateTime.now();
	}

	@Override
	public String toString() {
		return  message + " timeStamp=" + timeStamp ;
	}
}
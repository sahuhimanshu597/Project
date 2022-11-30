package com.app.exchandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.app.dto.ErrorResponse;
import com.app.exceptions.UserNotFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException e){
		log.info("In handle user not found exception");
		return new ResponseEntity<ErrorResponse>(new ErrorResponse("error", "Invalid Login", e.getMessage()), HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleBankAccountHandlingException(Exception e) {
		log.info("in handle any exc");
		return new ResponseEntity<>(new ErrorResponse("error", "Server side error!",e.getMessage()),
				 HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
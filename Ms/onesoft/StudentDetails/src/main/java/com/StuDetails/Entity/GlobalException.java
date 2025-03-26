package com.StuDetails.Entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.StuDetails.Exception.LowAgeException;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(LowAgeException.class)
	public ResponseEntity<Object> BrandNot(LowAgeException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}

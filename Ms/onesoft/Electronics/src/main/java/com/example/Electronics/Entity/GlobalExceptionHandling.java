package com.example.Electronics.Entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.Electronics.Exception.BrandNotFoundException;
import com.example.Electronics.Exception.ColorNotfoundException;
import com.example.Electronics.Exception.PriceHighException;
import com.example.Electronics.Exception.StartsWithException;
import com.example.Electronics.Exception.StrorageCapacityException;
import com.example.Electronics.Exception.YearNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(BrandNotFoundException.class)
	public ResponseEntity<Object> BrandNot(BrandNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(YearNotFoundException.class)
	public ResponseEntity<Object>YearNotFound(YearNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ColorNotfoundException.class)
	public ResponseEntity<Object> colornotFound(ColorNotfoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(StartsWithException.class)
	public ResponseEntity<Object> startwith(StartsWithException e){
		return new ResponseEntity<>("hey startwith not found",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(StrorageCapacityException.class)
	public ResponseEntity<Object> storage(StrorageCapacityException e){
		return new ResponseEntity<Object>("hello storage not found",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PriceHighException.class)
	public ResponseEntity<Object> priceHigh(PriceHighException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}







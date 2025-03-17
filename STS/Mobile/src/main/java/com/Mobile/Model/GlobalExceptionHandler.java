package com.Mobile.Model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Mobile.exception.BrandNotFoundException;
import com.Mobile.exception.ColorNotFoundException;
import com.Mobile.exception.ModelStartsWithException;
import com.Mobile.exception.StorageCapacityException;
import com.Mobile.exception.YearNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(BrandNotFoundException.class)
	public ResponseEntity<Object>BrandNotFound(BrandNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ColorNotFoundException.class)
	public ResponseEntity<Object>ColorNotFound(ColorNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ModelStartsWithException.class)
	public ResponseEntity<Object>modelStartsWith(ModelStartsWithException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(StorageCapacityException.class)
	public ResponseEntity<Object>storageCapacity(StorageCapacityException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler(YearNotFoundException.class)
	public ResponseEntity<Object>yearNotFound(YearNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

}

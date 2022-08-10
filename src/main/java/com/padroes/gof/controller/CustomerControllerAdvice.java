package com.padroes.gof.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.padroes.gof.exceptions.CustomerNullException;

@ControllerAdvice
public class CustomerControllerAdvice extends ResponseEntityExceptionHandler{

	@ExceptionHandler(CustomerNullException.class)
	public ResponseEntity<Object> getErrorNull(){
		Map<String, Object> body = new HashMap<String, Object>();
		body.put("message", "Null fields - Please, verify!");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
		
	}
}

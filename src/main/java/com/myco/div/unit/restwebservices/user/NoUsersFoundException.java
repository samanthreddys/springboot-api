package com.myco.div.unit.restwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoUsersFoundException extends Exception {

	public NoUsersFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


}

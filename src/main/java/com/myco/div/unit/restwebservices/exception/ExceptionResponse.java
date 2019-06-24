package com.myco.div.unit.restwebservices.exception;

import java.util.Date;

public class ExceptionResponse {
	//timestamp
	
	private Date timestamp;
	private String message,details;
	
	//Constructor
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	// Getters
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
	

}

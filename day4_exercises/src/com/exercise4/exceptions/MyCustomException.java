package com.exercise4.exceptions;

public class MyCustomException extends Exception {
	
	private String message;
	private Throwable cause;

	public MyCustomException(String message, Throwable cause) {
		//super(message,cause);
		super();
		this.message=message;
		this.cause=cause;
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Message: "+this.message+this.cause.getMessage();
	}
	
	

}

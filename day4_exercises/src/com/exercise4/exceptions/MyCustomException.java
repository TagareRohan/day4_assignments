package com.exercise4.exceptions;

public class MyCustomException extends Exception {
	
	String message;

	public MyCustomException(String message, Throwable cause) {
		super(message,cause);
		System.out.println(cause.getMessage());
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Message: "+this.message+super.getMessage();
	}
	
	

}

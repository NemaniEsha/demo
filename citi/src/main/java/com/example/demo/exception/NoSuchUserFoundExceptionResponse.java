package com.example.demo.exception;

public class NoSuchUserFoundExceptionResponse {
	private String userNotFound;

	public NoSuchUserFoundExceptionResponse(String userNotFound) {
		super();
		this.userNotFound = userNotFound;
	}

	public String getUserNotFound() {
		return userNotFound;
	}

	public void setUserNotFound(String userNotFound) {
		this.userNotFound = userNotFound;
	}

	
}

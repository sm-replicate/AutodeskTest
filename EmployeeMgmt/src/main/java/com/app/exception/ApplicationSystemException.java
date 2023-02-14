package com.app.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationSystemException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Logger log=LoggerFactory.getLogger(ApplicationSystemException.class);
	
	
	public ApplicationSystemException(String errorMessage,int errorCode,Throwable throwable) {
		super(errorMessage, throwable);
		log.error(errorMessage);
	}
	

}

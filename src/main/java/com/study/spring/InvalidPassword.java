package com.study.spring;

public class InvalidPassword  extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public InvalidPassword(String message){
		 super(message);
	 }

}

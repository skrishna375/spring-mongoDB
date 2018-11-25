package com.study.spring;

public class InvalidPhone  extends Exception {
	private static final long serialVersionUID = 1L;
	
	 public InvalidPhone(String message){
		 super(message);
	 }

}

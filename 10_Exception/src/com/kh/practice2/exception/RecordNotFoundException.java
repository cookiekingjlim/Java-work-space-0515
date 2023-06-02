package com.kh.practice2.exception;

public class RecordNotFoundException extends Exception {
	
	public RecordNotFoundException() {
		this("This is RecordnotFoundException...");
	}
	
	public RecordNotFoundException(String message) {
		super(message);
	}

}

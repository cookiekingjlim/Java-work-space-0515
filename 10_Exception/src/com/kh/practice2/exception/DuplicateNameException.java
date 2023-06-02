package com.kh.practice2.exception;

public class DuplicateNameException extends Exception{	//예외 클래스 만들기 exception 상속 받아와
	
	public DuplicateNameException() {
		this("This is DuplicateNameException...");	//본인 호출
		
	}
	public DuplicateNameException(String message) {
		super(message);	// 익셉션이 상속되어 있으므로, 이 에러가 나왔을 때 메세지를 상속할거야
	}
	
	
	
}

package com.kh.practice2;

import com.kh.practice2.exception.DuplicateNameException;
import com.kh.practice2.exception.RecordNotFoundException;

public class Application {

	public static void main(String[] args) {
		
		try {
			throw new DuplicateNameException();
		} catch(DuplicateNameException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
//		throw new DuplicateNameException();	// 에러 발생 -> 트라이 캐치로 잡아
		try {
			throw new RecordNotFoundException();
		} catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}

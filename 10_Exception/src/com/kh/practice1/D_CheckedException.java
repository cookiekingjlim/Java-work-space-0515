package com.kh.practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class D_CheckedException {

	/*
	 * CheckedException
	 * - Exception을 상속하고 있는 예외들
	 * - 컴파일 시 예외 처리 코드가 있는지 검사하는 예외
	 * - 예외 처리(try ~ catch , throws) 가 되어있지 않으면
	 *   컴파일 에러를 발생
	 * - 조건문이나 소스코드 수정으로 해결되지 않는 경우
	 *   ---> 주로 외부에 매개체와 입출력이 일어날 때 발생
	 */
	public static void main(String[] args) {
		try {
			D_CheckedException d = new D_CheckedException();
			d.method1();
		} catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public void method1() throws IOException {
		method2();
	}
	public void method2() throws IOException {
		throw new IOException();
	}
	// 뒤에 -> 파일 입출력에서 보게 될 것!
	public void method3() {
		FileInputStream/*자바에서 제공하는 클래스*/ fis = null;	//역시나 임포트 해야함!
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();	//클로즈라는 메소드 : 자원 반납하는 것
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	


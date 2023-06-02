package com.kh.practice1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class E_SubClass extends E_SuperClass {
	
//	@Override	// 오버라이드된 상황 재정의, 수퍼클래스에서
//	public void method() {
//		// 오버라이딩시, throws를 작성하지 않아도 됨!
//	}
	
//	@Override
//	public void method() throws IOException {
//		// 부모 클래스의 메서드와 같은 Exception을 throws 하는 것은 가능
//	}
//	
//	@Override
//	public void method() throws Exception {
//		//부모 클래스의 메서드보다 더 상위 타입의 Exception을 throws 하는 것은 불가능하다.
//		
//	}
	
	@Override
	public void method() throws FileNotFoundException {
		// 부모 클래스의 메서드보다 더 하위 타입의 Exception을 throws 하는 것은 가능
		
	}
	
}
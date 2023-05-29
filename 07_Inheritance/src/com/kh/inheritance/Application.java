package com.kh.inheritance;

import com.kh.inheritance.child.Notebook;
import com.kh.inheritance.child.SmartPhone;
import com.kh.inheritance.child.Tv;

public class Application {

	public static void main(String[] args) {											//실행할 거니까 메인 메소드 생성
		
		Notebook notebook = new Notebook("애플","a1111","맥북 프로 14",2790000,"M2");		//임포트 필수, 순서대로
		SmartPhone phone = new SmartPhone("삼성","s22222","S23 울트라", 1590000, "SKT");	//임포트 필수, 순서대로
		Tv tv = new Tv("LG","42LX3QKNA","올레드 Flex", 3990000, 41);						//임포트 필수, 순서대로

		System.out.println(notebook);						// 부모 클래스에 toString을 지정해서 주소값이 아님
		System.out.println(phone);
		System.out.println(tv);
	}

}

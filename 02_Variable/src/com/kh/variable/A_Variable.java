package com.kh.variable;

public class A_Variable {

	/*
	 *  변수(Variable)란?
	 *  - 하나의 값을 저장하는 "공간"
	 */
	
	public static void main(String[] args) {
	
		// 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
		A_Variable v = new A_Variable();
		
		//생성한 클래스로 메소드 실행(호출)
		v.printValue();
		
	}
	
	public void printValue() {
		
		// 변수를 사용하지 않으면
		System.out.println(10 * 2 * 3.141592); // 원의 둘레 출력 = 반지름 x 2 x 3.14159...
		System.out.println(10 * 10 * 3.141592); // 원의 넓이 = 반지름 x 반지름 x 3.141592....
		
		System.out.println("------------");
		
		// 변수를 사용하면
		int r = 10;
		double pi = 3.141592;
		
		System.out.println(r*2*pi);
		
	}
	
	public void variableTest() {
		
		/*
		 * * 변수의 선언
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 * -자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당 받을 지에 대한 정보이다.
		 * -변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우는 작업을 할 때 사용한다.
		 * 
		 * * 변수의 초기화
		 * 
		 * [표현법] 변수명 = 값(리터럴);
		 * 
		 * - 변수에 처음으로 값을 저장하는 것
		 * - '='는 오른쪽 데이터를 왼쪽의 변수에 대입(저장)하는 연산자이다.
		 */
		
		//* 기본 자료형(Primitive type)
		// 실제 값을 저장
		// 논리형: 1byte
		boolean isTrue; // <기억혀>
		isTrue = true;
		
		boolean isFalse = false;
		
		// 문자형: 2byte
		char ch = 'a'; // 문자형은 한 글자만 가능 <기억혀>
//		ch = 'ab'; //에러 발생
		
		// 정수형
		byte bNum; // 1byte(8bit): -128 ~ 127
		short sNum; // 2byte
		int iNum; // 4byte <기억혀>
		long lNum; // 8byte
		
//		bNum = 128; // 에러 발생 -> 오버플로우(Overflow)
		lNum = 922235351532L; // 숫자 뒤에 L 또는 l을 입력해야 한다.
				
		// 실수형
		float fNum; // 4byte
		double dNum; // 8byte <기억혀>

		fNum = 3.14F; // 숫자 뒤에 F 또는 f를 입력해야 한다.
		dNum = 3.14;
		
		// 참조 자료형: 4byte, 기본형을 제외한 나머지(클래스)
		// 주소값을 저장
		String name = "이한주";
		
		// 변수의 명명 규칙
		// 1) 대소문자 구분된다.
		int number;
		int NUMBER;
		int Number;
//		String number; // 자료형이 달라도 변수명이 같으면 에러 발생
		
		// 2) 숫자로 시작하면 안 된다.
//		int 1age; // 에러 발생
		int a5g4e2;
	
		// 3) 특수 문자는 '_', '$'만 사용이 가능하다.
		int _age;
		int a_g_e;
		int age$;
//		int %age; 에러 발생

		// 4) 예약어(Reserved word)를 사용하면 안 된다. = 자바에서 사용되는 네임들,,ex public, class, int....
//		int public; 에러
//		int void; 에러
//		int int; 에러
//		int class 에러
		
		//명명규칙 01)~04)는 반드시 지켜야 할 것
		
		// 5) (권장사항) 낙타표기법 (카멜케이스)
		// - 첫글자는 항상 소문자
		// - 여러 단어가 올 때는 각 단어 첫 글자를 대문자로 지정
//		int maxnumber; 가능은 하지만
//		int max_number; 가능은 하지만
//		int maxNumber; 권장사항은 이거!
		
		
	}
	
	
	public void contant() {
		/*
		 * 상수
		 * 
		 * [표현법] final 자료형 변수명;
		 * - 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
		 * - 초기화 이후에는 값을 변경할 수 없다.
		 * */
		int age; // 변수, 값 변경 가능
		age = 20;
		age = 25;
		
		final int AGE; // 상수, 무조건 대문자 표기
		AGE = 30;
//		AGE = 35; // 에러 발생
		
//		var age2 = "홍수민"; // var 키워드 사용 비추, 알아만두기
	}
}

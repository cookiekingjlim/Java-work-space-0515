package com.kh.step3.model;

public class Calculator { //모델은 실행 메소드 필요없음

	/*
	 * *메소드(method)
	 * 	- 작업을 수행하기 위한 명령문의 집합
	 * 	- 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.
	 * 	- 단, 입력받는 값이 없을 수도 있고, 결과를 돌려주지 않을 수도 있음
	 * 	- 하나의 메소드는 한 가지 기능만 수행하도록 작성하는 것을 권고
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메소드의 이름 (타입 변수명, 타입 변수명, ...) { //자료형 타입 매개변수
	 * 		// 메소드 호출시 수행될 코드
	 * 		return; 									// 결과를 돌려주는(출력)
	 * }
	 * 
	 * *return문
	 * 	- 메소드에서 return문을 만나면 종료
	 * 	- 반환값이 없는(void) 경우 return문만 사용!
	 * 	- 반환값이 있는 경우 return문 뒤에 반환값을 지정해야 함
	 * 
	 * 
	 * */
	public int a; //public int a,b; 도 가넝
	public int b;
	
	//예시) 최댓값을 구하는 메소드
	public int max() { //반환타입은 void외의 자료형이 들어감
//	----------------------------------어어 내가 한 거 개같이 망함 어어-----------------------	
//		String[] max = {"a","b"};
//		Arrays.sort(max);
//		System.out.println("최댓값 : " + max[max.length-1]);
//	----------------------------------어어 내가 한 거 개같이 망함 어어-----------------------	
		if(a>b) return a;
		return b;
		
//		return 0; //반환값. 무조건 돌려줘야 하는 것
		
	}
	
	
	/*
	 * 1.인스턴스 메소드
	 * 	- 인스턴스 생성 후, '참조변수.메소드이름()'으로 호출
	 * 	- 인스턴스 변수나 인스턴스 메소드와 관련된 작업을 하는 메소드
	 * 2. 클래스 메소드(static메소드)
	 * 	- 객체 생성 없이 '클래스이름.메소드이름()'으로 호출
	 * 	- 인스턴스 변수나 인스턴스 메소드와 관련 없는 작업을 하는 메소드
	 * 
	 * */
	public int add() {
		//더하기
		return a+b;
	}
	public int substract() {
		//빼기
		return a-b;
	}
	public static int multiply(int a, int b) { //  (매개변수), static은 인스턴스 변수 사용 못하기 때문에.
		//곱하기
		return a*b;
	}
//	public static String divide(int a, int b){
//		//나누기 -> 형태 : 몫은1, 나머지는 3
//		return "몫은" + a/b + "나머지는" + a%b;
//	}
// ---------------------아래랑 중복이라 주석처리함--------------------------------	

	public static int quotient(int a, int b) {
		return a/b;
	}
	public static int remainder(int a, int b) {
		return a%b;
	}
	
	public static String divide(int a, int b) {
		//나누기 -> 형태 : 몫은1, 나머지는 3
		return "몫은" + quotient(a,b) + "나머지는" + remainder(a,b);
		
}
	
	public int factorial(int n) {
		/*
		 *	재귀 함수(Recursion Function) 
		 *	- 메서드 내에서 자기 자신을 반복적으로 호출
		 * 	- 반복문으로 바꿀 수 있으며 반복문보다 성능이 나쁨
		 * 	- 이해하기 쉽고 간결한 코드 작성이 가능
		 * */
		
		
		/*
		 * 팩토리얼!
		 * 1! = 1          		 i=1 
		 * 2! = 2 X 1 =2		 i=2 j=1 
		 * 3! = 3 X 2 X 1 = 6    j=3 j=2 j=1
		 * 
		 * */
		
		int fac = 1;
		//코드 작성
		
//		for(int i = n; i >= 0; i--) {
//			fac *= i;
//	
//			}
//		^-----------------------뽀린 것-----------------------^
		if(n!=1) fac = n * factorial(n-1); //반복문 안쓰기 위해
		
		return 0;
			
	}
	
}

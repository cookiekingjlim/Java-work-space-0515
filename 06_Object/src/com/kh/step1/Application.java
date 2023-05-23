package com.kh.step1;

import com.kh.step1.model.Tv;

public class Application {
		/*
		 * 객체 : 실존하는 것
		 * 		사물과 같은 유형적인 것뿐만 아니라, 개념이나 논리와 같은 무형적인 것도 포함한다.
		 * 
		 * 객체 지향 프로그래밍(OOP, Objected-Oriented Programming)
		 * - 프로그램을 개발하는 기법으로 객체들을 만들고, 이러한 객체들을 연결해서 프로그램을 완성하는 기법
		 * - 객체 지향 프로그래밍 특성을 지원하는 언어를 객체 지향 프로그래밍 언어라고 한다.
		 * - 코드의 재사용성이 높고, 유지보수가 용이하다.
		 * 
		 * 객체 지향 프로그래밍의 특징
		 * 1. 추상화 : 객체들이 가진 공통의 특성들을 파악하고 불필요한 특성들을 제거하는 과정
		 * 2. 캡슐화 : 객체의 속성(필드)와 기능(메소드)를 하나로 묶고, 실제 구현 내용을 감추는 것
		 * 3. 상속 : 하나의 객체가 가지고 있는 속성(필드)와 기능(메소드)를 다른 객체가 물려받는 것
		 * 4. 다형성 : 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
		 * 
		 * 클래스 
		 * - 객체의 특성(속성, 기능)을 정의해 놓은 설계도
		 * - 객체의 속성은 필드(변수)를 통해서 정의 //나이,성별,주소 같은 것
		 * - 객체의 기능은 메소드를 통해서 정의 //행위, 걷고,먹고,자고...
		 * 
		 * 
		 * [표현법]
		 * 
		 * [접근 제한자][예약어] class 클래스명{ ... }
		 * - 클래스 이름은 작성 규칙에 따라 대문자로 시작
		 * - 파일 이름은 반드시 선언된 클래스 이름과 같도록!
		 * - 접근 제한자는 public, (default 명시하지 않는 것) 설정 가능
		 * - 클래스는 필드(Filed), 메소드(Method), 생성자(Constructor)가 정의
		 * - 클래스 작성시 객체 지향 언어의 특징 중 추상화(Abstraction), 캡슐화(Encapsulation)가 적용되어야 함
		 *
		 * 
		 * */
	
	public static void main(String[] args) { // public : 접근제한자 //------------------2)객체 생성
		
	/*
	 * 객체 생성
	 * 
	 * [표현법]
	 * 
	 * 클래스명 변수명 = new 클래스명();
	 * 
	 * -new 연산자를 사용해서 생성
	 * -new 연산자는 Heap 영역에 객체를 생성하고 개체의 주소값을 반환
	 * -객체의 주소값을 참조 타입인(클래스) 변수에 저장해서 객체 사용
	 * 
	 * */
		
		Tv tv = new Tv(); //객체 생성 = 메모리에 올라간다 = 객체의 구성 요소가 다 올라간다.(Field, Method) ----> 빨간 줄 뜸 임포트하기
		
		System.out.println("TV상태 : " + tv.power); // 밑에 초기화를 안했기때문에 false
		tv.power(); // 메소드 호출
		System.out.println("TV상태 : " + tv.power); // 호출했으니까 true
		
		System.out.println("TV채널 : " + tv.channel); // 20번
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelUp();
		System.out.println("TV채널 : " + tv.channel); //22
//		-----------------------> 추상화 과정
		
		
	}
		
}
		
		



/*
class  Tv{	//한 파일에 클래스가 여러개 올 수 있음. 단, public은 하나만 올 수 있음 //--------------------------1)클래스 생성
	//속성(property) : 멤버 변수(member variable), 특성(attribute), 필드(filed)
	boolean power; // 전원 상태(on/off)
	int channel = 20; // 채널
	
	//기능(function) : 함수, 메소드(method)
	void power() { //TV를 켜거나 끄는 기능 //power = power true 키는 것
		power = !power;
		}
	void channelUp() {//TV의 채널을 높이는 기능
		++channel;
	} 
	void channelDown() {//TV의 채널을 낮추는 기능
		--channel;
		}
}
*/

//--------------------------------------------------------->3)클래스를 분리하기, model 패키지 -> tv클래스 새로 생성, 메인 메소드 아래에 tv 임포트해주고
//															tv 클래스에서 public 붙여주면 일단 분리 완
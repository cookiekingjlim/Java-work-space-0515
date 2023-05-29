package com.kh.inheritance.child; //child 기존 model과 동일

import com.kh.inheritance.parent.Product;

/*
 * 상속
 * 
 * [표현법]
 * 
 * [접근제어자] class 자식클래스 extends 부모클래스{			//접근제어자는 있을 수도 있고 없을 수도 있음
 * 
 *			//멤버변수
 *			//생성자
 *			//메서드
 * 
 * }
 * 
 * 상속의 장점
 * - 적은 양의 코드로 새로운 클래스 작성이 가능 = 공통적인 걸 빼버리니까
 * - 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이
 * - 코드의 중복을 제거하여 프로그램의 생산성과 유지 보수에 크게 기여
 * 
 * 상속의 특징
 * - 클래스 간의 상속은 단일 상속만 가능 = 클래스 하나만 상속 가능 즉 부모 클래스가 하나만!
 * - 명시되어 있지 않아도 모든 클래스는 Object 클래스를 상속
 * 	-> Object 클래스에서 제공하는 메소드들을 오버라이딩하며 메서드 재정의가 가능	
 * -부모 클래스의 생성자, 초기화 블록은 상속되지 않는다.
 * 	-> 자식 클래스 생성 시에 부모 클래스 생성자가 먼저 실행
 * - 부모의 private 멤버는 상속이 되지만 직접 접근이 불가능
 * 	-> Getter / Setter 사용해서 간접적으로 접근
 * */

public class Notebook extends Product { // public class Notebook extends Object가 생략되어 있는 것, 임포트 해줘야

//	private String brand;				//공통적인 것 빼줘야
//	private String pCode;
//	private String name;
//	private int price;
	private String cpu;

	public Notebook() {} // 생성자
	

	public Notebook(String brand, String pCode, String name, int price, String cpu) {		//부모 클래스에서 지정했던 멤버변수 데려옴, cpu까지 담아줘야함
//		super(brand, pCode, name, price);
		
		//부모 멤버 변수 초기화 할 수 있는 방법
		//super : 패당 객체의 부모의 객체의 주소를 담고 있음
		
		/* 1. super. 을 통해서 부모의 멤버변수에 직접 접근
		super.brand = brand; 	// 부모가 private - 직접 접근할 수 없음!
		super.pCode = pCode; 	// 부모가 default - 직접 접근할 수 없음 & 단, 자식과 부모가 같은 패키지 안에 있으면 직접 접근 가능
		super.name = name; 		// 부모가 protected - 상속 관계일 때 자식 객체에서 직접 접근이 가능
		super.price = price; 	// 부모가 public - 어디서든 접근이 가능!
		*/
		
		/*
		 * 2. 부모의 Setter 메서드롤 호출해서 초기화
		 * 	- 부모 클래스에서 setter 메서드를 제공하면 자식 객체에서 부모의 setter 메서드를 통해서 필드의 초기화가 가능
		 * */
		
		/*아래 방법 다 유호
		super.setBrand(brand);
		this.setpCode(pCode);
		setName(name);
		setPrice(price);
		*/
		
		//3. 부모 생성자 호출해서 초기화
		super(brand,pCode,name,price); // super(); 부모생성자 호출, 제일 자주 쓰이는 방법
		this.cpu = cpu;
		
	}


	@Override
	public String toString() {
		return super.toString() + "Notebook [cpu=" + cpu + "]";				//super.toString() 부모에 있는 투스트링을 가져온다
	}
	
}


package com.kh.example.practice4.model;

	// 캡슐화 원칙에 따라 작성
	
public class Snack {
	//멤버 변수는 원칙에 따라 private으로!
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	
	/*
	 * 생성자
	 * 객체(클래스랑 비슷) 생성할 때 : Snack snack = new Snack();
	 * 
	 * */
	
	//기본 생성자, 멤버 변수가 곽 채워지면 나중에 인식 못해--->세터,게터 사용때문에-->기본, 곽곽 채워진 거 둘 다 만들어야
	public Snack() {
	}

	//멤버 변수로 지정한 것->매개변수로 받아 데려온 것....??? 
	//세터나 매개변수로도 값을 가져올 수 있지만 세터를 추천! 매개변수는 매번 생성을 해줘야하기 때문에
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	
	
	/*
	 * Getter / Setter
	 * - Getter : 멤버 변수의 값을 호출하는 메서드
	 * 
	 * public 멤버변수에서 기존 지정한 자료형 getXXX(){ 			//메소드는 소문자로 시작하므로 getXXX, getter는 값을 호출하므로 매개변수가 필요한 것 아님
	 * 		return 멤버 변수에서 지정한 자료형에 해당하는 값;
	 *  }
	 *  
	 * - Setter : 멤버 변수의 값을 변경시키는 메서드
	 * 
	 * public void setXXX(멤버 변수에서 지정한 자료형 변수명){		//바깥에서 클래스한테 값을 넣는 것이니까 매개변수를 받는 것 그러므로 void, 변수명은 자유로움
	 * 		this.변수명 = 변수명;				//this 변수명은 이 변수라는 걸 말하는 것(현재 위치) -> 7~에 입력한 변수들 불러오는 것
	 *  }
	 * 
	 * */

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	/*
	 * 모든 클래스의 가장 최상위 클래스 : Object(말 그대로 객체)
	 * 즉, 모든 클래스는 Object 클래스를 부모 클래스로 "상속" 받아서 사용하고 있음
	 * toString은 Object가 가지고 있는 메소드
	 * 			-> 부모 클래스가 가지고 있는 메소드는 전부 사용 가능하다!
	 * @Override : 부모 클래스의 메소드를 재정의 하는 것!
	 * 
	 * */
	@Override
	public String toString() {
		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]";
	}
	
	
	
	

}

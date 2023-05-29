package com.kh.composite;

/*
 *클래스 간의 관계 : 상속 vs 포함
 *	- 상속 관계 : ~은 ~이다.(is-a 관계) 
 *	- 포함 관계 : ~은 ~을 가지고 있다.(has-a 관계)	
 *	- 자바는 단일 상속만 허용한다. -> extends xxx가능, xxx불가(2개라서) ->이럴 때는 가장 근접한 것을 상속 나머지는 포함관계로
 *	- 클래스 간의 관계를 많이 맺을수록 재사용을 높이고 관리하기 쉽다.
 * */

public class Customer extends Object {		//shift + F2 문서정보 확인 가능

	//속성, 멤버변수부터 뽑아보자
	protected String name; // 고객 이름
	protected String grade; // 고객 등급
	protected int bonusPoint; // 보너스 포인트
	protected double bonusRatio; // 보너스 적립 비율
	
	Product product;				//이것만 추가하면 포함 관계!---------------------------------------------------------------
	
	public Customer() {}

	public Customer(String name) { // 생성자 쓰기 편하게 맞춰놓은 것
		this.name = name;
		this.grade = "Silver"; // 기본등급 지정
		this.bonusRatio = 0.01; // 포인트 기본 적립 비율
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	@Override //<--@:애노테이션!, '이 메소드는 재정의된 메소드이다.'라고 컴파일러에 명확히 알려주는 역할. 여기서는 이거 지정해도 되고 아니어도 돼 
	public boolean equals(Object obj) {		//고객 이름 동일하면 같은 사람이라고 지정위해
		Customer c = (Customer) obj; // 이건 바로 다음에 배울 '다형성'! 객체를 변화시키는 것 일종의 형변환 같은...
		return this.name == c.name; // 이름이 같으면 같은 사람이라고 재정의
	}
	
	public int calcPrice(int price) {		//고객한테 가격을 받아서 포인트 적립하고 할인율 계산하는 고런 메소드,,
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price;		//가격은 그대로 할인율이 없으니까
	}
	
	
	
}

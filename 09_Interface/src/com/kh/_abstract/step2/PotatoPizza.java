package com.kh._abstract.step2;

public class PotatoPizza extends Pizza{
	
	public PotatoPizza(int price, String storeName) {
//		super(price, storeName);	//->super : 부모 클래스 생성자 호출 멤버 변수 protected, 아래와 같이도 쓸 수 있음 
		this.price = price;
		this.storeName = storeName;
	}

	@Override
	public void topping() {
		System.out.println("Potato Topping ...");
	}

}

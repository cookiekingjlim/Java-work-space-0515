package com.kh._abstract.step2;

public abstract class  Pizza {		//-> 피자 만들기,,,
	
	protected int price;
	protected String storeName;
	
	public Pizza() {}
	public Pizza(int price, String storeName) {
		this.price = price;
		this.storeName = storeName;
	}
	
	public void makePizza() { 	//->추상클래스에는 일반 메소드에도 들어갈 수 있어
		System.out.println(toString());
		dough();
		topping();
		bake();
		cut();
		box();
		System.out.println();
	}
	
	public void dough() {
		System.out.println("피자 반죽과 함꼐 도우를 빚다");
	}
	
	public abstract void topping(); 	//->각각의 자식 클래스에서 다른 부분만 추상클래스로...?

	
	public void bake() {
		System.out.println("피자를 180도에서 10분간 구워냅니다.");
	}
	
	public void cut() {
		System.out.println("피자를 8등분으로 자릅니다.");
	}
	
	public void box() {
		System.out.println("피자 boxing....");
	}
	@Override
	public String toString() {
		return "Pizza [price=" + price + ", storeName=" + storeName + "]";
	}

}




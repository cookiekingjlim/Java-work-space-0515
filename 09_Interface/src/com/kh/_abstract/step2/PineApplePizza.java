package com.kh._abstract.step2;

public class PineApplePizza extends Pizza {
	
//	public PineApplePizza() {} -> 이건 필요없어.....왜.....?

	public PineApplePizza(int price, String storeName) {
		super(price, storeName);
	}

	@Override
	public void topping() {
		System.out.println("PineApple Toppling...");
	}

}

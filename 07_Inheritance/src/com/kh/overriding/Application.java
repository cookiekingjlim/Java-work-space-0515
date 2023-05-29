package com.kh.overriding;

import com.kh.overriding.model.Customer;
import com.kh.overriding.model.VIPCustomer;

public class Application {

	public static void main(String[] args) {

		Customer customer1 = new Customer("홍수민");
		Customer customer2 = new Customer("신수민");			//같은 이름을 가진 고객
		
		System.out.println(customer1);
		System.out.println(customer2);
		
		System.out.println(customer1.equals(customer2));
		
		VIPCustomer customer3 = new VIPCustomer("최승환");		//이퀄스를 커스토머에서 재정의, 브이아이피에서는 재정의 안 함
		VIPCustomer customer4 = new VIPCustomer("최승환");
		
		System.out.println(customer3.equals(customer4)); 		//true, customer에서 받은 클래스를 VIP에서 상속 받아 사용한 것
		
		System.out.printf("%s님의 등급은 %s이며, " + "지불해야 하는 금액은 %d이며, " + "적립된 포인트는 %d점입니다.\n",
							customer2.getName(), customer2.getGrade(), customer2.calcPrice(1000), customer2.getBonusPoint());
		System.out.printf("%s님의 등급은 %s이며, " + "지불해야 하는 금액은 %d이며, " + "적립된 포인트는 %d점입니다.\n",
							customer4.getName(), customer4.getGrade(), customer4.calcPrice(1000), customer4.getBonusPoint());
		
		
		
		
		
	}

}

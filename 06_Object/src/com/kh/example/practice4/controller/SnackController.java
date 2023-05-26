package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack; 					// 위치 확인하는 게 좋아

public class SnackController { //클래스의 구조는 다 똑같아 멤버변수->생성자->메소드
	
	// 멤버변수 -> 보통 모델로 만들어 놓은 클래스가 온다!
	Snack snack = new Snack();
	
	//생성자
	public SnackController() {} 		// 기본 생성자 명시, 안해도 되지만 습관처럼 작성~
	
	//메소드
	//데이터를 setter를 이용해 저장하고 
	//저장되었다는 결과를 반환하는 메소드
	public boolean saveData(Snack viewSnack) { //뷰에서 가져온 스낵(바깥에서 가져온 스낵) //snack viewSnack은 생성자 매개변수로 받아야 할 때도 많음
		//snack은 controller에서 만든 임시 데이터 창고(8번줄)
		//viewSnack은 Application에서 데이터를 담은 임시 데이터 창고(매개변수가 가져오는 역할을 한 것)
//		String kind = viewSnack.getKind();      		21번줄이랑 동일한 표현법
//		snack.setKind(kind);
		snack.setKind(viewSnack.getKind());
		snack.setName(viewSnack.getName());
		snack.setFlavor(viewSnack.getFlavor());
		snack.setNumOf(viewSnack.getNumOf());
		snack.setPrice(viewSnack.getPrice());
//		this.snack.setKind(kind);---------> 쓰기도 해
		
		return true;
	}
		
	//controller에 저장된 데이터를 반환하는 메소드(바깥으로 보내주는 것)
	public Snack confirmData() {
		return this.snack; //this 쓰나 안쓰나 똑같음
		
	}

}


package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

/*
 * controller : 사용자가 화면에서 요청한 부분을 처리하는 기능 담당
 * 이때 처리 후에 결과를 여기서 출력하는 게 아니라 결과값을 다시 view(run)에 반환하여 view에서 처리하도록 해야함
 * 
 * */

public class SnackController {
	/*안에서만 쓸 거니까*/private Snack s = new Snack();
	
	public SnackController() {}
	
	
	//기능은 메소드로 빼
	//데이터를 setter를 이용해 저장하고 저장 되었다는 결과를 반환하는 메소드
	public boolean saveData(Snack s) { //저장하는 거니까 세이브데이터, (매개변수) 써서 가져와야하는데..---> 객체 가져오면 돼 객체 필요

		this.s.setKind(s.getKind());
		this.s.setName(s.getName());
		this.s.setFlavor(s.getFlavor());
		this.s.setNumOf(s.getNumOf());
		this.s.setPrice(s.getPrice());
		
		return true;
	} //.s. 저장된 것
	
	//저장된 데이터를 반환하는 메소드
	public Snack confirmData() { //유튜브에서 비디오 하듯이
		return this.s; 
	}
}

package com.kh.practice;

public class IPhone14Pro extends SmartPhone implements Pen {	//순서는 항상 상속받는 extends가 먼저 오고 그 이후에 implements가 옴
	
	String name = "IPhone 14 Pro";
	String brand = "애플";
	public IPhone14Pro() {}

	public void printInformation() {
		super.printInformation(name, brand); //스마트폰에 작성한 것 가져오는 거
		System.out.println("펜 탑재 여부 : " + pen());
	}

	@Override
	public boolean pen() {
		return false;
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화 버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "4800만 화소 카메라";
	}
	
	
}

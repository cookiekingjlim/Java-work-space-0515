package com.kh._interface.step1;

public class Bus implements Vehicle{ //클래스가 인터페이스를 가져오려면,,,임플먼트

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	} 

}

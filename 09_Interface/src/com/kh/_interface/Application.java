package com.kh._interface;

import com.kh._interface.step1.Bus;
import com.kh._interface.step1.Taxi;
import com.kh._interface.step1.Vehicle;
import com.kh._interface.step2.Advanced;
import com.kh._interface.step2.Beginner;
import com.kh._interface.step2.Player;
import com.kh._interface.step2.Super;
import com.kh._interface.step3.Audio;
import com.kh._interface.step3.Television;

/*
 * 인터페이스(interface)
 * 
 * [표현법]
 * 
 * [접근제어자] interface 인터페이스명 { ... }
 * 
 * 	- 인터페이스는 개발 코드와 객체가 서로 통신하는 접점 역할
 * 	- 인터페이스에서 필드는 무조건 상수 필드 -> 상수: 바뀌지 않는 값들
 * 	- 인터페이스에서 메서드는 무조건 추상 메서드만 올 수 있다.
 * 	- 객체가 구현해야 하는 기능이 있을 때 인터페이스에 추상 메서드를 추가해서 객체가 기능을 구현하도록 만듦
 * 	- 인터페이스를 구현하려면 implements 키워드를 사용해서 구현
 * 	- 인터페이스는 다중 상속(구현)을 허용한다.
 * 	- 추상 클래스와 다르게 좀 더 강한 규칙성, 강제성을 가지는 것이 인터페이스! -> 추상클래스보다 인터페이스를 더 자주 사용!
 * 
 * * extends와 implements
 * 	- 클래스 간에 상속 관계일 때 : 자식 클래스명 extends 보무 클래스명
 * 	- 클래스와 인터페이스의 구현 관계일 때 : 구현 클래스명 implements 인터페이스명, 인터페이스명,....
 * 	- 인터페이스 간에 상속 관계일 때 : 인터페이스명 extends 인터페이스명, 인터페이스명,.... -> 다중 상속 가능
 * 
 * 추상 클래스 : 미완성 설계도 추상 메서드가 포함되어 있으면서 기본 메서드들이 있는..
 * 인터페이스 : 기본 설계도 -> 대충 스케치만 그린 듯한,,,
 * 
 * */

public class Application {

	public static void main(String[] args) {

//		Vehicle v = new Vehicle();  <--인터페이스 객체 생성 X
		Vehicle bus = new Bus();	//변수 형태로는 쓸 수 있음
		Vehicle taxi = new Taxi();
		
		bus.run();
		taxi.run();
		
		Player[] players = {new Beginner(), new Advanced(), new Super()};
		for(Player player : players) {
			player.showLevelMessage();
			player.run();
			player.jump();
			player.turn();
}
		System.out.println();
		
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(-1);
		tv.turnOff();
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolume(20);
		audio.turnOff();
	}

}

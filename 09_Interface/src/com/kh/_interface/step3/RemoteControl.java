package com.kh._interface.step3;

public interface RemoteControl extends Searchable, Volume {	// 인터페이스는 다중 상속 가능

	void turnOn();
	void turnOff();
	
}

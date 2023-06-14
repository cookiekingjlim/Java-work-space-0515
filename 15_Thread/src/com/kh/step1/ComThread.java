package com.kh.step1;
/*
 * 스레드 생성 방법
 * 1. Thread 클래스를 상속받는 방법
 * 	- Thread 클래스를 상속 후에 run() 메서드를 오버라이딩
 * 	- Thread 클래스를 상속한 자식 클래스를 생성 후 start() 메서드를 호출
 * */
public class ComThread extends Thread {	//Thread도 자바 클래스 중 하나
	
	public ComThread(String name) {
		super(name);
	}

	// 스레드가 작동하는 부분
	public void run() {
		
		/*
		 * sleep(): 지정된 시간동안 스레드를 멈추게 하는 것
		 * sleep()에 의해 일시정지 상태가 된 스레드는 지정된 시간이 다 되거나 interrupt()가 호출되면 InterruptedException이 발생되어 잠에서 깨어나 실행 대기.
		 * */
		for(int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);	//1초
			} catch (InterruptedException e) {	//-> 1000번 돌아갈 동안
//				e.printStackTrace(); -> 할 필요 없으므로 지워지워
			}
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread :: " + name + ", " + i );
		}
	}
}

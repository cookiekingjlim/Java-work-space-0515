package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadAnswer2 {
	
	boolean inputCheck = false;

	public static void main(String[] args) {
		
		InputThreadTest2 process = new InputThreadTest2();
		
		Thread t2 = new Thread(new InputThread(process));
		Thread t = new Thread(new CountThread(process));
		t.start();
		t2.start();
	}
	
}

class InputThread implements Runnable{
	InputThreadTest2 process;
	InputThread(InputThreadTest2 process);
	this.process = process;

	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요....");
		System.out.println("입력하신 숫자는" + input + "입니다.");
		
		process.inputCheck = true;
	}
	
}

class CountThread implements Runnable{

	InputThreadTest2 process;
	
	CountThread(InputThreadTest2 process){
		this.process = process;
	}
	
	@Override
	public void run() {
		for(int i = 10; i>0; i--) {
			try {
				if(Process.inputCheck)
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
	}
	}
}
}


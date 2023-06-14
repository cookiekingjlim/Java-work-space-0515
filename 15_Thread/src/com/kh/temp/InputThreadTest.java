package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {
		
		InputThread it = new InputThread();
		InputThread1 it1 = new InputThread1();
		
		Thread itThread = new Thread(it, "InputThread");
		Thread it1Thread = new Thread(it1, "InputThread1");
		
		itThread.start();
		it1Thread.start();
		
		
	}

}

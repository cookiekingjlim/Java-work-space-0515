package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();			//난 이거 메인 메소드에 썼었어......떼잉.....
	private RectangleController rc = new RectangleController();
	
	public static void main(String[] args) {
		
		Application app = new Application();		//메인 메뉴 호출을 위한 필수
		app.mainMenu();			//메인 메뉴 호출
	}

	public void mainMenu() {
		
		boolean check = true;
		while(check) {
			
			System.out.println("=====메뉴=====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			switch(Integer.parseInt(sc.nextLine())) {			//입력 받은 걸 비교할테니까
			
			case 1:						// 써클메뉴로 가는 것
				this.circleMenu();
				break;
			case 2:						// 렉팅클 메뉴로 가는 것
				this.rectangleMenu();
				break;
			case 9:
				check = false;
				System.out.println("종료합니다");
				break;
				
			
			}
		}
		
	}
	
	public void circleMenu() {
	
		System.out.println("=====원 메뉴=====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		switch(Integer.parseInt(sc.nextLine())) {			
		
		case 1:						
			this.calcCircum();
			break;
		case 2:						
			this.calCircleArea();
			break;
		case 9:
			break;
		}
	}
	
	public void rectangleMenu() {
		System.out.println("=====사각형 메뉴=====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		switch(Integer.parseInt(sc.nextLine())) {			
		
		case 1:						
			this.calcPerimeter();
			break;
		case 2:						
			this.calcRectArea();
			break;
		case 9:
			break;
		}
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x =Integer.parseInt(sc.nextLine());
		
		System.out.print("y 좌표 : ");
		int y =Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름 : ");
		int radius =Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcCirum(x, y, radius));				// 출력은 이렇게 넘기는 것
	}
	
	public void calCircleArea() {
		System.out.print("x 좌표 : ");
		int x =Integer.parseInt(sc.nextLine());
		
		System.out.print("y 좌표 : ");
		int y =Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름 : ");
		int radius =Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcArea(x, y, radius));	
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x =Integer.parseInt(sc.nextLine());
		
		System.out.print("y 좌표 : ");
		int y =Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 : ");
		int height =Integer.parseInt(sc.nextLine());
		
		System.out.print("너비 : ");
		int width =Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.CalcPerimeter(x, y, height, width));	
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x =Integer.parseInt(sc.nextLine());
		
		System.out.print("y 좌표 : ");
		int y =Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 : ");
		int height =Integer.parseInt(sc.nextLine());
		
		System.out.print("너비 : ");
		int width =Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcArea(x, y, height, width));	
	}
	

}

package com.twitter;

import java.lang.ModuleLayer.Controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.twitter.controller.UserController;
import com.twitter.model.User;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private UserController uc = new UserController();
	
	public static void main(String[] args) {
		Application app = new Application();
		app.signUp1(); //확인용 호출
		app.signUp2();
	}
	
	public void signUp1() {
		System.out.println("계정을 생성하세요");
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("휴대폰 번호: "/*또는 이메일*/);
		String phoneNumb = sc.nextLine();
		
		System.out.print("생년월일(예: 20230615): ");
		String birth = sc.nextLine();
		
		
		
	}

	public void signUp2() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
	
		
	}
}

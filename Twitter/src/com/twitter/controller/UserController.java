package com.twitter.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

import com.twitter.model.User;

public class UserController {
	
	HashMap<String, User> user = new HashMap<>();		
	
	//회원가입->이름, 휴대폰 번호나 이메일, 생년월일 ->아이디 입력 ->은 걍 편하게 바꾸자^^!
	//회원가입->구글,애플로 가입->생년월일 입력
	public void signUp1(String id, String phoneNumb, String password, String birth, String name) {
		user.put(id, new User(phoneNumb, password , birth, name));
		if(!user.containsKey(phoneNumb)) {
			user.put(id, );
			return true;
	
	}
		return false;
	
	
	public boolean login(String id, String password) {
		return false;
	}
	
	public User viewProfile() {
		
		return null;
	}
	
	public User updateProfile(User user) {
		
		return null;
	}
	
	public void deleteProfile(String id) {
		
	}

		
	}
	
	
	
	


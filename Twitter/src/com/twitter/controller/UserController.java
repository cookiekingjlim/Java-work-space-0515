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
	
	//회원가입->이름, 휴대폰 번호나 이메일, 생년월일 ->아이디 입력
	//회원가입->구글,애플로 가입->생년월일 입력
	public void signUp1(Map<String, String> user) {
		String name = user.get("이름");
		String phoneNumb = user.get("휴대폰 번호");
		String birth = user.get("생년월일");
	}
	
	//핸드폰 인증해서 동일한 번호가 없으면 아이디랑 비번 생성;;
	public boolean signUp2(String phoneNumb, String id,User u) {
		if(!user.containsKey(phoneNumb)) {
			user.put(id, u);
			return true;
		}
		return false;
	}
	
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
	
	
	
	


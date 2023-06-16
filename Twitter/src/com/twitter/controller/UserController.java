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
	
//	User user = null;
	HashMap<String, User> user = new HashMap<>();		
	
	//회원가입->이름, 휴대폰 번호나 이메일, 생년월일 ->아이디 입력 ->은 걍 편하게 바꾸자^^!
	//회원가입->구글,애플로 가입->생년월일 입력
	public void signUp(String id, String phoneNumb, String password, String birth, String name) {
		if(!user.containsKey(id)) {
			user.put(id, new User(phoneNumb, password , birth, name));
		}
	}
	
	public boolean login(String id, String password) {
			
		if(user.containsKey(id) && user.get(id).getPassword().equals(password)) {
			 return true;
		}
		
		return false;
	}
	
	public User viewProfile(String id) { //프로필,,,꼭 봐야겟니,,,,
		if(user.containsKey(id)) {
		return user.get(id);
	}
		return null;
	}
	
	//로그인 된 경우 ->패스워드 입력-> 프로필 수정,,꼭 해야겟니,,,,
	//프로필 수정: 비밀번호 변경, 자기소개 입력, 프로필 사진(안해)
	public boolean updateProfile(String id) {
		if(!user.containsKey(id)) {
		}
		return false;
}
	

	
	public void deleteProfile(String id) {
		if(user.get(id).equals(id)) {
			user = null;
		}
	}

		
	}
	
	
	
	


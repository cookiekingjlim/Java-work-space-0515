package com.twitter.model;

import java.util.List;
import java.util.Objects;

public class User {
	
	private String name;
	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private String birth;	// 생년월일
	public User() {
	}
	public User(String phone, String password, String birth, String name) {
		this.phone = phone;
		this.password = password;
		this.birth = birth;
		this.name = name;
	
	}
	
}


	
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
	
	public User() {}
	
	public User(String phone, String password, String birth, String name) {
		this.phone = phone;
		this.password = password;
		this.birth = birth;
		this.name = name;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password
				+ ", nickName=" + nickName + ", birth=" + birth + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birth, email, id, name, nickName, password, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(birth, other.birth) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(nickName, other.nickName)
				&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone);
	}


	
	
	
}


	
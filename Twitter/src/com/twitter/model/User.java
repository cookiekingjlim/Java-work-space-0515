package com.twitter.model;

import java.util.List;
import java.util.Objects;

public class User {
	
	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private char gender;
	private String birth;	// 생년월일
	private String idNumb;	//개인주소??@7d7fgg이런 주소가 있던데..?
	
	private List<Video> videos;
	
	public User() {
	}

	public User(String email, String phone, String id, String password, String nickName, char gender, String birth,
			String idNumb, List<Video> videos) {
		super();
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.gender = gender;
		this.birth = birth;
		this.idNumb = idNumb;
		this.videos = videos;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getIdNumb() {
		return idNumb;
	}

	public void setIdNumb(String idNumb) {
		this.idNumb = idNumb;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password + ", nickName="
				+ nickName + ", gender=" + gender + ", birth=" + birth + ", idNumb=" + idNumb + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birth, email, gender, id, idNumb, nickName, password, phone);
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
		return Objects.equals(birth, other.birth) && Objects.equals(email, other.email) && gender == other.gender
				&& Objects.equals(id, other.id) && Objects.equals(idNumb, other.idNumb)
				&& Objects.equals(nickName, other.nickName) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone);
	}
	
	
	
}

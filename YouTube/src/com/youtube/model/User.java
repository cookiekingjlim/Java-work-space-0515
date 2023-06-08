package com.youtube.model;

import java.util.List;

public class User { //아이디.비번...

	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private char gender;

	private List<Video> videos;
	
	//사용자가 비디오를 가지는 포함관계
	
	}
	
	
	
	
	
/*	
	//Create(추가) Read(목록 보여주기 하나만 보여주기) Update(수정) Delete
	public boolean login(){//로그인, 로그인 됐냐 아니냐니까 불리언 처리 인트로도 받긴함
		return false;
	}
	public boolean signUp(){//회원가입 
		return false;
	}
	public User viewProfile(){//프로필 보기, user 아직 안 배움 이게 뭐람
		return null;
	}
	public User updateProfile(){//프로필 수정 바뀐 데이터를 넘겨줘야 하므로..?
		return null;
	}
	public boolean deleteProfile(){//계정 삭제
		return false;
	}
*/
	


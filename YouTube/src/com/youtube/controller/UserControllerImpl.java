package com.youtube.controller;

import com.youtube.model.User;

public interface UserControllerImpl {

	
	public boolean login();
	public boolean signUp();//회원가입 
	public User viewProfile();//프로필 보기, user 아직 안 배움 이게 뭐람
	public User updateProfile();//프로필 수정 바뀐 데이터를 넘겨줘야 하므로..?
	public boolean deleteProfile();//계정 삭제
}


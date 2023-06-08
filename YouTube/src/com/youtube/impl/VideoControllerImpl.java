package com.youtube.controller;

import com.youtube.model.Video;

public interface VideoControllerImpl {	//내가 만들 기능들을 정리하고 

	public Video upload();	//영상 업로드 //정보가 넘어가서 비디오가 보여져
	public Video[] videoList();//영상 목록 // 비디오 배열^^...
	public Video viewVideo();//영상 1개 보기
	public Video updateVideo();//동영상 수정
	public boolean deleteVideo();//동영상 삭제
	
}

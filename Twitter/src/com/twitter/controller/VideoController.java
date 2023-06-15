package com.twitter.controller;

import java.util.ArrayList;

import com.twitter.model.Video;

public class VideoController {
	
	//트위터에 영상 업로드 할 때 리스트가 필요할까...?
//	VideoController vc = new VideoController();
	ArrayList<Video> videoList = new ArrayList<>();
	
	//영상 업로드
	public void uploadVideo(Video video) {	
		videoList.add(video);
	}
	// 영상 수정..?
	// 영상 한 개 보기
	public Video viewVideo(int index) {
		return videoList.get(index);
	}
	
	// 영상 삭제하기
	public boolean deleteVideo(Video video) {
		return videoList.remove(video);
	}
}

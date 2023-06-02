package com.youtube.controller;

import com.youtube.model.Video;

public class VideoController {

	Video[] videoList = new Video[5];	
	int index = 0;
	
	public void upload(Video video) {	// 영상 업로드
		videoList[index++] = video;
	}

	public Video[] videoList() {
		return videoList;
	}

	public Video viewVideo(int index) {	// 동영상 1개 보기
		return videoList[index];
	}

	public void updateVideo(int index, Video video) {	//어떤 동영상인지 체크해야하니 index, 비디오
		videoList[index] = video;
	}

	public boolean deleteVideo() {
		return false;
	}



	
}

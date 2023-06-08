package com.youtube.controller;

import java.util.ArrayList;

import com.youtube.model.Video;

public class VideoController {

	ArrayList<Video> videoList = new ArrayList<>();
	
	public void upload(Video video) {	// 영상 업로드
		videoList.add(video);
	}

	public ArrayList<Video>videoList() {
		return videoList;
	}

	public Video viewVideo(int index) {	// 동영상 1개 보기
		return videoList.get(index);
	}

	public void updateVideo(int index, Video video) {	//어떤 동영상인지 체크해야하니 index, 비디오
		videoList.set(index, video);
	}

	public boolean deleteVideo(Video video) {
		return videoList.remove(video);
	}



	
}

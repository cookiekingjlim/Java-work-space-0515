package com.youtube.model;

import java.util.Date;

public class Video {

	public String title;
	public String comment;
	public Date uploadAt; //자바.유틸 임포트
	public int count;
	public String imgUrl; //이미지는 따로 저장하는 곳이 있으니까
	public String fileUrl;
	
	//Create(추가) Read(목록 보여주기 하나만 보여주기) Update(수정) Delete
	
	public void upload() {	//영상 업로드
	}
	public void videoList(){//영상 목록
	}
	public void viewVideo(){//영상 1개 보기
	}
	public void updateVideo(){//동영상 수정
	}
	public void deleteVideo(){//동영상 삭제
	}

	
}

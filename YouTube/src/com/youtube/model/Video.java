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
	
	public Video upload() {	//영상 업로드 //정보가 넘어가서 비디오가 보여져
		return null;
	}
	public Video[] videoList(){//영상 목록 // 비디오 배열^^...
		return null;
	}
	public Video viewVideo(){//영상 1개 보기
		return null;
	}
	public Video updateVideo(){//동영상 수정
		return null;
	}
	public boolean deleteVideo(){//동영상 삭제
		return false;
	}

	
}

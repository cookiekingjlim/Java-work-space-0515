package com.youtube.model;

import java.util.Date;
import java.util.List;

public class Video {

	private String title;
	private String comment;
	private Date uploadAt; //자바.유틸 임포트
	private int views;
	private String imgUrl; //이미지는 따로 저장하는 곳이 있으니까
	private String fileUrl;
	private String desc; // 설명
	private char kind; // shorts & video 둘 중 하나!
	
	private List<Comment>comments;	// 코멘트는 여러개가 올 수 있으니까 List로...?
	private Category category;
	
	//Create(추가) Read(목록 보여주기 하나만 보여주기) Update(수정) Delete
	
/*	public Video upload() {	//영상 업로드 //정보가 넘어가서 비디오가 보여져
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
	--------------------------------------controller에 넘겨

*/	
}

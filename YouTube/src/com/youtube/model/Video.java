package com.youtube.model;

import java.util.Date;

public class Video {

	private String title;
	private String comment;
	private Date uploadAt; //자바.유틸 임포트
	private int count;
	private String imgUrl; //이미지는 따로 저장하는 곳이 있으니까
	private String fileUrl;

	public Video() {
	}

	public Video(String title, String comment, Date uploadAt, int count, String imgUrl, String fileUrl) {
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.count = count;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + "]";
	}
	
	
	
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

package com.twitter.model;

public class Video {
	
	private String title;
	private String desc;
	private int views;
	private String imgUrl;	// 썸네일? 미리보기
	private String fileUrl;	//비디오 파일
	
	public Video() {
	}

	public Video(String title, String desc, int views, String imgUrl, String fileUrl) {
		this.title = title;
		this.desc = desc;
		this.views = views;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
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
		return "Video [title=" + title + ", desc=" + desc + ", views=" + views + ", imgUrl=" + imgUrl + ", fileUrl="
				+ fileUrl + "]";
	}
	
	

}

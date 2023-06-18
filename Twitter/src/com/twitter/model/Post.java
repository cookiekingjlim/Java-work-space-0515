package com.twitter.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Post {
	
	private User user; // User 정보 받기
	private Video video;
	
	private String userNickName;
	private String userId;
	private String postId;	//게시글 고유 식별 코드
	private String postContent;	// 게시글 내용
	private Date date;
	private String imgUrl;
	private String fileUrl;
	private int views;	//조회수
	private int retweet; //리트윗 수
	private String hashTag;
	private String mention; //@
	private int like;
	
	public Post() {}

	public Post(User user, Video video, String userNickName, String userId, String postId, String postContent,
			Date date, String imgUrl, String fileUrl, int views, int retweet, String hashTag, String mention,
			int like) {
		super();
		this.user = user;
		this.video = video;
		this.userNickName = userNickName;
		this.userId = userId;
		this.postId = postId;
		this.postContent = postContent;
		this.date = date;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.views = views;
		this.retweet = retweet;
		this.hashTag = hashTag;
		this.mention = mention;
		this.like = like;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getRetweet() {
		return retweet;
	}

	public void setRetweet(int retweet) {
		this.retweet = retweet;
	}

	public String getHashTag() {
		return hashTag;
	}

	public void setHashTag(String hashTag) {
		this.hashTag = hashTag;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	@Override
	public String toString() {
		return "Post [user=" + user + ", video=" + video + ", userNickName=" + userNickName + ", userId=" + userId
				+ ", postId=" + postId + ", postContent=" + postContent + ", date=" + date + ", imgUrl=" + imgUrl
				+ ", fileUrl=" + fileUrl + ", views=" + views + ", retweet=" + retweet + ", hashTag=" + hashTag
				+ ", mention=" + mention + ", like=" + like + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, fileUrl, hashTag, imgUrl, like, mention, postContent, postId, retweet, user, userId,
				userNickName, views);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(date, other.date) && Objects.equals(fileUrl, other.fileUrl)
				&& Objects.equals(hashTag, other.hashTag) && Objects.equals(imgUrl, other.imgUrl) && like == other.like
				&& Objects.equals(mention, other.mention) && Objects.equals(postContent, other.postContent)
				&& Objects.equals(postId, other.postId) && retweet == other.retweet && Objects.equals(user, other.user)
				&& Objects.equals(userId, other.userId) && Objects.equals(userNickName, other.userNickName)
				&& views == other.views;
	}
	
	
	
	

	
	
}

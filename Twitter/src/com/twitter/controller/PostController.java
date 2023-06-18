package com.twitter.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.twitter.model.Post;
import com.twitter.model.Retweet;
import com.twitter.model.Video;

public class PostController {
	
	Map<String, Post> post = new HashMap<>();
	List<Post> pcList = new ArrayList<>();
	
	//C
	//게시글 작성, 공개 비공개 설정
	public void uploadPost(String userId, Post p) {
		boolean isPublic = true;
		post.put(userId, p);
	
	}

	//#해쉬태그를 리스트로 받아서 설정하려고 했는데 에러파티..모르겠다..아무거나 갈겨..
	public void setHashtag(String userId, String postContent){
		if(post.get(userId) != null) {
			post.get(userId).setHashTag(postContent);
		}
	}
	
	//이미지, 동영상 첨부
	public void addfile(String userId, Post p) {
//		post.put(userId, p.setImgUrl(userId)); 또 에러야ㅠ
	}
	//멘션@설정 -> 알림가기 빼
	public void mention(Post mention) {
		List<Post> mentions = new ArrayList();
		mentions.add(mention);
	}
	
	//R
	//게시글 조회
	public ArrayList<Post> readPostList() {
		return readPostList();
	}
	//게시글에 좋아요 누르기
	public void addLike(String content) {
		for(Post p : pcList) {
			if(p.getPostContent().equals(content)) {
				p.setLike(p.getLike()+1);
			}
		}
	}
//	//좋아요 개수	
//	public void likeCount(String userId) {
//		if(post != null) {
//			post.get(userId).setLike(+1);
//		}
//	}
	//좋아요 해제		
	public void removeLike(String content) {
		for(Post p : pcList) {
			if(p.getPostContent().equals(content)) {
				p.setLike(p.getLike()-1);
			}
		}
	}
	//리트윗 누르기
	public boolean pushRetweet(Retweet retweet) {
		return false;
	}
	//댓글 작성->얘도 따로 빼야할까..? ^^ㅜ....
	public void addComment(){
	
	}
	//댓글 조회하기
	public void viewComment() {
		
	}
	//#해쉬태그 검색^^ 뺄까,,
	public void searchHashtag() {
		
	}
	//게시글 정렬-> 최신순, 리트윗순
	public void viewRange(Post p) {
//	pcList.stream().sorted(Comparator.comparing(p.getDate()));
//	갹 왜 또 에러야~!!
	}
	
	//U
	//게시글 수정
	public void updatePost(int index, Post post) {
		pcList.set(index, post);
	}
	//D
	//게시글 삭제
	public boolean deletePost(Post post) {
		return pcList.remove(post);
	}
}

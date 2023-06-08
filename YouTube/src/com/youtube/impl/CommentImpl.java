package com.youtube.impl;

import com.youtube.model.Comment;

public interface CommentImpl {
	
	//인터페이스는 추상 메서드만 올 수 있어->구현부{}가 아니라 ;
	//C : 댓글 작성 --> 로그인된 회원만 가능!
		public void addComment(String id, String password, Comment comment/*add에 객체로 받으려고*/);
		//R	: 댓글 1개 보기
		public Comment viewComment(int index);
		//U : 댓글 수정 --> 로그인한 회원과 이 댓글을 작성한 작성자가 일치
		public void updateComment(int index, Comment comment);
		//D : 댓글 삭제 --> 로그인한 회원과 이 댓글을 작성한 작성자가 일치
		public void deleteComment(int index);
}

package com.twitter.controller;

import java.util.ArrayList;
import java.util.List;

import com.twitter.model.Follow;


public class FollowController {
	
	private List<Follow> follow = new ArrayList<>();
	
	public List<Follow> followList() {
	        return followList();
	}
	
	 public void follow(String following) {
		 follow.add(new Follow());
	 }
	
	 public void unfollow(String following) {
		 follow.remove(Integer.parseInt(following));
	 }
	 
//    public boolean follow(Follow follow) {	//팔로우 버튼 누르면 팔로잉 아니면 언팔,,
//    	if(follow.) {
//        return follow.add(follow);
//    	} else {
//    		return follow.remove(follow);
//    	}
//    }
    
    
    
    
}

package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

	public class MusicController {
		private ArrayList<Music> list = new ArrayList<Music>();
	

	public boolean addList(Music music){	//마지막 리스트에 객체 저장
//		list.add(music);
		return list.add(music);	//반환타입이 boolean이므로 추가에 성공하면 true, 실패하면 알아서 false
	}
	
	public boolean addAtZero(Music music) {
		try {
			list.add(0, music);
			return true;
		} catch (Exception e) {
			return false;
		}
	
	}
	public ArrayList <Music> printAll() {
		return list;
	}
	public Music searchMusic(String title) {	//곡 명으로 객체 검색->객체가 있으면 객체 정보 리턴 / 없으면 null 리턴
		for(Music music : list) {
			if(music.getTitle().contains(title)) {
				return music;
			} else {
				return null;
			}
		}
		return null;
	}
	public Music removeMusic(String title) {	//곡 명으로 객체 검색 -> 객체가 있으면 타이틀 삭제 / 없으면 null 리턴
//		for(Music music : list) {
//			if(music.getTitle().equals(title)) {	// -> 이걸 어떻게 인트 타입으로 받지??
//				list.remove(music); // -> 1)boolean으로 받았을 때 처리방법
//				return music;
		
		for(int i = 0; i<list.size(); i++) {	//-> remove에 index를 넘기기 위해!
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);	//-> return 타입 music
			}
		}
		return null;
	}
	public Music setMusic(String title, Music music) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				list.set(list.indexOf(m), music);	//향상된 for문을 사용했으므로 indexOf로 받기
			}
		}
		return null;
	}
	
	public ArrayList<Music> ascTitle() { //->compare클래스
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();	// 형변환!
		Collections.sort(list, new TitleAscending());	
		return list;
	}
	public ArrayList<Music> descArtist(){
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		Collections.sort(list,new ArtistAscending().reversed());	// reversed-> 내림차순
		return list;
			
	}
	
}

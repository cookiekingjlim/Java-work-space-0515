package com.kh.file;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스
 * 	- 파일과 디텍토리 다루는데 사용되는 클래스
 * */
public class FileTest {

	public static void main(String[] args) {
		
		//존재하는 경로까지 지정해주면 해당 위치에 파일을 생성한다.
		File file = new File("src/test.txt");
		
		System.out.println("파일명: " + file.getName());
		System.out.println("절대 경로: " + file.getAbsolutePath());	// 컴퓨터에 위치되어 있는...
		System.out.println("상대 경로: " + file.getPath());	// 지금 현재 파일 위치에서의 상대적인 것
		System.out.println("파일 용량: " + file.length());	
		System.out.println("파일 존재 여부: " + file.exists());
		System.out.println("파일 여부: " + file.isFile());
		System.out.println("디렉토리 여부: " +  file.isDirectory());	// ???
		
		System.out.println();
		
		//존재하지 않는 폴더 안에 존재하지 않는 파일 
		//만약 존재하지 않는 경로를 제시하면 IOException 발생
		File newFile = new File("src/temp/test.txt");	//파일 객체 생성
		
		newFile.isDirectory();
		
		//(없는)폴더 만들기
		File tempDir = new File("src/temp");	// src밑에 temp 디렉토리를 만든다
		tempDir.mkdir();
		
		//(없는)파일 생성하기
		
//		newFile.createNewFile(); -> 에러 나면 트라이캐치 잡으면 돼
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

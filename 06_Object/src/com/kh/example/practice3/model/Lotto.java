package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {
	int[] lotto = new int[6];

	public String information() {

		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			//중복 제거
			for(int j=0; j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;//i랑 j가 같다면 브레이크 그리고 i값은 빼줘야..?
				}
			}

		}
				return Arrays.toString(lotto); 

		
		}
	
}
	

package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		Application app = new Application();
//		app.Lotto();
		app.method2();
	}
	
	public void Lotto() {
		TreeSet<Integer> lotto = new TreeSet<>();
		
		for(int i = 0; lotto.size() < 6; i++) {	//랜덤 번호 계속 추가하다가 사이즈가 6개일 때 나감
		int num = (int)(Math.random()*45)+1;
		lotto.add(num);
		}
		
		int count = 0;
		while(true) {	//계속 바뀌는 건 반복문 안에 넣는 게 좋아
			TreeSet<Integer> myLotto = new TreeSet<>();
			
			for(int j = 0; myLotto.size() < 6; j++) {
				int num2 = (int)(Math.random()*45)+1;
				myLotto.add(num2);
				
			}
				
			System.out.println("로또번호 : " + lotto);
			System.out.println("내 번호 : " + myLotto);
			
			count++;
			if(lotto.equals(myLotto)) {
			System.out.println("횟수 : " + count);
			break;
			}
		}
	
//답안----------------------------------------------------	
//		while(myLotto.size() < 6) {
//			int choose = (int)(Math.random() * 45) + 1;
//			myLotto.add(choose);
//		
//		System.out.println("로또번호 : " + lotto);
//		System.out.println("내 번호 : " + myLotto);
//		count++;	//매번 횟수를 추가하니까
//		
//		if(lotto.equals(myLotto)) {
//			System.out.println("횟수 : " + count);
//			break;
//		}
//	}
	
	
	
	
			

	}
	
	public void method2() {
		HashSet<Integer> lotto = new HashSet<>();	//-> 이건 정렬이 필요해!
		
		for(int i = 0; lotto.size() < 6; i++) {	//랜덤 번호 계속 추가하다가 사이즈가 6개일 때 나감
		int num = (int)(Math.random()*45)+1;
		lotto.add(num);
		}
		
		List lottoList = new ArrayList(lotto);
		Collections.sort(lottoList); // -> 정렬!
		
		int count = 0;
		while(true) {	//계속 바뀌는 건 반복문 안에 넣는 게 좋아
			HashSet<Integer> myLotto = new HashSet<>();
			
			for(int j = 0; myLotto.size() < 6; j++) {
				int num2 = (int)(Math.random()*45)+1;
				myLotto.add(num2);
				
			}
			List myLottoList = new ArrayList(myLotto);
			Collections.sort(myLottoList); // -> 정렬!
				
			System.out.println("로또번호 : " + lottoList);
			System.out.println("내 번호 : " + myLottoList);
			
			count++;
			if(lottoList.equals(myLottoList)) {
			System.out.println("횟수 : " + count);
			break;
			}
		}
	}
		
}

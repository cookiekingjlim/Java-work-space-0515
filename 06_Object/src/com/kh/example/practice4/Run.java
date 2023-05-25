package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {

//	static Scanner sc = new Scanner(System.in); 밖에서 스태틱 사용하려면
	public static void main(String[] args) {
		
//		Snack s = new Snack();------>컨트롤러로 분리해서 필요없음 대신
		SnackController scr = new SnackController();  //이걸 데려와함!
		Scanner sc = new Scanner(System.in);

		//-------------------없어도 돼	
//		s.setKind("빵");
//		s.setName("케이크");
//		s.setFlavor("블루베리");
//		s.setNumOf(1);
//		s.setPrice(15000);
	//-------------------------
		
		
		System.out.println("스낵류를 입력하세요");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
//		s.setKind(kind); 컨트롤러에 넘기기 위해 

//		s.setKind(sc.nextLine()); 이렇게 써도 되고
//		sc.next(s.getKind()); 오답
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		s.setName(sc.nextLine()); 컨트롤러용 주석 이하 동일
	
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
//		s.setFlavor(sc.nextLine());
		
		System.out.print("개수 : ");
//		s.setNumOf(Integer.parseInt(sc.nextLine()));
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");
//		s.setPrice(Integer.parseInt(sc.nextLine()));
		int price = Integer.parseInt(sc.nextLine());
		
		Snack s = new Snack(kind, name,flavor,numOf,price); //정보 넘기기
		
		if(scr.saveData(s)) { // 정보 넘기기&조건문으로 트루일 때 아래 출력하라
			System.out.println("저장 완료되었습니다");
			System.out.println(scr.confirmData());
		}
			

		
		
//		System.out.println(s.getKind() + "(" + s.getName() + "-" + s.getFlavor() + ")" + s.getNumOf() +"개 " + s.getPrice() + "원" );
		
	}

}


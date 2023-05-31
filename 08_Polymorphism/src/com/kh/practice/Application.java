package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.Book;

public class Application {

	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu(); 	// 메인메뉴 호출
	}
	
	public void mainMenu() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 :");
		int age = Integer.parseInt(sc.nextLine());
		
		lc.insertMember(name, age);
		
		boolean check = true;
		while(check) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1.마이페이지");
			System.out.println("2.도서 검색하기");
			System.out.println("3.도서 대여하기");
			System.out.println("4.프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				this.searchBook();
				break;
			case 3:
				this.rentBook();
				break;
			case 4:
				check = false;
				break;
			}
		}
	}
	//검색할 책 관련(LibraryController의 searchBook 메소드 이용)
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		System.out.println(lc.searchBook(keyword));
	}
	//빌릴 책 관련(LibraryController의 rentBook메소드 이용)
	public void rentBook() {
		Book[] books = lc.viewBooks(); 	// 프라이빗이므로
		for(int i = 0; i<books.length; i++) {	//인덱스가 필요하므로 향상된 포문 말고 기존 포문 사용하기
			System.out.println(i + "번 도서 : " + books[i]);
		}
		System.out.print("대여할 도서 번호 선택 : ");
		int select = Integer.parseInt(sc.nextLine());	//입력 받은 번호 받아서....
		
		if(lc.rentBook(select)) {	// 이게 결국 인덱스, 불리언이므로 아마 폴스로 뜰테니 조건문 이프 사용
		System.out.println("성공적으로 대여되었습니다.");
		} else {
		System.out.println("나이 제한으로 대여 불가능입니다.");
     	}
	}
}

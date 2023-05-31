package com.kh.practice.controller;

import com.kh.practice.model.AniBook;
import com.kh.practice.model.Book;
import com.kh.practice.model.CookBook;
import com.kh.practice.model.Member;

public class LibraryController {
	
	private Member member = null;
	private Book[] bookList = new Book[4];
	
	{
		bookList[0] = new CookBook("김대석 셰프의 집밥 레시피", true);		//쿠폰 줌
		bookList[1] = new CookBook("에브리데이 베이글", false);		//쿠폰 안줌
		bookList[2] = new AniBook("원피스 105", 19);	//나이제한 
		bookList[3] = new AniBook("최애의 아이 10", 15);
	}

	//멤버 생성자 이용해서 멤버 정보 추가
	public void insertMember(String name, int age) {	// 10번행에 널 초기화 한 이유 여기서 setter 말고도 생성자 사용할 수 있다는 것 보여주려고
		member = new Member(name, age);

	}
	
	public Member myInfo() {
		return member;
	}
	
	//매개변수로 받은 키워드가 포함된 제목을 가진 책 1권 반환
	public Book searchBook(String keyword) {
		//문자열.contains()<---이 메소드 이용!
		//for문으로...책들을 반복하고...? 그 중에서 원하는 책을 뽑아야겠지..? 근데 문자열을 쓴다고..?
		for(Book book : bookList) {
			if(book.getTitle().contains(keyword)) { // book getTitle에 키워드를 포함한 게 있으면
				return book;	// book으로 반환
			}
		}
		return null;
	}
	
	public Book[] viewBooks() {
		return bookList;
	}
	
	
	/*
	 * 대여할 책의 인덱스를 매개변수로 받아서 조건에 따라 처리
	 * - 만화책(AniBook)인 경우 나이제한
	 * - 요리책(CookBook)인 경우 쿠폰 유무
	 * */
	public boolean rentBook(int index) {
		//책 리스트 중 대여할 책(사용자가 원하는 책)의 조건을 만족하면->트루
		//힌트 : 조건이 만화책인 경우, 요리책인 경우가 있음, if~else, instanceof 사용하면 좋아
		//만화책인 경우 : getAccessAge(), getAge()
		//요리책인 경우 : isCoupon(), setCookCoupon(), getCoupon()
		Book selectBook = bookList[index];		//어떤 북리스트를 가져오냐...
		
		if(selectBook instanceof AniBook) {//만화책인경우
			AniBook aniBook = (AniBook) selectBook;	// 형변환하면 코드가 좀 더 깔끔해져
			if(aniBook.getAccessAge() > member.getAge()) {
				return false; //이때는 대여 못 해준다
			}
				
		} else if(selectBook instanceof CookBook){//요리책인 경우
				CookBook cookBook =(CookBook) selectBook;
				if(cookBook.isCoupon()) {		//쿠폰 있냐 없냐는 어차피 불리언이 처리해줌
					member.setCookCoupon(member.getCookCoupon()+1);		//단 쿠폰 있을 때
					
				}
		}
		member.setBook(selectBook);			// member에 북 대여 확인을 위해 포함관계....?
		return true;
	}
	
}

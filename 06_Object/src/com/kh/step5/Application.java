package com.kh.step5;

import com.kh.step5.model.Book;

public class Application {

	public static void main(String[] args) {
		Book b1 = new Book("HTML+CSS+자바스크립트", 30000, 0.2, "고경희");
//-----------------------------b1처럼 설정도 가능하지만 아래처럼 사용을 많이함. Book에 setter/getter
		Book b2 = new Book();
		b2.setTitle("리액트 200제");
		b2.setPrice(25000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("이정열");
		
		System.out.println(b1);
		System.out.println(b2);
		
		//Getter를 이용하여 두 객체 각각 할인율을 적용한 책 가격을 계산해서 출력

	    System.out.println("리액트 200제 할인 가격 : " + (int)(b2.getPrice()-(b2.getPrice()*(b2.getDiscountRate()))));
	    System.out.println("HTML+CSS+자바스크립트 할인 가격 : " + (int)(b1.getPrice()-(b1.getPrice()*(b1.getDiscountRate()))));
		
	}
//----------------------------------
 /* 북이랑 연결
  * Book b1 = Book.geInstance();
  * Book b2 = Book.geInstance();
  * 
  * b1.setTitle("자바");
  * system.out.print(b2.getTitle());  //b1의 자바가 여기에서도 자바라고 출력됨
  * 
  * 즉, 객체생성을 프라이빗 하면 공유하는...대체 뭘...?
  * 
  * 
  * */
	
}

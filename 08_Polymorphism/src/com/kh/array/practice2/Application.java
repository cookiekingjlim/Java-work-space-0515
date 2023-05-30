package com.kh.array.practice2;

import java.util.Scanner;

import com.kh.array.practice2.controller.MemberController;
import com.kh.array.practice2.model.Member;

public class Application {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public static void main(String args[]) {
		Application app = new Application();
		app.mainMenu();
	}
	
	public void mainMenu() {
		
	boolean check = true;
		while(check) {
			System.out.println("최대 등록 가능한 회원 수는 3명입니다.");
			System.out.println("현재 등록된 회원 수는 "+mc.count+"명입니다.");			// 컨트롤러에서 회원 수 체크하고 있는 count사용
			if(mc.count < 3) {				// 바뀌는 부분만 조건 걸기
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 사용 가능합니다.");
			}
			
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			switch(Integer.parseInt(sc.nextLine())) {			//입력 받은 걸 비교할테니까
			
			case 1:						
				this.insertMember();
				break;
			case 2:						
				this.updateMember();
				break;
			case 3:						
				this.printAll();
				break;
			case 9:
				check = false;
				System.out.println("종료합니다");
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");        // 스위치 안에
		}	
	}
}
	
	
	public void insertMember() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		//아이디가 있는 경우 중복된 아이디입니다. 다시 입력해주세요.
		//->조건문 사용
		if(mc.checkId(id) != -1) {	//-1이 아닌 경우 이미 존재하고 있는 거니까
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			this.insertMember();// 다시 호출 바로 아이디 입력 다시 나와야하므로
		} else {	//에 나머지 넣어줘야함
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			
			System.out.print("성별(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.print("나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			
//			mc.insertMember(id, name, password, email, gender, age);		1번 처리
			
//			Member m = new Member(id, name, password, email, gender, age);		// 2번 처리, 값들을 잠깐 생성자로 저장해서 그 객체를 넘기는 것
//			mc.insertMember(m);
			
			Member m = new Member();			//2-1처리, setter로 값을 임시 저장해서 넘기기!
			m.setId(id);
			m.setName(name);
			m.setPassword(password);
			m.setEmail(email);
			m.setGender(gender);
			m.setAge(age);
			
		}
		
		
		
		
		
	}
	
	public void updateMember() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		if(mc.checkId(id) == -1) {	// 아이디 중복 체크
			System.out.println("회원 정보가 없습니다.");
			return;	//여기서는 나가기 떄문에
		}	
		
		System.out.println("수정할 이름 : ");
		String name = sc.nextLine();				
	
		System.out.println("수정할 이메일 : ");
		String email = sc.nextLine();				
		
		System.out.println("수정할 비밀번호 : ");
		String password = sc.nextLine();
		
		mc.updateMember(id, name, email, password);
	}
	
	public void printAll() {
		Member[] mArr = mc.printAll(); 
		for(Member m : mArr) {			//객체를 각각 하나씩 가져오는 것
			if(m != null) System.out.println(m); 		// m이 널이 아닌 경우에만 출력한다!
		}
	}

}

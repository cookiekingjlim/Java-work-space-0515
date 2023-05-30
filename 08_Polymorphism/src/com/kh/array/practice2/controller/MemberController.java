package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	
	private Member[] mArr = new Member[3];			//멤버 객체 배열 선언!
	public int count = 0;
	
//											1번
//	--------------------------------------------------------------------------------------------------------------
//	public void insertMember(String id, String name, String password, String email, char gender, int age) {	
//	mArr[count++] = new Member(id,name,password,email,gender,age)
//	}
//	----------------------------------------아래랑 동일--------------------------------------------------------------
//											2번
	public void insertMember(Member m) { // 객체 배열에 객체 하나씩 추가한다고 생각!, count를 인덱스라고 생각!
		mArr[count++] = new Member(m.getId(),m.getName(),m.getPassword(),m.getEmail(),m.getGender(),m.getAge());		// 잘 만들어 놓고 ()안에 넣을 생각을 안 함ㅠ, 후위연산자 count++
		/*mArr[count++] = m; 이렇게 넣어도 똑같음*/
	}
	
	public boolean updateMember(String id, String name, String password, String email) {	//checkId 활용! <--index!, 추가처럼 수정(setter이용)도 같은 방식!(해당 인덱스 값에 넣는 방식)
		int index = this.checkId(id);		// 아이디 체크
		if(index!=-1) {  // 아이디가 일치하지 않으면 수정 메뉴 선택 가능 수정을 위한 조건
			mArr[index].setName(name); 			
			mArr[index].setPassword(password);
			mArr[index].setEmail(email);
			return true;			//트루이면 반환!
		}
		return false;
	}
	
	public int checkId(String id) {	//id 검색!, 객체 배열 값들 for문 돌려서 일치한지 확인해서 return 값
		for(int i = 0; i<mArr.length; i++) {		//0,1,2
			if(mArr[i] != null && mArr[i]/*객체*/.getId().equals(id));		//조건식 배열 아이디랑 id랑 일치할 때, 객체가 널이 아닐 때도 체크해야해!!!!!!!!!
			return i; //일치하면 i 넘겨~
		}
		return -1;		// 인덱스 일치하는 게 없으면 -1로 넘김 왜냐면 0부터 시작하니까 //조건을 만나서 일치하지 않으면 나가~
	}
	
	public Member[]printAll() {	//객체 배열
		
		return mArr;			// 이건 그냥 넘기기만 하면 되는 것
	}

}

package com.kh._abstract.step1;

public class BasketBall extends Sports {

	public BasketBall(int numberOfPlayers) {	//->베스킷볼 보면 키워드 있음 둘 다 눌러줘야
		super(numberOfPlayers);
		
	}

	@Override
	public void rule() {	// *부모클래스에서 룰이라는 추상메서드 만들어 놓은 것을 자식 클래스에서 구현해줘야 중요,,,*
		
		System.out.println("BasketBall 선수의 수는 " + this.numberOfPlayers+"명, 공을 던져서 링에 넣어야 한다.");
		
	}
	
	

}

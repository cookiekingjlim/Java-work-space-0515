package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

class LoopPractice {
	Scanner sc = new Scanner(System.in);
 
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5
        4
        3
        2
        1
     */
    public void method1() {

    	System.out.print("사용자 입력(1~100) : ");
    	int num = sc.nextInt();
    	for(int i = num; i >= 1; i--) {
    		System.out.println(i);
    		
    	}
    	
    }

    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    public void method2() {
 
    	int i = 0;
    	int sum = 0; //합계
    	while(true) { //조건 합계가 100이 되기 전까지
    		i++;
    		
    		if(i % 2 != 0){					//조건 1 : i가 홀수일 때는 더해라 
    	    	sum+=i;	
    		} else if(i % 2 == 0) {			//조건 2 : i가 짝수일 때는 빼라 
    			sum-=i;
    		} if(sum >= 100) {
    			break;
    		}
//    		System.out.println(sum);	//조건1과 2를 더했을 때 결과는? 맞는 것 같기도 하고 아닌 것 같기도 하고...퉤
    	}
    	System.out.println(i);			// 몇까지 더해야 100이상이 되는가?
    }
    		
  
    	



    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

        문자열 : banana
        문자 : a 
        banana 안에 포함된 a 개수 : 3

    */
    public void method3() {
    	

     	System.out.print("문자열을 입력하세요 : ");
    	String str = sc.nextLine();
    	System.out.print("문자 : ");
    	char ch = sc.next().charAt(0);
    	
    	int count = 0; // 바깥에 셀 변수 설정
    	
    	for(int i = 0; i < str.length(); i++) { 
    		if(str.charAt(i) == ch) {
    			count++; // 문자열에서 문자가 i랑 일치할 때마다 개수 하나 증가
    		}
//    		엉엉 쌤 a 추출까지는 했는데 개수는 못 세겠어요ㅠㅠㅠㅠ ----> count로 잘 세고 계시는데요!
    	}
  	
    	System.out.println(str + "안에 포함된" + ch +"의 개수: " + count);
    }
    	
    	
    	
//-------------------4번부터 어려워,,,응용이 안돼,,,난 똥멍청이야,,,, ----> 전혀 아닙니다 ㅠㅠ 잘 하고 계시는데요!!
    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용!) //사용 범위 들었는디...
        7
        3
        4
        2
        3
        4
        0
     */
    //2023-06-18
    public void method4() {
    	
    	
    	//랜덤값을 넣고 while을 써서 조건을 0이 될 떄까지로 잡아야할 것 같은디.....
		while (true) {
			int num = (int) (Math.random() * 11); // 0부터 10까지 ---> GOOD! 잘 하셨는걸요 :)
			System.out.println(num);
			if(num == 0 ) {
				break;
			}
//			if (num != 0) { // 랜덤값은 잘 나오는데...
//			} else if (num <= 0) { // 0이 출력이 안돼.....캯 ----> 조건 걸어서 break 걸고 있잖아요!
//									// 이보다 출력하는 코드가 위에 있으면 0이 출력되고 종료!
//			}
//			break;
		}

	}
    
    

    private char[] random(int i) {
		return null;
	}

	/*
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용! 범위 : 1~10)

        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0

     */
    public void method5() {
    	// 랜덤값 사용 주사위(1~6)-> 10번 반복했을 때-> 같은 수 찾기...equals는 안될 것 같고...
    		int count = 0;
    		for(int i=0; i<10; i++) {
    			int dice = (int)(Math.random()*6)+1;
    			System.out.println(dice);  // 10개의 랜덤값 ---> 랜덤값 10개가 이 안에서만 사용되고 있어요!
    		
    		// int dice로 해놓은 이 dice는 위에 반복문 안에서만 쓸 수 있는 변수로 지정해 놓은 상태!
    		// 반복문 안에서 자꾸 돌아가고만 있어요!
    			
    			// 아래 반복문이 작동하지 않는 이유는 i가 지금 0인데 j가 0, i는 0 <---- 위에 코드랑 반복문 안에서 합쳐 보는 것부터!
    
    		for(int j=0; j<i;j++) {  // 위에 dice로 뺀 랜덤값 10개! 반복문 같이 써야 여기 코드랑 같이 쓸 수 있음!! 
    			if(i == j) {
    			j = count;
    			}
       			switch(count) {		// 증복값,,
       			case 1 :
       				System.out.println("1:" + count);
       				break;
       			case 2 :
       				System.out.println("2:" + count);
       				break;
       			case 3 :
       				System.out.println("3:" + count);
       				break;
       			case 4 :
       				System.out.println("4:" + count);
       				break;
       			case 5 :
       				System.out.println("5:" + count);
       				break;
       			case 6:
       				System.out.println("6:" + count);
       				break;
        				
    		}
    	}
 	}
  }
   //------------------- 시묽,,,,---------------------------------------- 
  
    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    public void method6() {
    	// 랜덤으로 1,2,3 -> 1은 가위 2는 바위 3은 보...에바ㅠ 와일이랑 이퀄스..?
    	System.out.print("당신의 이름을 입력해주세요 : ");
    	String name = sc.nextLine();
    
    	
    	while(true) { //사용자가 이길 때까지 가위바위보 반복
    		int computer = (int)(Math.random()*3)+1;
    		int count = 0; // 횟수
    		int draw = 0;
    		int lose = 0;
    		int win = 0;
//    		count++;
    		
    		System.out.println("1. 가위 | 2. 바위 | 3. 보");		//이퀄스 퉤 ---> 많이 보게 되므로 너무 싫어하진 말아요 ㅋㅋㅋㅋㅋ
    		System.out.println("가위바위보 숫자를 입력하세요");
    		System.out.print(name + ":");
    		int input = Integer.parseInt(sc.nextLine());
    		System.out.println("컴퓨터 : " + computer);
    		
    		if((computer==1 && input==1) || (computer == 2 && input == 2) || (computer == 3 && input == 3)) {
    			draw++;
    			System.out.println("비겼습니다.");
    		}else if((computer==1 && input==3) || (computer == 2 && input == 1) || (computer == 3 && input == 2)){
    			lose++;
    			System.out.println("졌습니다.");
    		}else {
    			win++;
    			System.out.println("이겼습니다.");
    			System.out.println(draw+"번 비겼고, "+lose+"번 졌고,"+win+"번 이겼습니다."); // 얘는...어쩌지...어디에 놔야하지....와일문 안에 넣어야하는디.. 
    			                                                         // --> 마지막으로 한번만 출력하면 되니까 굳이 while문 안에 있지 않아도 됩니다!
    			break; //이기면 멈추기
    		}
    		System.out.println("");
    	}
    	
    }

    public static void main(String[] args) {
		LoopPractice lp = new LoopPractice();
//		lp.method1();
//		lp.method2();
//		lp.method3();
		lp.method4();
//		lp.method5();
//		lp.method6();
		
	}
}
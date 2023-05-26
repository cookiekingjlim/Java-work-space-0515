package com.kh.loop;

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
//    		엉엉 쌤 a 추출까지는 했는데 개수는 못 세겠어요ㅠㅠㅠㅠ
    	}
  	
    	System.out.println(str + "안에 포함된" + ch +"의 개수: " + count);
    }
    	
    	
    	
//-------------------4번부터 어려워,,,응용이 안돼,,,난 똥멍청이야,,,,
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
    public void method4() {
    	int num = (int)(Math.random()*10+1);
    	for(int i = 10; i >= 0; i--) {
    		if
    		System.out.println(i);
    	}
    	//----랜덤값을 넣고,,,포문으로 반복해서,,,if로 조건을 달아야할 것 같은데 
    }
    		
//    	int num = (int)(Math.random()*10+1);
//    	for(int i = num; i >= 0; i--) {
//    		System.out.println(i); //에엥 이렇게 하니까 정렬이 됐어...
//    	}
  

    

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
 
    	
   
    }

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

    }

    public static void main(String[] args) {
		LoopPractice lp = new LoopPractice();
//		lp.method1();
//		lp.method2();
//		lp.method3();
		lp.method4();
		
	}
}
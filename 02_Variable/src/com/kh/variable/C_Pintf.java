package com.kh.variable;

public class C_Pintf {

	public static void main(String[] args ) {
		
		// System.out.print(출력하고자 하는 값); - 출력만 함, 줄바꿈 발생 x, 줄바꿈하려면 \n 입력
		// Stystem.out.pirntln(출력하고자 하는 값); -출력 후 줄바꿈 발생 o
		
		System.out.print("hello\n");
		System.out.println("hello");
		
		// System.out.printf("출력하고자 하는 형식(포맷)", 출력하고자 하는 값, 값, 값....);
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행, 줄바꿈 발생 x 
		
		/*
		 * 포맷으로 쓰이는 키워드
		 * %d : 정수 
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열(문자도 가능)
		 * */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 문제) 10% 20%
		System.out.print("10%,20%"); // 내가 한 거,,,쩝,,
		System.out.println(iNum1 + "% " + iNum2 + "%"); // 단축어는 띄어쓰기 사용 안 해, ""안에 공백도 인식
		System.out.printf("%d%%,%d%%", iNum1, iNum2); // 이거 왜 뒤에 퍼센트가 두 개...? -> 퍼센트를 사용하기 위해 뒤에 %%붙이는 것 앞에 포맷이랑 구분 위해
		

		System.out.println("-----------------");
		
		System.out.printf("%5d\n", iNum1); // 5칸의 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n",-12); // %-5d(음수면 왼쪽 정렬)
		
		System.out.println("-----------------");
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		// 무조건 소수점 아래 6째 자리까지 보여줌
		System.out.printf("%f\t%f\n", dNum1, dNum2); // \t 탭
		System.out.printf("%f\t%.2f\n", dNum1, dNum2); // 소수점 두 번째 자리까지 표시, 세 번째 자리까지 표시하고 싶으면 %.3f\t
		
		System.out.println("-------------------------");
		
		char ch = 'a';
		String str = "Hello";
		
		// 문제 a Hello a
		System.out.printf("%c %s %c\t", ch, str, ch); // 내가 해 본 거
		System.out.printf("%c %s %c\t", ch, str, ch); // 정답
		
		// 문제 A HELLO A
		System.out.printf("%C %S %C", ch, str, ch); // 내가 해 본 거
		System.out.printf("%C %S %C", ch, str, ch); // 정답

	}
	
}

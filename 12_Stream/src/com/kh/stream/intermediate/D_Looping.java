package com.kh.stream.intermediate;

import java.util.Arrays;

/*
 * 반복
 * 	- 요소 전체를 반복하는 역할
 * 	- peek() : 중간 처리 단계에서 전체 요소를 반복
 * 	- forEach(): 최종 처리 단계에서 전체 요소를 반복
 * */
public class D_Looping {

	public static void main(String[] args) {

		int sum = 0;
		int[] values = {1,2,3,4,5};
		
		//최종 처리 메서드가 호출되어야 동작함
		sum = Arrays.stream(values)	// sum으로 최종 처리....
				.filter(i -> i % 2 == 0)
				.peek(value -> System.out.println(value))	// 안 나와! 최종처리 안 했으니까~
				.sum();
		System.out.println("sum: " + sum);
		
		//최종 처리 메서드는 다른 최종 처리 메서드를 호출 할 수 없어
		sum = Arrays.stream(values)
					.filter(i -> i % 2 == 0)	// 중간처리
//					.forEach(value -> System.out.println(value))	//최종처리
					.sum(); //실행 안됨, 최종처리
		System.out.println("sum2: " + sum);
	}

}

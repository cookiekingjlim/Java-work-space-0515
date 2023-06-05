package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class B_Other {

	public static void main(String[] args) {
		B_Other b = new B_Other();
//		b.method1();
//		b.method2();
		b.method3();
	}
	
	// Vector -> 쓸 일 없음
	// 동기화된(synchronized) 메서드로 구성 -> 순차적으로 돌아가게 도와줌 / arrayList는 동기화X 대신 속도가 빠름 
	public void method1() {
		Vector v = new Vector();
		v.add(3);
		v.add(4);
		v.setSize(10);	// size
		
		v.clear();
		v.trimToSize();
		
		v.trimToSize();
		
		v.ensureCapacity(5);//공간을 더 늘리고 싶다? --> 남아 있는 공간의 2배를 늘림
		
		System.out.println(v);
		System.out.println("size : " + v.size());	// 값의 크기
		System.out.println("capacity : " + v.capacity());	// 벡터가 갖고 있는 공간의 크기, 기본값 10
	}
	
	// 스택(Stack) -> Class
	// 	- 마지막에 저장한 것을 제일 먼저 꺼내는 LIFO(Last In First Out)구조
	public void method2() {
		
		Stack s = new Stack();
		s.push(0); 		// 추가할 땐 push를 씀 add가 아님!
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();	// 3이 빠져나감
		s.push(4);
		s.pop();	// 4가 빠져나감
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop(); 	// 7이 빠져나감
		
		//남은 건 01256
		System.out.println(s);
		
	}
	
	// 큐(Queue) : 처음에 저장한 것을 제일 먼저 꺼내는 FIFO(First In First Out)구조
	public void method3() {
		//스택처럼 객체 생성을 Queue로 하면 안됨 -> Interface니까
		Queue q = new LinkedList();	// 각각 임포트! 
		q.offer(0);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.poll();	//----- Queue가 가지고 있는 ------, 0이 빠져나감
		q.add(4); // ----Linked가 갖고 있는 것 ------
		q.remove();	// 1이 빠져나감
		q.add(5); 
		q.add(6); 
		q.add(7);
		q.remove();	// 2가 빠져나감
		
		//먼저 들어간 걸 먼저 빼 : 3,4,5,6,7
		System.out.println(q);
	}
	
}

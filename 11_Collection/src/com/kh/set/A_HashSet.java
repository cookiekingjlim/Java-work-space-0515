package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.set.model.Person;

/*
 * set의 특징
 * 	- 중복 없음
 * 	- 순서 없음
 * 
 * HashSet
 * 	- Set 인터페이스를 구현한 대표적인 컬렉션 클래스
 * */


public class A_HashSet {

	public static void main(String[] args) {
		A_HashSet a = new A_HashSet();
//		a.method1();
		a.method2();
	}
	
	public void method1() {
		Set<String> set = new HashSet<>();
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set);	// 중복된 것 안 나오고, 순서 무작위!
		System.out.println(set.size());	// 중복된 것 제외하고 개수
		System.out.println(set.contains("마동석"));	// 있으니까 true
		
		set.remove("아오키 무네타카");	//출력 리스트에서 제거
		System.out.println(set);
		
		set.clear();	// 출력 리스트 전체 제거
		System.out.println("비었는지?" + set.isEmpty());
		System.out.println(set);
				
}
	
	public void method2() {
		
		HashSet<Person> set = new HashSet<Person>();	//set 객체로 넣어보기
		
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));	//객체도 중복 허용 안될까?
		set.add(new Person("이준혁", 39));
		/*
		 * 객체의 주소값을 가지고 비교하기 때문에 모두 다른 객체로 인식해서 중복 제거되지 않음
		 * --> Person 클래스에서 hashCode(), equals() 메서드 재정의
		 * 
		 * */
		System.out.println(set);	// -> 객체는 중복 가능!, 객체는 주소값이 저장되어 있기때문에 생성할 때마다 주소값이 다름
		System.out.println(set.size());	//-> 중복 제거 돼서 4개!
		
		/*
		 * Iterator
		 * 	- 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
		 * 	- Iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
		 * */
		
		Iterator<Person> it = set.iterator();	//반복문 사용해도 돼
		while(it.hasNext())	{//-> hasNext 반환타입 boolean이기때문에 바로 받을 수 있어, 읽어올 요소가 있는지 확인하는 것
			System.out.println(it.next());//-> 여기서 next객체 하나씩 하나씩 꺼내오는 것, Person.. 다음 요소를 읽어옴
		}
		
	}
	
	
	
	
	
}

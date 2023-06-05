package com.kh.list.model;

public class Person implements Comparable<Person> {		// 추상 메서드 구현해야함


	private String name;	// 멤버변수로 설정, 이름
	private String addr;	//주소
	private int age;	//나이


	public Person() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	/*
	 * compareTo() 메서드에서 반환되는 값을 가지고 정렬 기준을 잡는다.
	 * 	- 자신과 매개값으로 전달된 객체가 같은 타입의 객체인지 비교
	 * 	- 비교해서 같으면 0을 반환, 자신이 크다면 양의 정수(1), 자신이 작다면 음의 정수(-1) 반환
	 * 
	 * */
	
	@Override
	public int compareTo(Person o) {
//		return this.age == 0.age ? 0 : this.age > 0.age ? 1 : -1;	//age가 같으면 0, 크면 1, 작으면 -1
		return this.name.compareTo(o.name);	// 이름끼리 비교할 땐 이렇게 써 String이 알아서 비교하고 있으니까
	}


}


package com.kh.polymorphism;

import com.kh.polymorphism.controller.EmployeeController;
import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.child.Manager;
import com.kh.polymorphism.model.child.Secretary;
import com.kh.polymorphism.model.parent.Employee;

/*
 * 다형성(Polymorphism) 다형성의 형이 자료형할 때 형이라고 생각해
 * 	- 하나의 객체변수가 여러가지 모양과 모습을 가지는 능력
 * 	- 부모 타입으로 자식 객체를 생성하는 것
 * 
 * */

public class Application {

	public static void main(String[] args) {
//--------------------------지금까지 객체 생성할 때 쓰던 방식-------------------------
		Employee e1 = new Employee("이수근",12000);
		Manager m1 = new Manager("강호동",23000,"체육부");
		Engineer eg1 = new Engineer("김영철", 56000,"Java",200);
		Secretary s1 = new Secretary("서장훈", 34000, "강호동");
		
		System.out.println(e1);
		System.out.println(m1);
		System.out.println(eg1);
		System.out.println(s1);
		
		System.out.println();
		
		//다형성 방식으로 객체 생성
		Employee e2 = new Manager("강호동", 23000, "체육부"); 		//부모 클래스에 e2 -> 자식을 Manager 넣어서 객체 생성
		Employee e3 = new Engineer("김영철", 56000, "Java",200); 		//부모 클래스에 e2 -> 자식을 Manager 넣어서 객체 생성
		Employee e4 = new Secretary("서장훈",34000,"강호동"); 		//부모 클래스에 e2 -> 자식을 Manager 넣어서 객체 생성
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println();
		
		//다형성 + 객체 배열
		Employee[] empArr = {e1, e2, e3, e4};				// Employee라는 부모 클래스 + 객체 => 초기화&선언
		for(Employee employee : empArr) {
			System.out.println(employee);
		}
		
		System.out.println();
		
		//이름으로 사람 찾기
		EmployeeController ec = new EmployeeController();
		Employee find = ec.findEmployeeByName(empArr, "김영철");
		System.out.println(find);
		
		//연봉은?
		System.out.println(find.getName() + "의 연봉 : " + ec.getAnnualSalary(find));
		
		//전체 사람들의 연봉 총합은?
		System.out.println("연봉 총 합계 : " + ec.getTotalCoast(empArr));
		
	}

}

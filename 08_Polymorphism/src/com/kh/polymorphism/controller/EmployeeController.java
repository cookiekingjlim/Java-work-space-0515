package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {
	private Employee[] ea = new Employee[3];
	public int count = 0;
	
	//Employee 객체배열과 이름을 가지고 와서 일치한 사람 반환
	public Employee findEmployeeByName(Employee[] ea, String name) {
		
//		Employee emp = null; 		// 해놓으면 좋아	<---1번 처리
		for(Employee employee : ea) {		//객체배열 포문으로 돌려
			if(employee.getName().equals(name)) {
//				emp = employee;		<---1번 처리
				return employee;		
			}
		}
				
//		return emp;		<---1번 처리
		return null;
	}
	//연봉 계산 : engineer인 경우 보너스가 있음!
	public int getAnnualSalary(Employee e) {
		
		int annualSalary = e.getSalary()*12;	//포문에서 미리 지정해주기 리턴값으로 안 받을 거면
		
		// instanceof 연산자 : 현재 참조변수가 실제로 어떤 클래스 형의 객체의 주소를 참조하고 있는지 확인할 때 사용
		if(e instanceof Engineer) {	//조건문 안에 있는 e는 Engineer에서 가져온 e라는 걸 확인!
			Engineer eg = (Engineer) e;		//부모 -> 자식으로 강제 형변환 한 것!
//			return e.getSalary()*12 + eg.getBonus();
			annualSalary += eg.getBonus();
		}
//		return e.getSalary()*12;
		return annualSalary;
	}
	// 전체 연봉 총 합계
	public int getTotalCoast(Employee[] ea) {
		int total = 0;		//1}변수 선언은 반복문 밖에 있어야 함
		for(Employee employee : ea) {
			total += getAnnualSalary(employee); //3) 토탈에다가 미리 지정해뒀던 연봉 집어넣어주면 됨
		}
		return total;	//2)
	}
	
}

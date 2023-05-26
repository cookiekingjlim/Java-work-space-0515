package com.kh.example.practice5.controller;

import com.kh.example.practice5.model.Employee;

public class EmployeeController {
	
	private Employee employee = new Employee();
	
	public EmployeeController() {}
	
	// 오버로딩!
	public void add(int empNo, String name, char gender, String phone) { //여기는 매개변수 일일히 집어넣었으니까
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
		
	}
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
//		employee.setEmpNo(empNo);
//		employee.setName(name);
//		employee.setGender(gender);
//		employee.setPhone(phone);
//		employee.setDept(dept);
//		employee.setSalary(salary);
//		employee.setBounus(bonus);
//---------아래처럼 써도 돼 서로 동일--------------		
		this.add(empNo, name, gender, phone);
		employee.setDept(dept);
		employee.setSalary(salary);
		employee.setBounus(bonus);
	}
	
	public  void modify(String phone) {
		employee.setPhone(phone);
	}
	public  void modify(int salary) {
		employee.setSalary(salary);
	}
	public  void modify(double bonus) {
		employee.setBounus(bonus);
	}	
	public Employee info() { //----------------------void는 리턴값 안받지만 나머지는 return 받음-----------------
		return this.employee;
	}

}

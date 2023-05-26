package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.controller.EmployeeController;
import com.kh.example.practice5.model.Employee;

public class Application {

	static Scanner sc = new Scanner(System.in); // static 해야 돌아가는디...왜지....배웠는디....
	Employee viewEmployee = new Employee();
	EmployeeController employeeController = new EmployeeController(); // ---------------임시저장

	public static void main(String[] args) {

		Application app = new Application();
	

			boolean check = true;
			while (check) {
				int select = app.employeeMenu();
			    switch (select) {
			    case 1:
				app.insertEmp(); // 1번 눌렀을 때 insertEmp를 가라
				break;
				
			    case 2:
				app.updateEmp();
				break;
				
			    case 3:
				app.printEmp();
				break;
				
			    case 9:
				System.out.println("프로그램을 종료합니다.");
				check = false; // !!!!!!!!!반복문이 멈춤!!!!!!!!!
				break;
			    }
			}
	}
			

			
		
			

//-------------------화면---------------------------

	public int employeeMenu() {
		System.out.println("1. 사원 정보 추가 ");
		System.out.println("2. 사원 정보 수정 ");
		System.out.println("3. 사원 정보 출력 ");
		System.out.println("9. 프로그램 종료 ");
		System.out.print("메뉴 번호를 누르세요 : ");
		return Integer.parseInt(sc.nextLine()); // 그 변수를 받아서 입력하겠다.
	}


	public void insertEmp() {

		System.out.print("사원 번호 : ");
		int empNo = Integer.parseInt(sc.nextLine());

		System.out.print("사원 이름 : ");
		String name = sc.nextLine();

		System.out.print("사원 성별 : ");
		char gender = sc.next().charAt(0);

		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n)");
		String add = sc.nextLine(); //add 임시변수 사용
		
		if(add.equals("y")) {
			
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
		    System.out.print("사원 연봉 : ");
		    int salary = Integer.parseInt(sc.nextLine());
		    
		    System.out.print("보너스율 : ");
		    double bonus = Double.parseDouble(sc.nextLine()); 
		    
		    //---------------------조건문 안에서만 사용할 수 있는 것
		    
		    employeeController.add(empNo, name, gender, phone, dept, empNo, gender);
		    
		  	} else { // 추가 정보 n인 경우
			employeeController.add(empNo, name, gender, phone);  // 받는 곳에서 매개변수 지정한 거랑 여기서 지정한 거랑 똑같아서 자동 완성해줌
		} 
		    
		
	}
	
	public void updateEmp() {
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int select = Integer.parseInt(sc.nextLine());
		
		switch(select) {
		case 1 :
			System.out.println("전화 번호 입력 : ");
			String phone = sc.nextLine();
			employeeController.modify(phone);
			break;
		case 2 :
			System.out.println("사원 연봉 입력 : ");
			int salary = Integer.parseInt(sc.nextLine());
			employeeController.modify(salary);
			break;
		case 3 :
			System.out.println("보너스율 입력 : ");
			double bonus = Double.parseDouble(sc.nextLine());
			employeeController.modify(bonus);
			break;
		case 9 :    //돌아가기니까 따로 안해도....아마....?
			break;
			
		}
		
	}

		
	public void printEmp() {
		System.out.println(employeeController.info()); // info 반환을 넘겼는데 투스링을 받아서 보여주는 것
	}
}	
	
	

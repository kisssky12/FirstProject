package com.yedam.database;

import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in); // ctrl+shift+o 다축기
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] emps = dao.getEmpList();
				for (Employee emp : emps) {
					if (emp != null)
						System.out.println(emp.toString());
				}
			} else if (selectNo == 2) {
				
//				EmpDAO dao = new EmpDAO();
//				Employee[] emps = dao.getEmpList();
//				Employee[] emp = new Employee(301, "test", "test", "2020-05-05", "it_prog");
//				dao.addEmployee(emp);
				
				System.out.println("사원번호> ");
				int employeeId = scn.nextInt();
				
				
				System.out.println("이름> ");
				
				
				System.out.println("성> ");
				
				String lastName = scn.next();
				
				System.out.println("이메일> ");
				String email = scn.next();
				
				System.out.println("입사일> ");
				String hireDate = scn.next();
			
				
				System.out.println("직책> ");
				String jobId = scn.next();
					
				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee(employeeId, lastName, email, hireDate, jobId);
				dao.addEmployee(emp);
			
				
			} else if (selectNo == 3) {

			} else if (selectNo == 4) {
				

			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

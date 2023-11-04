package com.sunbeam;

import java.util.Scanner;

public class TestMain 
{
	
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("------------------------MENU------------------------");
		System.out.println("1. Add Employee");
		System.out.println("2. Display All");
		System.out.println("3. Search Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Update Salary");
		System.out.println("6. Exit");
		choice = sc.nextInt();
		System.out.println("----------------------------------------------------");
		return choice;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List l = new List();
		int choice;
		while((choice = menu()) != 6)
		{
			switch(choice)
			{
			case 1:
				Employee emp = new Employee();
				System.out.print("Enter The Employee ID : ");
				int id = sc.nextInt();
				System.out.print("Enter The Employee Name : ");
				String name = sc.next();
				System.out.print("Enter The Employee Salary : ");
				double sal = sc.nextDouble();
				emp.setEmpid(id);
				emp.setEmpname(name);
				emp.setSalary(sal);
				l.addFirst(emp);
				break;
			case 2:
				System.out.println("Employee List : ");
				l.showAll();
				break;
			case 3:
				System.out.println("Enter The Employee Name : ");
				String empname = sc.next();
				l.searchByName(empname);
				break;
			case 4:
				System.out.println("Enter The Employee ID : ");
				int id1 = sc.nextInt();
				l.deleteById(id1);
				break;
			case 5:
				System.out.println("Enter the Employee ID : ");
				int id2 = sc.nextInt();
				System.out.println("Enter The New Salary : ");
				double sal1 = sc.nextDouble();
				l.updateSalary(id2, sal1);
				break;
			default :
				System.out.println("Wrong Option...Please Enter Correct Option");
			}
		}
		sc.close();
		System.out.println("Thak You For Using Our Application");
	}

}

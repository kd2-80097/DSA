package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 2. Create array of employees and search employee by 
i. empid
ii. name
iii. salary      */

public class TestLinearSearch {
	
	public static int searchById(Employee arr[],int key) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count++;
			if(arr[i].getEmpid() == key) {
				System.out.println("No. of Comparisons = "+count);
				return i;
			}
		}
		System.out.println("No. of Comparisons = "+count);
		return -1;
	}
	
	public static int searchByName(Employee arr[],String key) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count++;
			if(arr[i].getName().equalsIgnoreCase(key)) {
				System.out.println("No. of Comparisons = "+count);
				return i;
			}
		}
		System.out.println("No. of Comparisons = "+count);
		return -1;
	}
	
	public static int searchBySalary(Employee arr[],double key) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count++;
			if(arr[i].getSalary() == key) {
				System.out.println("No. of Comparisons = "+count);
				return i;
			}
		}
		System.out.println("No. of Comparisons = "+count);
		return -1;
	}


	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		Employee [] arr = new Employee[7];
		arr[0] = new Employee(5,"Chetan",5000.25);
		arr[1] = new Employee(1,"Sankalp",5050.25);
		arr[2] = new Employee(3,"Chaitanya",6000.25);
		arr[3] = new Employee(4,"Sarvesh",7500.75);
		arr[4] = new Employee(2,"Shubham",5300.25);
		arr[5] = new Employee(6,"Nilesh",5010.55);
		arr[6] = new Employee(7,"Girish",8000.25);
		
//		Arrays.sort(arr);
//		for(Employee e:arr) {
//			System.out.println(e);
//		}
//		System.out.println("Enter the ID of Emloyee to Search");
//		int key = sc.nextInt();
//		int res = searchById(arr, key);
		
//		System.out.println("Enter the Name of Employee to Search");
//		String key = sc.next();		
//		int res = searchByName(arr, key);
		
		System.out.println("Enter the Salary of Employee to Search");
		Double key = sc.nextDouble();	
		int res = searchBySalary(arr, key);
		
		if(res != -1) {
			System.out.println("Key Found at Index "+res);
		}
		else {
			System.out.println("Key Not Found");
		}
	}

}


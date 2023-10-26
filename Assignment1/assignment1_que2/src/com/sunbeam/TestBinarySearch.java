package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TestBinarySearch {
	
	//Binary Search by Id
	public static int searchById(Employee arr[],int key,int size) {
		int left=0, right=size-1, mid=0, count=0;
		while(left<=right) {
			mid = (left+right)/2;
			count++;
			if(arr[mid].getEmpid() == key) {
				System.out.println("No. of Comparisons = "+count);
				return mid;
			}
			else if(arr[mid].getEmpid() >key) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		System.out.println("No. of Comparisons = "+count);
		return -1;
	}
	
	//Binary Search by Name
	public static int searchByName(Employee arr[],String key,int size) {
		int left=0, right=size-1, mid=0, count=0;
		while(left<=right) {
			mid = (left+right)/2;
			count++;
			if(arr[mid].getName().equalsIgnoreCase(key)) {
				System.out.println("No. of Comparisons = "+count);
				return mid;
			}
			else if((arr[mid].getName().compareTo(key)) == -1)  {
				left = mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.println("No. of Comparisons = "+count);
		return -1;
	}
	
	// Binary Search by Salary
	public static int searchBySalary(Employee arr[],double key,int size) {
		int left=0, right=size-1, mid=0, count=0;
		while(left<=right) {
			mid = (left+right)/2;
			count++;
			if(arr[mid].getSalary() == key) {
				System.out.println("No. of Comparisons = "+count);
				return mid;
			}
			else if(arr[mid].getSalary() >key) {
				right=mid-1;
			}
			else {
				left=mid+1;
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
		
			//Comparator to sort array by id
		class IdComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee e1, Employee e2) {
			int diff = e1.getEmpid() - e2.getEmpid();
				return diff;
			}
		}	
		
		//Comparator to sort array by Name
		class NameComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee e1, Employee e2) {
			int diff = e1.getName().compareTo(e2.getName());
				return diff;
			}
		}	
		
		//Compartor to sort array by Salary
		class SalaryComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee e1, Employee e2) {
			int diff = Double.compare(e1.getSalary(),e2.getSalary());
				return diff;
			}
		}	
			
//		Arrays.sort(arr,new IdComparator());  //Sorting by ID
//		System.out.println("Enter the Id to Search = ");
//		int key = sc.nextInt();
//		int res = searchById(arr, key, arr.length);
		
//		Arrays.sort(arr,new NameComparator());  //Sorting by Name
//		for(Employee e:arr)
//			System.out.println(e);
//		System.out.println("Enter the Name to Search = ");
//		String key = sc.next();
//		int res = searchByName(arr, key, arr.length);
		
		Arrays.sort(arr,new SalaryComparator());  //Sorting by Salary
		System.out.println("Enter the Salary to Search = ");
		double key = sc.nextDouble();
		int res = searchBySalary(arr, key, arr.length);
		
		if(res != -1) {
			System.out.println("Key Found at Index "+res);
		}
		else {
			System.out.println("Key Not Found");
		}
		
		System.exit(1);
	}

}

package com.sunbeam;

/* 5. Write a function to sort employees by their salary.  */

public class MainEmployeeSort
{
	
	//Selection Sort
	public static void sortBySalary (Employee arr[],int N)
	{
		for (int i=0; i<N-1; i++)
		{
			for (int j=i+1; j<N; j++)
			{
				if(arr[i].getSalary() > arr[j].getSalary())
				{
					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) 
	{

		Employee [] arr = new Employee[7];
		arr[0] = new Employee(5,"Chetan",5000.25);
		arr[1] = new Employee(1,"Sankalp",5050.25);
		arr[2] = new Employee(3,"Chaitanya",6000.25);
		arr[3] = new Employee(4,"Sarvesh",7500.75);
		arr[4] = new Employee(2,"Shubham",5300.25);
		arr[5] = new Employee(6,"Nilesh",5010.55);
		arr[6] = new Employee(7,"Girish",8000.25);
		
		System.out.println("Before Sort :  ");
		for(Employee e:arr)
		{
			System.out.println(e);
		}
		sortBySalary(arr, arr.length);
		System.out.println("After Sort :  ");
		for(Employee e:arr)
		{
			System.out.println(e);
		}
		
	}

}

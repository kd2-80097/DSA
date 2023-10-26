package com.sunbeam;

import java.util.Scanner;

/* 4. Implement linear search algorithm to find the nth occurence of the given element. 
 * If nth occurrence is not found, return -1.  */

public class NthAppearance
{
	
	public static int linearSearch (int arr[], int key,int n) 
	{
		int count = 0;
		for(int i=0; i<arr.length; i++) 
		{
			if(key == arr[i])
			{
				count ++;
				if(count == n)
				{
					return i;
				}
			}
			
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,4,8,2,3,4,6,8,9,1};
		
		System.out.println("Enter the No = ");
		int key = sc.nextInt();
		System.out.println("Enter the n'th occurance n = ");
		int n = sc.nextInt();
		
		int res = linearSearch(arr, key, n);
		if(res != -1)
		{
		System.out.println("Index at which n'th occurance occurs = "+res);
		}
		else
			System.out.println("No n'th occurance Occurs."+res);

	}

}

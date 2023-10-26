package com.sunbeam;

import java.util.Scanner;

/* 6. to find rank of an element in a stream of integers.
rank: rank of a given integer "x", in stream is 
"total no. of ele's less than or equal to x (including x).  
	
	Input: { 10, 20, 15, 3, 4, 4, 1 }
	Ouput: Rank of 4 is: 4     */

public class ElementRank 
{

	public static int searchRank(int arr[], int key)
	{
		int count=0;
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]<=key)
			count++;
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter the No to find Its Rank = ");
		int key = sc.nextInt();
		int res = searchRank(arr, key);
		System.out.println("Rank of "+key+" = "+res);
	}

}

package com.sunbeam;

import java.util.Arrays; 

/* 1. Write a selection sort function to sort array and returns no of comparisions. */

public class SelectionSort 
{
	
	public static void selectionSort(int arr[],int N) 
	{
		int count = 0;
		int iterations = 0;
		for(int i=0; i<N-1; i++) 
		{
			iterations++;
			for(int j=i+1; j<N; j++)
			{
				count++;
				if(arr[i]>arr[j]) 
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("No of Comparisons = "+count);
		System.out.println("No of Iterations = "+iterations);
	}

	public static void main(String[] args) 
	{
		int arr[] = {16,58,98,67,72,52,26,31,9,67};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("After Sort : "+Arrays.toString(arr));
	}

}

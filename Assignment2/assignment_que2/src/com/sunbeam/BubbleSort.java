package com.sunbeam;

import java.util.Arrays;

/* 2. Write a bubble sort function to sort array and returns no of comparisions.  */

public class BubbleSort {
	
//	public static void bubbleSort(int arr[],int N)
//	{
//		int count = 0;
//		int iteration = 0;
//		for(int i=1; i<N; i++)
//		{
//			iteration ++;
//			for(int j=0; j<N-1; j++) 
//			{
//				count ++;
//				if(arr[j] > arr[j+1])
//				{
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1]= temp;
//				}
//			}
//		}
//		System.out.println("No of Comparisons = "+count);
//		System.out.println("No of Iterations = "+iteration);
//	}
	
	//improved sort with reduced comparisons and able to handle Sorted Array
	public static void newBubbleSort(int arr[],int N)
	{
		int count = 0;
		int iteration = 0;
		for(int i=1; i<N; i++)
		{
			iteration ++;
			int flag = 0;
			for(int j=0; j<N-i; j++) 
			{
				count ++;
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
					flag ++;
				}
			}
			if(flag == 0)
				break;
		}
		System.out.println("No of Comparisons = "+count);
		System.out.println("No of Iterations = "+iteration);
	}

	public static void main(String[] args) {
		
		int arr[] = {56,48,26,45,78,98,36,45,16,20};
		int arr1[] = {12,23,34,54,68,69,75,79,81,92,97}; 
		
		System.out.println("Before Sort : "+Arrays.toString(arr));
		//bubbleSort(arr, arr.length);
		newBubbleSort(arr, arr.length);
		System.out.println("After Sort : "+Arrays.toString(arr));
		
		System.out.println("Before Sort : "+Arrays.toString(arr1));
		newBubbleSort(arr1, arr1.length);
		System.out.println("After Sort : "+Arrays.toString(arr1));
	}

}

package com.sunbeam;

import java.util.Arrays;

/* 4. Modify the insertion sort algorithm to sort the array in descending order */

public class DescendingInsertionSort {
	
	public static void insertionSort(int arr[], int N) 
	{
		int count = 0;
		int iteration = 0 ;
		for(int i = 1 ; i < N ; i++) 
		{
			iteration ++;
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] < temp) 
			{
				count++;
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("No of Comparisons = "+count);
		System.out.println("No of Iterations = "+iteration);
	}

	public static void main(String[] args) {
		
         int arr[] = {12,45,48,55,95,32,68,76,36,37,75,82};
		
		System.out.println("Before Sort : "+Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("After Sort : "+Arrays.toString(arr));
		
	}

}

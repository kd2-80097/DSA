package assignment_que3;

import java.util.Arrays;

/* 3. Write a insertion sort function to sort array and returns no of comparisions. */

public class InsertionSort {
	
	public static void insertionSort(int arr[], int N) 
	{
		int count = 0;
		int iteration = 0 ;
		for(int i = 1 ; i < N ; i++) 
		{
			iteration ++;
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) 
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
		
		int arr[] = {12,45,48,75,95,12,48,76,36,37,75,82};
		
		System.out.println("Before Sort : "+Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("After Sort : "+Arrays.toString(arr));
		
	}

}

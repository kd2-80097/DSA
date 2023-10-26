package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int size, int key) {
		int left=0, right=size-1, mid=0,count = 0;
		while(left<=right) {
			count++;
			mid=(left+right)/2;
			if(arr[mid] == key) {
				System.out.println("No. of Comparisons = "+count);
				return mid;
			}
			else if(key > arr[mid]) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		System.out.println("No. of Comparisons = "+count);
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {98,87,78,72,56,42,39,28,22,12};
		
		System.out.println("Enter the No to Search = ");
		int key = sc.nextInt();
		int res = binarySearch(arr, arr.length, key);
		if(res != -1) {
			System.out.println("Key Found at Index "+res);
		}
		else {
			System.out.println("Key Not Found");
		}
		
	}

}

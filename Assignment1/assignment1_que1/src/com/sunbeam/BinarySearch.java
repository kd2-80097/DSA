package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int key,int size) {
		int left=0, right=size-1, mid=0, count=0;
		while(left<=right) {
			mid = (left+right)/2;
			count++;
			if(arr[mid] == key) {
				System.out.println("No. of Comparisons = "+count);
				return mid;
			}
			else if(arr[mid]>key) {
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
		int arr[] = {12,56,47,58,98,75,15,46};
		System.out.println("Enter the No to Search = ");
		int key = sc.nextInt();
		int res = binarySearch(arr, key, arr.length);
		if(res != -1) {
			System.out.println("Key Found at Index "+res);
		}
		else {
			System.out.println("Key Not Found");
		}
	}

}

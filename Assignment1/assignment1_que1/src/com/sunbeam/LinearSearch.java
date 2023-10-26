package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int key) {
		int count = 0;
		for(int i=0; i<arr.length ; i++) {
			count++;
			if(arr[i] == key) {
				System.out.println("No. of Comparisons = "+count);
				return i;
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
		int res = linearSearch(arr, key);
		if(res != -1) {
			System.out.println("Key Found at Index "+res);
		}
		else {
			System.out.println("Key Not Found");
		}
		
	}

}

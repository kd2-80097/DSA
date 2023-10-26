package com.sunbeam;

/* 5. find the first non-repeating element:
	Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
	Ouput: 3    */

public class NonRepeating 
{

	public static int firstNonRepeating(int arr[]) 
	{
		int count,dupli=0;
		for(int i=0; i<arr.length; i++)
		{
			count=0;
			for(int j=0; j<arr.length; j++)
			{
				
				if(arr[i] == arr[j])
				{
					count++;
				}
				
			}
			if(count == 1)
			{
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{

		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int res = firstNonRepeating(arr);
		if(res != -1)
		System.out.println("First Non-Repeating Element = "+res);
	}

}

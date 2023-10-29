package com.sunbeam;

public class TestMainReverse
{

	public static void main(String[] args)
	{
        int arr[]= {10,20,30,40,50};
		
		Stack st =new Stack(5);
		System.out.println("Before using stack : ");
		for (int ele:arr) 
		{
			st.push(ele);
			System.out.print(ele+"	");
		}
		
		for(int i=0;i<5;i++)   
		{
			arr[i]=st.pop();  // reversing array using stack
		}
		
		System.out.println("After using stack  : ");
		for (int ele:arr) 
		{
			System.out.print(ele+"	");
		}		// TODO Auto-generated method stub

	}

}

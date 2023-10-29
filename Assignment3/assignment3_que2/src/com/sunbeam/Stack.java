package com.sunbeam;

/* 2. Insert 5 elements in stack and find maximum value in stack without traversing it.  */

public class Stack 
{
	private int arr[];
	private int top;
	private final int SIZE;
	private int max;
	
	public Stack(int size)
	{
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
    public void push(int data) 
    {
		
		if(top==-1)
		{
			top++;
			max=data;
			arr[top] = data;
		}
		else if(data<max) 
		{
			arr[top] = data;
			top++;
			arr[top] = max;
		}
		else if(data>max) 
		{
				top++;
				arr[top] = data;
				max=data;
			
		}	
	}
    
    public int pop() {
		int data = arr[top];
		top--;
		return data;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE -1;
	}
}

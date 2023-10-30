package com.sunbeam;

/* 6. Create stack using queue.  */

public class QueueStack 
{
	private int arr[];
	private int rear, front;
	private final int SIZE;
	
	public QueueStack(int size) 
	{
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	
	public void push(int data) 
	{
		front++;	
		arr[front] = data;
	}
	
	public int pop() 
	{
		int data = arr[front];
		front--;
		return data;
		
	}
	
	public int peek() 
	{
		return arr[front];
	}
	
	public boolean isFull() 
	{
		return front == SIZE -1;
	}
	
	public boolean isEmpty() 
	{
		return front == -1;
	}
}


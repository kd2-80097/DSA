package com.sunbeam;

/* 8. Implement circular queue using counter method */

public class CounterCircularQueue 
{
	private int arr[];
	private int rear, front;
	private final int SIZE;
	private int count;
	public CounterCircularQueue(int size) 
	{
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
		count = 0;
	}
	public void push(int data)
	{
		// a. reposition rear (inc)
		rear = (rear + 1) % SIZE;
		// b. add data at rear index
		arr[rear] = data;
		count++;
	}
	
	public void pop() 
	{
		// a. reposition front
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
		count--;
	}
	
	public int peek() 
	{
		//a. read/return data of front + 1 index
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isFull() 
	{
		if(count == SIZE)
			return true;
		return false;
		//return (front == rear && rear != -1) || (front == -1 && rear == SIZE - 1);
	}
	
	public boolean isEmpty() 
	{
		//return front == rear && rear == -1;
		if(count == 0)
			return true;
		return false;
	}

}

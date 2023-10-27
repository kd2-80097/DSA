package assignment_que7;

/* 7. Write program to implement linear queue in which front and rear starts at 0.  */

public class LinearQueue 
{
	private int arr[];
	private int rear, front;
	private final int SIZE;
	public LinearQueue(int size) 
	{
		SIZE = size;
		arr = new int[SIZE];
		front = 0;
		rear = 0;
	}
	public void push(int data) 
	{
		// a. reposition rear (inc)
		rear++;
		// b. add data at rear index
		arr[rear] = data;
	}
	
	public void pop() 
	{
		// a. reposition front
		front++;
	}
	
	public int peek() 
	{
		//a. read/return data of front + 1 index
		return arr[front + 1];
	}
	
	public boolean isFull() 
	{
		return rear == SIZE -1;
	}
	
	public boolean isEmpty() 
	{
		return rear == front;
	}

}

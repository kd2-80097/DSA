package com.sunbeam;

public class StackQueue 
{

	private Stack st1;
	private Stack st2;
	private  final  int SIZE;
	
	int count=-1;
	
    public StackQueue(int size)
    {
		SIZE=size;
		this.st1 =new Stack(SIZE);
		this.st2 =new Stack(SIZE);
    }

    public void push(int data) 
    {
	
    	while (!st1.isEmpty())//push all elements into st2
    		st2.push(st1.pop()); 

    	st1.push(data);	
    	count++;

    	while (!st2.isEmpty()) //push all elements again into st1 
    		st1.push(st2.pop()); 
    }

    public int pop() 
    {
    	count--;
	
		return st1.pop();
    }
    
    public boolean isEmpty() 
    {
    	return count==-1;
    }

    public boolean isFull() 
    {
    	return count==SIZE-1;
    }
}

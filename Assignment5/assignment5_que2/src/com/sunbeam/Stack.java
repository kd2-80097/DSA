package com.sunbeam;

public class Stack {
	
	private List l;
	
	public Stack()
	{
		l = new List();
	}
	
	public void push(int value)
	{
		l.addFirst(value);
	}
	
	public void pop()
	{
	    l.deleteFirst();
	}
	
	public String peek()
	{
		int res;
	    res = l.getData();
	    return "Peeked data :"+res;
	}
	

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.pop();
		System.out.println(s.peek());

	}

}

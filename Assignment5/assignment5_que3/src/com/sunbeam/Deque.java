package com.sunbeam;

public class Deque 
{
	private List l;
	
	public Deque()
	{
		l = new List();
	}
	
	public void frontPush(int value)
	{
		l.addFirst(value);
	}
	
	public void frontPop()
	{
		l.deleteLast();
	}
	
	public void rearPop()
	{
		l.deleteFirst();
	}
	
	public String peek()
	{
		int val = l.getData();
		return "Peeked Element : "+val;
	}

}

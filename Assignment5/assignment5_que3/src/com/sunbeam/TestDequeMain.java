package com.sunbeam;

public class TestDequeMain 
{

	public static void main(String[] args)
	{
		Deque d = new Deque();
		
		d.frontPush(30);
		d.frontPush(20);
		d.frontPush(10);
		System.out.println(d.peek());
		d.rearPop();
		System.out.println(d.peek());
	}

}

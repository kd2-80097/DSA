package com.sunbeam;

public class TestMain {

	public static void main(String[] args) 
	{
		List l = new List();
		
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.addFirst(40);
		l.addFirst(50);
		l.addFirst(60);
		l.addFirst(70);
		
		l.displayList();
		System.out.println(" ");
		l.reverseList();
		l.displayList();

	}

}

package com.sunbeam;

public class TestMain 
{

	public static void main(String[] args) 
	{
		List l = new List();
		
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.addFirst(40);
		l.displayList();
		System.out.println(" ");
		
		l.insertBeforeNode(30, 25);
		l.displayList();
		System.out.println(" ");
		
		l.addFirst(50);
		l.displayList();
		System.out.println(" ");
		l.insertAfterNode(40,45);
		l.displayList();
	}

}

package com.sunbeam;

public class TestMain 
{

	public static void main(String[] args) 
	{
		List l = new List();
		
		l.addFirst(11);
		l.addFirst(25);
		l.addFirst(96);
		l.addFirst(78);
		l.addFirst(82);
		l.addFirst(50);
		l.addFirst(30);
		System.out.print("Before Sort : ");
		l.displayList();
		
	    l.bubbleSort(l);
		System.out.println(" ");
		
		System.out.print("After Sort : ");
		l.displayList();
		
	}

}

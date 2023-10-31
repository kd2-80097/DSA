package com.sunbeam;

public class TestMain {

	public static void main(String[] args) {

		List l = new List();
//		l.addAtPosition(10, 1);
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.addLast(60);
		l.addAtPosition(50, 8);
		l.fDisplay();
//		l.deleteFirst();
//		l.deleteLast();
		l.deleteAtPosition(6);
		System.out.println();
		l.fDisplay();
		//l.rDisplay();
	}

}

package com.sunbeam;

public class TestMain {

	public static void main(String[] args) {
		
		SinglyLinearLinkedList l = new SinglyLinearLinkedList();
		
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.displayList();
		
		System.out.println();
		
		l.deleteLast();
		l.displayList();

	}

}

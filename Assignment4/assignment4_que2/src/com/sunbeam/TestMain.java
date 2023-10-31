package com.sunbeam;

public class TestMain {

	public static void main(String[] args) {
		
		SinglyCircular s = new SinglyCircular();
		
		s.addFirst(10);
		s.addFirst(30);
		s.addFirst(40);
		
		s.addLast(55);
        s.display();
		System.out.println();
		s.addPosition(90, 1);
		s.addPosition(70, 5);
        s.display();
		System.out.println();
		s.deleteFirst();
		s.deleteLast();
		s.deletePosition(1);

		s.display();

	}

}

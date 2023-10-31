package com.sunbeam;

/* 2. Implement stack and queue using linked list. */

public class List 
{
 	private class Node
 	{
 		private int data;
 		private Node next;
 		private Node prev;
 		public Node(int value)
 		{
 			data = value;
 			next = null;
 			prev = null;
 		}
 	}
 	
 	private Node head = null;
 	public List()
 	{
 		head = null;
 	}
 	
 	public boolean isEmpty()
 	{
 		return head == null;
 	}
 	
 	public void addFirst(int value)
 	{
 		Node nn = new Node(value);
 		if(isEmpty())
 		{
 			head = nn;
 			head.next = nn;
 			head.prev = nn;
 		}
 		else
 		{
 			nn.next = head;
 			nn.prev = head.prev;
 			head.prev.next = nn;
 			head.prev = nn;
 			head = nn;
 		}
 	}
 	
 	public void deleteFirst()
 	{
 		if (isEmpty())
 		{
 			System.out.println("List Is Empty");
 		}
 		else if(head.next == head)
 			head = null;
 		else
 		{
 			head.next.prev = head.prev;
 			head.prev.next = head.next;
 			head = head.next;
 		}
 	}
 	
 	public int getData()
 	{
 		return head.data;
 	}

}

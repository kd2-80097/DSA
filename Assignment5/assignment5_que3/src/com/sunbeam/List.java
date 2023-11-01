package com.sunbeam;

public class List 
{
	public class Node
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
	
	private Node head;
	private Node tail;
	public List()
	{
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addFirst(int value)
	{
		Node nn = new Node(value);
		if(isEmpty())
			head = tail = nn;
		nn.next = head;
		head.prev = nn;
		head = nn;
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			System.out.println("List Is Empty");
		else if (head.next == null)
			head = tail =null;
		else
		{
			head = head.next;
			head.prev = null;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else if(head.next == null)
			head = tail = null;
		else
		{
			tail = tail.prev;
			tail.next = null;
		}
			
	}
	
	public int getData()
	{
		return tail.data;
	}

}

package com.sunbeam;

/*  3. Write a function to find middle node in a linked list.  */

public class List 
{
	class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data = value;
			next = null;
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
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
		
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			Node trav = tail;
			trav.next = newnode;
			tail = newnode;
		}
	}
	
	public void displayList()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			Node trav = head;
			while(trav != null)
			{
				System.out.print(trav.data+" ");
				trav = trav.next; 
			}
			
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			Node trav = head;
			head = trav.next; 
		}
		
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			Node trav = head;
			while(trav.next.next != null )
				trav = trav.next;
			trav.next = null;
			tail = trav;
			
		}	
	}
	
	// To find Middle Element
	public int findMiddle() 
	{
		Node fast=head;
		Node slow=head;
		
		while(fast!=null && fast.next!=null) 
		{
			fast=fast.next.next;
			slow=slow.next;
		}		
		return slow.data;
	}

}

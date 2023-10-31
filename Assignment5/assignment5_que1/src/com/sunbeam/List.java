package com.sunbeam;

/*  1. Implement add and delete at position in doubly circular linked list.  */

public class List 
{
	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		public Node (int value)
		{
			data = value;
			next = null;
			prev = null;
		}
	}
	private Node head;
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
	
	public void addLast(int value)
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
		}
	}
	
	public void addAtPosition(int value, int pos)
	{
		Node nn = new Node(value);
		if(isEmpty())
		{
			head = nn;
			head.next = nn;
			head.prev = nn;
		}
		else if(pos <= 1)
		{
			addFirst(value);
		}
		else
		{
			Node trav = head;
			for(int i=1; i<pos-1 && trav.next != head; i++)
				trav = trav.next;
			nn.next = trav.next;
			nn.prev = trav;
			trav.next.prev = nn;
			trav.next = nn;
		}			
	}
	
	public void deleteFirst() 
	{
		if(isEmpty())
			return;
		else if(head.next == head)
		{
			head = null;
		}
		else 
		{
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	public void deleteLast() 
	{
		if(isEmpty())
			return;
		else if(head.next == head)
		{
			head = null;
		}
		else 
		{
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	
	public void deleteAtPosition(int pos)
	{
		if(isEmpty())
			return;
		else if(head.next == head)
		{
			head = null;
		}
		else if(pos <= 1)
		{
			deleteFirst();
		}
		else
		{
			Node trav = head;
	        for(int i=1; i<pos && trav.next != head; i++)
	        	trav = trav.next;
	        trav.prev.next = trav.next;
	        trav.next.prev = trav.prev;
		}
	}
	
	public void fDisplay()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			System.out.print("Forward List :");
			Node trav = head;
			do
			{
				System.out.print(trav.data+" ");
				trav = trav.next;
			}while(trav != head);
		}
	}
	
	public void rDisplay()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			System.out.print("Reverse List :");
			Node trav = head.prev;
			do
			{
				System.out.print(trav.data+" ");
				trav = trav.prev;
			}while(trav != head.prev);
		}
	}
	
}

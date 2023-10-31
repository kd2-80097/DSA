package com.sunbeam;

public class SinglyCircular 
{
	public class Node
	{
		private int data;
		private Node next;
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	public SinglyCircular()
	{
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return tail == null; 
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty()) 
		{
			newnode.next=newnode;
			tail=newnode;
		//	count++;
			return;
		}
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;		
		}
		//count++;
	}
	
	public void addLast(int value) 
	{
		Node newnode = new Node(value);
		if(isEmpty()) 
		{
			newnode.next=newnode;
			tail=newnode;
		//	count++;
		}
		else//advantage of tail to add last only in singly list
		{
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
		//count++
	}
	public void addPosition(int value, int pos) 
	{
		Node newnode = new Node(value);			
		if(isEmpty()) 
		{
			newnode.next=newnode;
			tail=newnode;
		}
		else if(pos<=1)
		{
			newnode.next=tail.next;
			tail.next=newnode;
			//count++;
			return;
			//addFirst(value);
		}
		else 
		{
		    Node trav=tail.next;//trav at first node  
		    for(int i=1; i< pos-1 && trav != tail; i++) 
			   trav=trav.next;
			   newnode.next=trav.next;//establish link first 			   
			   trav.next=newnode;
			   if(trav==tail)//if trav at last node
				   tail=newnode; 	  
		}
	}
	
	void deleteFirst() 
	{
		if(isEmpty()) 
		{
			System.out.println("List is Empty ");
			return;
		}
		else
		{
			tail.next=tail.next.next;
		}
	}
	
	void deleteLast() 
	{
		if(isEmpty()) 
		{
			System.out.println("List is Empty ");
			return;
		}
		else 
		{
			Node trav=tail.next;
			while(trav.next !=tail)
				trav=trav.next;
			
			trav.next=tail.next;
			tail=trav;
		}
	}
	
	void deletePosition(int pos) 
	{
		if(isEmpty()) 
		{
			System.out.println("List is Empty ");
			return;
		}
		else if(pos<=1)
		{
			tail.next=tail.next.next;	
		}
		else if (tail.next == tail)
			tail=null;		
		else
		{
			Node trav=tail.next;
			for(int i=1; i< pos-1 && trav.next != tail; i++) 
				   trav=trav.next;
			
			if(trav.next == tail)
				tail=trav;
			
			trav.next=trav.next.next;	
		}
	}
	
	void display() {
	    if (isEmpty()) {
	        System.out.println("List is Empty ");
	        return;
	    }
	    Node trav = tail.next;
	    do {
	        System.out.print("   " + trav.data);
	        trav = trav.next;
	    } while (trav != tail.next);
	}

}

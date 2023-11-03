package com.sunbeam;

/*  9. Write two different functions which return maximum and 
     minimum value from the linked list respectively.     */ 
 

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
	
	public int getMax() 
	{
        if (head == null) 
        {
        	throw new IllegalStateException("The linked list is empty.");
        }
        int max = head.data;
        Node current = head;
        while (current != null) 
        {
            if (current.data > max) 
            {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int getMin() 
    {
        if (head == null) 
        {
            throw new IllegalStateException("The linked list is empty.");
        }
        int min = head.data;
        Node current = head;
        while (current != null) 
        {
            if (current.data < min) 
            {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

}

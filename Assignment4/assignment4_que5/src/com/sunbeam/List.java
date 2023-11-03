package com.sunbeam;

/*  5. In singly linear list implement following operations.
	i. insert a new node after a given node
	ii. insert a new node before a given node    */

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
	
	//After Given Node
	public void insertAfterNode(int valToSearch, int valToInsert) 
	{
        Node newnode = new Node(valToInsert);
        Node current = head;
        while (current != null) 
        {
            if (current.data == valToSearch) 
            {
            	newnode.next = current.next;
                current.next = newnode;
                return; 
            }
            current = current.next;
        }      
        System.out.println("Not Found In The List.");
    }
	
	
    //Before Given Node
    public void insertBeforeNode(int valToSearch, int valToInsert) 
    {
        Node newnode = new Node(valToInsert);

        if (head == null) 
        {
            System.out.println("List Is Empty");
            return;
        }
        if (head.data == valToSearch) 
        {
        	newnode.next = head;
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null) 
        {
            if (current.next.data == valToSearch) 
            {
            	newnode.next = current.next;
                current.next = newnode;
                return; // Node inserted, exit the loop
            }
            current = current.next;
        }
        System.out.println("Not Found In The List.");
    }

}

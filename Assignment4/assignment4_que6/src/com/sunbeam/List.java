package com.sunbeam;

import com.sunbeam.List.Node;

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
	
	public Node getHead() 
	{
		return head;
	}

	public void setHead(Node head) 
	{
		this.head = head;
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
	
	public int length() 
	{
		 int length = 0;
		    Node trav = head;
		    while (trav != null) 
		    {
		        length++;
		        trav = trav.next;
		    }
		    return length;
	}
	
	public static void bubbleSort(List list) 
	{
        int n = list.length();
        
        for (int pass = 0; pass < n - 1; pass++)
        {
            Node currentNode = list.getHead();
            Node nextNode = currentNode.next;
            Node prevNode = null;
            boolean swap = false;

            for (int i = 0; i < n - pass - 1; i++)
            {
                if (currentNode.data > nextNode.data) 
                {
                    if (prevNode == null) // at the head of the linked list, and a swap is going to happen 
                    	//with the first node in the list
                        list.setHead(nextNode);
                    else 
                    	prevNode.next=nextNode;
                    
                    currentNode.next=nextNode.next;
                    nextNode.next=currentNode;

                    prevNode = nextNode;
                    nextNode = currentNode.next;
                    swap = true;
                } 
                else 
                {
                	prevNode = currentNode;
                    currentNode = nextNode;
                    nextNode = nextNode.next;
                }
            }

            if (!swap) {
                // If no Swapping then list is already sorted.
                break;
            }
        }
    }

}

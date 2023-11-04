package com.sunbeam;

/*  10. Implement menudriven program to maintain linked list of employees 
    and provide below operations.
 
	i. Add employee (Perfrom any add operation)
	ii. Display all employees
	iii. Search employee by name
	iv. Delete employee by empid
	v. Update salary of employee        */

public class List 
{
	public class Node
	{
		private Employee data;
		private Node next;
		
		public Node(Employee e)
		{
			data = e;
			next = null;
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
	
	public void addFirst(Employee e)
	{
		Node nn = new Node(e);
		
		if(isEmpty())
			head = nn;
		else
		{
			nn.next = head;
			head = nn;
		}
			
	}
	
	public void searchByName(String name)
	{
		if(isEmpty())
			System.out.println("List Is Empty"); 
		else
		{
			Node trav = head;
			while(trav != null)
			{
				if(trav.data.getEmpname().equalsIgnoreCase(name))
				{
					System.out.println("Employee Found : "+trav.data);
					return;
				}
				trav = trav.next;
			}
		}
		System.out.println("Employee Not Found");
	}
	
	public void deleteById(int id)
	{
		if(isEmpty())
		{
			System.out.println("List Is Empty");
			return;
		}
		else if(head.next == null && head.data.getEmpid() == id)
		{
			head = null;
			System.out.println("Employee Information Deleted");
			return;
		}
		else
		{
			Node trav = head;
			while(trav.next != null && trav != null)
			{
				if(trav.next.data.getEmpid() == id)
				{
					trav.next = trav.next.next;
					System.out.println("Employee Information Deleted");
					return;
				}
				trav = trav.next;
			}	
		}
		System.out.println("Employee Doesn't Exist");
	}
	
	public void updateSalary(int id,double sal)
	{
		if(isEmpty())
		{
			System.out.println("List Is Empty");
			return;
		}
		
		else if(head.next == null && head.data.getEmpid() == id)
		{
			head.data.setSalary(sal);
			System.out.println("Employee Salary Updated");
			return;
		}
		else
		{
			Node trav = head;
			while(trav != null)
			{
				if(trav.data.getEmpid() == id)
				{
					trav.data.setSalary(sal);
					System.out.println("Employee Salary Updated");
					break;
				}
				trav = trav.next;
			}
		}
		System.out.println("Employee Doesn't Exist");
	}
	
	public void showAll()
	{
		if(isEmpty())
			System.out.println("Empty List");
		else
		{
			Node trav = head;
			while(trav != null)
			{
				System.out.println(" "+trav.data);
				trav = trav.next;
			}
		}
	}

}

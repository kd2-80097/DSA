package com.sunbeam;

import java.util.Scanner;

public class TestStack {
	
	public static int menu()
	{ 
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("***************************");
		System.out.println("1. PUSH");
		System.out.println("2. POP");
		System.out.println("3. PEEK");
		System.out.println("4. EXIT");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		DescStack st = new DescStack(4);
		int choice;
		while((choice = menu()) != 4)
		{
			switch(choice)
			{
			case 1:
				if(st.isFUll())
				{
					System.out.println("Stack is Full");
				}
				else
				{
				System.out.println("Enter The Element : ");
				int data = sc.nextInt();
				st.push(data);
				}
				break;
			case 2:
				if(st.isEmpty())
				{
					System.out.println("Stack is Empty");
				}
				else
				{
				System.out.println("Popped Element : "+st.pop());
				}
				break;
			case 3:
				if(st.isEmpty())
				{
					System.out.println("Stack is Empty");
				}
				else
				{	
				System.out.println("Peeked Data : "+st.peek());
				}
				break;
			default :
				System.out.println("Wrong Choice...Please Enter Valid Choice");
			}
		}
		System.out.println("Thank You For Using Our Application");
	}

}

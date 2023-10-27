package assignment_que9;

import java.util.Scanner;

public class PriorityTest {

	public static int  operatorsPriority(String opr) 
	{
		int result=0;
		switch(opr) 
		{
		case "+":
			result=2;
			break;
			
		case "-":
			result=2;
		break;
			
		case "*":
			result=1;
		break;
			
		case "/":
			result=1;
		break;		
	
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String opr;
		int priority;
		System.out.println("Enter Operator to find priority :");
		opr=sc.next();
		priority=operatorsPriority(opr);
		if(priority>0)
		System.out.println("Priority of "+priority);
	}

}

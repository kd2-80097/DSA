package com.sunbeam;

/*  1. Implement following algorithms for multi digit numbers
	iii. infix to postfix
	iv. infix to prefix      */

public class Conversion 
{
	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '-':
			return op1 - op2;
		case '+':
			return op1 + op2;
		case '/':
			return op1 / op2;
		case '*':
			return op1 * op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}
	public static int prio(char opr)
	{
		switch(opr) {
		case '$': return 11;
		case '/': return 10;
		case '*': return 10;
		case '%': return 10;
		case '+': return 9;
		case '-': return 9;
		}
		return 0;
	}
	
	public static String infixToPrefix(String infix) {
	    GenericStack<String> st = new GenericStack<>(10);
	    StringBuilder prefix = new StringBuilder();
	    String[] tokens = infix.split("\\s+");

	    for (int i = tokens.length - 1; i >= 0; i--) {
	        String token = tokens[i];

	        if (Character.isDigit(token.charAt(0) ) || Character.isLetter(token.charAt(0)) ) {
	            prefix.insert(0, token + " "); // Insert at the beginning of the prefix expression
	        } else if (token.equals(")")) {
	            st.push(token);
	        } else if (token.equals("(")) {
	            while (!st.isEmpty() && !st.peek().equals(")")) {
	                prefix.insert(0, st.pop() + " "); // Insert at the beginning of the prefix expression
	            }
	            if (!st.isEmpty() && st.peek().equals(")")) {
	                st.pop(); // Discard the ")"
	            } else {
	                // Mismatched parentheses
	                return "Invalid expression";
	            }
	        } else {
	            // Token is an operator
	            char tok = token.charAt(0);

	            // Check priority of the current element with the top-most element of the stack
	            while (!st.isEmpty() && prio(st.peek().charAt(0)) >= prio(tok)) {
	                prefix.insert(0, st.pop() + " "); // Insert at the beginning of the prefix expression
	            }

	            st.push(token);
	        }
	    }

	    while (!st.isEmpty()) {
	        if (st.peek().equals("(") || st.peek().equals(")")) {
	            return "Invalid expression";
	        }
	        prefix.insert(0, st.pop() + " "); // Insert at the beginning of the prefix expression
	    }

	    return prefix.toString().trim();
	}


	public static String infixToPostfix(String infix) 
	{
		GenericStack<String> st = new GenericStack<>(10);//to push operators
	    StringBuilder postfix = new StringBuilder();//to create postfix string
	    
	    String[] tokens = infix.split("\\s+");

	    for (int i = 0; i < tokens.length; i++)
	    {
	        String token = tokens[i];

	        if (Character.isDigit(token.charAt(0)) )
	            postfix.append(token).append(" ");
	         else 
	        	if (token.equals("(")) 
	        	{
	        		st.push(token);
	        	} else if (token.equals(")"))
	        	{
	        		while (!st.isEmpty() && !st.peek().equals("(")) 
	                postfix.append(st.pop()).append(" ");
	           
	            if (!st.isEmpty() && st.peek().equals("(")) {
	                st.pop(); // Discard the "("
	            } else {
	                // Mismatched parentheses
	                return "Invalid expression";
	            }
	        } else {
	            // Token is an operator
	            char tok = token.charAt(0);

	            // Check priority of the current element with the top-most element of the stack
	            while (!st.isEmpty() && prio(st.peek().charAt(0)) >= prio(tok)) {
	                postfix.append(st.pop()).append(" ");
	            }

	            st.push(token);
	        }
	    }

	    while (!st.isEmpty()) {
	        if (st.peek().equals("(") || st.peek().equals(")")) {
	            return "Invalid expression";
	        }
	        postfix.append(st.pop()).append(" ");
	    }

	    return postfix.toString().trim();
	}

	public static void main(String[] args) 
	{
		String infix = "234 + 15 * 12";
		System.out.println("Infix string is : "+infix);
		System.out.println();
		
		System.out.println("Infix to Postfix : "+infixToPostfix(infix));
		System.out.println("Infix to  Prefix : "+infixToPrefix(infix));
	}

}

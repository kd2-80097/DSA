package com.sunbeam;

/*  1. Implement following algorithms for multi digit numbers
	i. postfix evaluation
	ii. prefix evaluation      */

public class Evaluation 
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
	public static int postfixEvaluation(String postfix) {
	    Stack st = new Stack(20);

	    // Split the postfix expression into tokens using spaces
	    String[] tokens = postfix.split("\\s+");

	    for (int i = 0; i < tokens.length; i++) {
	        String token = tokens[i];

	        if (Character.isDigit(token.charAt(0))) {
	            int num = Integer.parseInt(token);
	            st.push(num);
	        } else {
	            if (st.isEmpty()) {
	                throw new IllegalArgumentException("Invalid postfix expression");
	            }

	            int op2 = st.pop();
	            int op1 = st.pop();
	            int result = calculate(op1, token.charAt(0), op2);
	            st.push(result);
	        }
	    }

	    if (!st.isEmpty() ) {
	        return st.pop();
	    } else {
	        throw new IllegalArgumentException("Invalid postfix expression");
	    }
	}
	
	public static int prefixEvaluation(String prefix) {
	    Stack st = new Stack(20);

	    // Split the prefix expression into tokens using spaces 
	    String[] tokens = prefix.split("\\s+");

	    for (int i = tokens.length - 1; i >= 0; i--)
	    {
	        String token = tokens[i];

	        if (Character.isDigit(token.charAt(0)))
	        {
	            int num = Integer.parseInt(token);
	            st.push(num);
	        } 
	        else 
	        {
	            if (st.isEmpty())
	            {
	                throw new IllegalArgumentException("Invalid prefix expression");
	            }

	            int op1 = st.pop();
	            int op2 = st.pop();
	            int result = calculate(op1, token.charAt(0), op2);
	            st.push(result);
	        }
	    }

	    if (!st.isEmpty()) {
	        return st.pop();
	    } else {
	        throw new IllegalArgumentException("Invalid prefix expression");
	    }
	}
	
	public static void main(String[] args)
	{
		int result;
		String postfix = "12 35 20 * - 10 +";
		System.out.println("Postfix String : " + postfix);
		
		result = postfixEvaluation(postfix);
		System.out.println("Postfix Evaluation : " + result);
		System.out.println();

		String prefix = "- 20 * 40 30";
		System.out.println("Prefix String : " + prefix);
		
		result = prefixEvaluation(prefix);
		System.out.println("Prefix Evaluation : " + result);
		System.out.println();
		
	}

}


	

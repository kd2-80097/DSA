package com.sunbeam;

public class TestMain 
{

	public static void main(String[] args) 
	{
		 Stack st=new Stack(5);
		   st.push(30);
		   st.push(50);
		   st.push(57);
		   st.push(21);
		   st.push(13);
		   System.out.println("Maximunm element in stack is: "+st.peek());

		   st.pop();
		   
	}

}

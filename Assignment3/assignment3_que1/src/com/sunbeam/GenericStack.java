package com.sunbeam;

public class GenericStack <Type>
{
	private Object arr[];
	private int top;
	private final int SIZE;
	int max;

	public GenericStack(int size)
	{
		SIZE = size;
		arr = new Object[SIZE];
		top = -1;
	}

	public void push(Type data) {
		top++;
		arr[top] = data;
	}

	public Type pop() {
		Type data =(Type) arr[top];
		top--;
		return data;
	}

	public Type peek() {
		return  (Type) arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE -1;
	}
}

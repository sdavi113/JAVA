package ch03;

import ch03.stacks.*;

public class ArrayStackTester {


	public static void main(String[] args) {

		BoundedStackInterface<Integer> stack;
		//BoundedStackInterface<String> strStack;

		//default would be only parentheses
		//ours has a size of 5
		stack = new ArrayStack<Integer>(10);
		//strStack = new ArrayStack<String>(2);


		System.out.println("Check empty true: " + stack.isEmpty());
		System.out.println("Check full false: " + stack.isFull());
		try {
		System.out.println("Check top: " + stack.top());
		}
		catch(StackUnderflowException e){
			System.out.println("Stack is empty. Cannot top on empty");

		}
		try {
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
			stack.push(7);
			stack.push(8);
			stack.push(9);
			stack.push(10);
			stack.popSome(5);
		}
		catch(StackOverflowException e) {
			System.out.println(e.getLocalizedMessage());
		}
		//COULD DO THE SAME THING AS STACK WITH STRSTACK IF CHANGE ALL OF THE STACK. TO STRSTACK
		//ALSO CHANGE THE PUSH INTO STRINGS

		System.out.println("Check filled: " + stack.isFull());
		System.out.println("Check top: " + stack.top());
		System.out.println("Check empty: " + stack.isEmpty());
		System.out.println("The element at the specified location is: " + stack.inspector(3));
		System.out.println("The number of elements in the stack is: " + stack.size());
	}
}



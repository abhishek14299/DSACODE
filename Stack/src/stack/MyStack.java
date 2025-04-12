/**
 * MyStack - Implementation of Stack data structure in Java
 * Operations: Push, Pop, Peek, Size, Display
 */
package stack;

import java.util.EmptyStackException;

public class MyStack {
    
    private int top; // Index of the top element in the stack
    private int[] stack; // Array to store stack elements
    private int maxSize; // Maximum capacity of the stack
    
    // Constructor to initialize the stack
    public MyStack(int maxSize) {
        stack = new int[maxSize];
        top = -1; // -1 indicates the stack is empty
    }
    
    // Method to check if the stack is empty
    public boolean isEmpty() {
        // Time Complexity: O(1)
        // The operation only checks a single condition.
        if(top < 0) { // Changed the comparison to "< 0" for accuracy
            return true;
        }
        return false;
    }
    
    // Method to check if the stack is full
    public boolean isFull() {
        // Time Complexity: O(1)
        // The operation only checks a single condition.
        if(top == stack.length - 1) {
            return true;
        }
        return false;
    }
    
    // Method to push an element onto the stack
    public void push(int val) {
        // Time Complexity: O(1)
        // Adding an element involves updating the array at the "top" index.
        if(!isFull())
            stack[++top] = val; // Increment top and add the element
        else
            throw new StackOverflowError("Stack is full!"); // Error if stack is full
    }
    
    // Method to pop an element from the stack
    public int pop() {
        // Time Complexity: O(1)
        // Removing an element involves retrieving and decrementing the top index.
        if(!isEmpty()) {
            int popVal = stack[top];
            stack[top--] = 0; // Optional: Clear the value (not mandatory for functionality)
            return popVal;
        }
        else
            throw new EmptyStackException(); // Error if stack is empty
    }
    
    // Method to peek at the top element of the stack
    public int peek() {
        // Time Complexity: O(1)
        // Accessing the top element is a single array index operation.
        if(!isEmpty()) {
            return stack[top];
        }
        else
            throw new EmptyStackException(); // Error if stack is empty
    }
    
    // Method to get the current size of the stack
    public int size() {
        // Time Complexity: O(1)
        // The size is calculated by a single arithmetic operation.
        return top + 1;
    }
    
    // Method to display all elements in the stack
    public void display() {
        // Time Complexity: O(n)
        // The operation iterates through all stack elements up to the "top" index.
        for(int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println(); // For better output formatting
    }
    
    // Notes:
    // - The stack is implemented using a fixed-size array, so it cannot dynamically resize.
    // - Stack overflow or underflow exceptions must be handled properly during usage.
    
   /*
    Time Complexity:

		isEmpty, isFull, push, pop, peek, size: O(1)
		display: O(n) (depends on the number of elements in the stack)
	*/
}

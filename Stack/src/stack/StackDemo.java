package stack;

public class StackDemo {

    public static void main(String[] args) {
        // Demonstration of MyStack operations
        
        // Step 1: Create a stack with a capacity of 10
        MyStack stack = new MyStack(10);
        
        // Check if the stack is empty
        System.out.println("Is stack empty: " + stack.isEmpty());
        
        // Attempt to pop an element from an empty stack
        try {
            stack.pop();
        } catch (Exception e) {
            // Handle exception if stack is empty
            System.out.println("Encounter Exception: " + e);
        } 
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(90);
        stack.push(45);
        stack.push(877);
        
        // Display current elements in the stack
        stack.display();
        System.out.println(); // Add a newline for better readability
        
        // Pop the top element and display the updated stack
        System.out.println("Pop an Element from the stack: " + stack.pop());
        System.out.println("Updated stack");
        stack.display();
        System.out.println();
        
        // Push more elements onto the stack
        stack.push(457);
        stack.push(23);
        stack.push(53);
        stack.push(47);
        stack.display();
        System.out.println();
        
        // Pop another element and display the updated stack
        System.out.println("Pop an Element from the stack: " + stack.pop());
        System.out.println("Updated stack");
        stack.display();
        System.out.println();
        
        // Push additional elements to fill the stack
        stack.push(345);
        stack.push(415);
        stack.push(15);
        stack.push(87);
        stack.display();
        System.out.println();
        
        // Check if the stack is full
        System.out.println("Is stack full: " + stack.isFull());
        
        // Attempt to push an element when the stack is full
        try {
            stack.push(101);
        } catch (Exception e) {
            // Handle exception if the stack is full
            System.out.println("Encounter Exception: " + e);
        }
    }
}

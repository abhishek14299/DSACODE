/**
 * Demo program to test the functionality of the MyQueue class.
 * This program demonstrates enqueue, dequeue, display, and exception handling in queue operations.
 */
public class QueueDemo {

    /**
     * Main method to execute queue operations.
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a queue with a maximum size of 4
        MyQueue queue = new MyQueue(4);
        
        // Try to dequeue from an empty queue and catch the exception
        try {
            queue.dequeue();
        } catch (Exception e) {
            System.out.println("Error at Dequeue: " + e); // Print the error message
        }
        System.out.println(); // Add a blank line for better output readability
        
        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(653);
        
        // Display the queue contents before dequeue operation
        System.out.println("Queue Before Dequeue");
        queue.display(); // Display queue elements
        System.out.println(); // Add a blank line
        
        // Dequeue an element from the queue
        System.out.println("Dequeue Element: " + queue.dequeue());
        
        // Display the queue contents after dequeue operation
        System.out.println("Queue After Dequeue");
        queue.display(); // Display queue elements
        System.out.println(); // Add a blank line
        
        // Enqueue more elements
        queue.enqueue(453);
        queue.enqueue(756);
        
        // Display the queue contents before dequeue operation
        System.out.println("Queue Before Dequeue");
        queue.display(); // Display queue elements
        System.out.println(); // Add a blank line
        
        // Dequeue an element from the queue
        System.out.println("Dequeue Element: " + queue.dequeue());
        
        // Display the queue contents after dequeue operation
        System.out.println("Queue After Dequeue");
        queue.enqueue(453); // Enqueue an element after dequeue
        queue.display(); // Display queue elements
        
        // Enqueue another element
        queue.enqueue(54);
        System.out.println();
        
        // Try to enqueue into a full queue and catch the exception
        try {
            queue.enqueue(1054);
        } catch (Exception e) {
            System.out.println("Error at Enqueue: " + e); // Print the error message
        }
    }
}

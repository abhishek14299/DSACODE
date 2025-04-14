import java.util.EmptyStackException;

/**
 * A custom implementation of a circular queue using an array.
 * Methods include enqueue, dequeue, peek, isEmpty, isFull, and display.
 * 
 * Time Complexity:
 * - Enqueue: O(1)
 * - Dequeue: O(1)
 * - Peek: O(1)
 * - isEmpty: O(1)
 * - isFull: O(1)
 * - Display: O(n) (where n is the number of elements in the queue)
 * 
 * Space Complexity: O(maxSize) (array of fixed size)
 */
public class MyQueue {

    // Array to store queue elements
    private int[] queue;

    // Maximum size of the queue
    private int maxSize;

    // Current size of the queue
    private int size;

    // Index pointing to the front element
    private int front;

    // Index pointing to the rear (last) element
    private int rare;

    /**
     * Constructor to initialize the queue with a given maximum size.
     * @param maxSize the maximum number of elements the queue can hold
     */
    public MyQueue(int maxSize) {
        queue = new int[maxSize]; // Allocate space for the queue
        this.maxSize = maxSize;  // Set the maximum size
        size = 0;                // Start with an empty queue
        front = 0;               // Front points to the first index
        rare = -1;               // Rare starts at -1 as the queue is empty
    }

    /**
     * Adds an element to the rear of the queue.
     * @param val the value to enqueue
     * @throws StackOverflowError if the queue is full
     */
    public void enqueue(int val) {
        if (isFull()) {
            throw new StackOverflowError("Queue is Full");
        }
        rare = (rare + 1) % maxSize; // Move rare to the next position in a circular manner
        queue[rare] = val;          // Add the element at the rare position
        size++;                     // Increment the size of the queue
    }

    /**
     * Removes and returns the front element of the queue.
     * @return the value of the removed element
     * @throws EmptyStackException if the queue is empty
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int data = queue[front];    // Retrieve the front element
        front = (front + 1) % maxSize; // Move front to the next position in a circular manner
        size--;                     // Decrement the size of the queue
        return data;                // Return the removed element
    }

    /**
     * Returns the front element of the queue without removing it.
     * @return the value of the front element
     * @throws EmptyStackException if the queue is empty
     */
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue[front];        // Return the front element
    }

    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;           // Queue is empty if size is 0
    }

    /**
     * Checks if the queue is full.
     * @return true if the queue is full, false otherwise
     */
    public boolean isFull() {
        return size == maxSize;     // Queue is full if size equals maxSize
    }

    /**
     * Displays all elements in the queue in order.
     * Elements are displayed starting from the front index.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % maxSize; // Calculate the index using circular logic
            System.out.print(queue[index] + " "); // Display the element at the calculated index
        }
        System.out.println();
    }
}

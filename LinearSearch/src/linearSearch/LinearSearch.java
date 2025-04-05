/**
 * This program demonstrates a linear search algorithm to find a target element 
 * in a given array and displays the total steps taken during the search.
 */
package linearSearch;

public class LinearSearch {

    /**
     * The main method serves as the entry point of the program.
     * It initializes the array and target element, and calls the linear search method.
     */
    public static void main(String[] args) {
        // Define an array of integers
        int[] nums = {4, 56, 78, 12, 89, 36, 4, 51, 247, 8};
        
        // Set the target element to search for in the array
        int target = 247;
        
        // Call the linear search function and store the result
        int result = linearSearch(nums, target);
        
        // Check if the target was found and print the appropriate message
        if (result == -1) 
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index: " + result);
    }
    
    /**
     * This method performs a linear search on the given array to find the target element.
     * 
     * @param nums An array of integers to search in.
     * @param target The element to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    public static int linearSearch(int[] nums, int target) {
        // Initialize the step counter
        int step = 0;
        
        // Get the size of the array
        int size = nums.length;
        
        // Iterate through the array to search for the target
        for (int i = 0; i < size; i++) {
            step++; // Increment step counter for each iteration
            
            // Check if the current element matches the target
            if (nums[i] == target) {
                // Print the total number of steps taken to find the target
                System.out.println("Total number of steps required: " + step);
                return i; // Return the index of the found element
            }
        }
        
        // Print the total number of steps if the target is not found
        System.out.println("Total number of steps required: " + step);
        return -1; // Return -1 to indicate the target was not found
    }
    
    /*
     * Note: As the length of the array increases and the target element is positioned towards the end,
     * the number of steps required to locate the element grows proportionally. 
     * Therefore, the time complexity of this algorithm is O(n), where 'n' is the length of the array.
     */
}

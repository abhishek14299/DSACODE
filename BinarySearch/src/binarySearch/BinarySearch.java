/**
 * Binary Search Implementation
 */
package binarySearch;

/**
 * Main class for running the Binary Search algorithm.
 */
public class BinarySearch {

    /**
     * Main method to test binary search functionality.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Array of sorted numbers
        int[] nums = {1, 5, 7, 9, 12, 26, 35, 48, 78, 98, 147, 159};
        
        // Target element to search
        int target = 159;
        
        // Perform binary search using iterative method
        int result = binarySearch(nums, target);
        
        // Variable to track steps for recursive method
        int step = 0; 
        
        // Print the result of iterative binary search
        if (result == -1) 
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index: " + result);
        
        // Perform binary search using recursive method
        int result1 = binarySearchRecursion(nums, target, 0, nums.length-1, step);
        
        // Print the result of recursive binary search
        if (result1 == -1) 
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index: " + result1);
    }

    /**
     * Iterative method for binary search.
     * 
     * @param nums Array of sorted numbers
     * @param target Element to search for
     * @return Index of the target element, or -1 if not found
     */
    public static int binarySearch(int[] nums, int target) {
        int step = 0; // Track the number of steps required
        int left = 0; // Initialize left boundary
        int right = nums.length - 1; // Initialize right boundary
        
        // Loop until left boundary crosses right boundary
        while (left <= right) {
            // Calculate middle index (to avoid overflow)
            int mid = left + (right - left) / 2;
            step++; // Increment step counter
            // Condition: Check if mid element matches the target
            if (nums[mid] == target) {
                System.out.println("Number of steps required: " + step);
                return mid; // Return index of the target
            }
            // Condition: If mid element is less than the target, move left boundary
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // Condition: If mid element is greater than the target, move right boundary
            else {
                right = mid - 1;
            }
        }
        
        // If target is not found, return -1
        System.out.println("Number of steps required: " + step);
        return -1;
    }

    /**
     * Recursive method for binary search.
     * 
     * @param nums Array of sorted numbers
     * @param target Element to search for
     * @param left Left boundary
     * @param right Right boundary
     * @param step Step counter (passed recursively)
     * @return Index of the target element, or -1 if not found
     */
    public static int binarySearchRecursion(int[] nums, int target, int left, int right, int step) {
        // Base condition: Left boundary crosses right boundary
        if (left <= right) {
            // Calculate middle index (to avoid overflow)
            int mid = left + (right - left) / 2;
            step++; // Increment step counter
            // Condition: Check if mid element matches the target
            if (nums[mid] == target) {
                System.out.println("Number of steps required: " + step);
                return mid; // Return index of the target
            }
            // Condition: If mid element is less than the target, move left boundary
            else if (nums[mid] < target) {
                return binarySearchRecursion(nums, target, mid + 1, right, step);
            }
            // Condition: If mid element is greater than the target, move right boundary
            else {
                return binarySearchRecursion(nums, target, left, mid - 1, step);
            }
        }
        
        // If target is not found, return -1
        System.out.println("Number of steps required: " + step);
        return -1;
    }
    
    /**
     * Binary Search operates on a sorted array to find a target element efficiently.
     * 
     * Time Complexity:
     * - The algorithm divides the search space in half during each iteration or recursion.
     * - This results in a logarithmic time complexity: O(log n), where 'n' is the number of elements in the array.
     * - Logarithmic complexity makes binary search highly scalable for large datasets.
     * 
     * Key Conditions:
     * 1. The input array must be sorted in ascending order for binary search to work.
     * 2. The algorithm compares the target with the middle element in the current search space.
     * 3. Based on the comparison:
     *    - If the target is smaller, the search space is reduced to the left half.
     *    - If the target is larger, the search space is reduced to the right half.
     * 4. The search terminates when the target is found, or the boundaries overlap (left > right).
     * 
     * Significance of 'step' in the Code:
     * - The 'step' counter tracks the number of iterations or recursive calls made during the search process.
     * - It helps measure the efficiency of the search in terms of the number of steps required to locate the target.
     * - This can be useful for analyzing performance and debugging, especially when dealing with large datasets.
     */

}

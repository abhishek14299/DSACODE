/**
 * Java program to implement Insertion Sort.
 */
public class InsertionSort {

    /**
     * Main method to demonstrate insertion sort.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Initialize an array of integers to be sorted
        int nums[] = {4, 45, 1, 2, 6, 5, 98, 89, 5, 75, 45, 1, 561};
        
        // Print the array before sorting
        System.out.println("Array Before Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        // Sort the array using insertionSort method
        insertionSort(nums);
        
        // Print the array after sorting
        System.out.println("\n");
        System.out.println("Array After Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * Method to perform Insertion Sort on an array.
     * @param nums Array of integers to sort
     */
    private static void insertionSort(int[] nums) {
        // Find the size of the array
        int size = nums.length;
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < size; i++) {
            // Key represents the current element to be inserted in the sorted part of the array
            int key = nums[i];
            int j = i - 1;
            
            // Compare and shift elements that are greater than the key to the right
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            
            // Insert the key in its correct position
            nums[j + 1] = key;
        }
    }
    
    /*
     * Time Complexity:
     * Best Case: O(n) - When the array is already sorted.
     * Worst Case: O(n^2) - When the array is sorted in reverse order.
     * Average Case: O(n^2) - For a random arrangement of elements.
     *
     * Space Complexity:
     * O(1) - Insertion sort is an in-place sorting algorithm, so no additional memory is required.
     *
     * Notes:
     * 1. Insertion sort is particularly efficient for small datasets or arrays that are already partially sorted.
     * 2. This algorithm is stable, meaning that it preserves the relative order of equal elements.
     * 3. Not suitable for large datasets as its time complexity scales quadratically with input size.
     */
}

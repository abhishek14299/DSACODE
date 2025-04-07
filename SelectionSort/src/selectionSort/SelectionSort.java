/**
 * Package for Selection Sort implementation.
 */
package selectionSort;

/**
 * A class implementing Selection Sort algorithm.
 */
public class SelectionSort {

    /**
     * The main method to demonstrate sorting using Selection Sort.
     * @param args Command line arguments (not used here).
     */
    public static void main(String[] args) {
        // Declare and initialize an array to be sorted
        int nums[] = {4, 45, 1, 2, 6, 5, 98, 89, 5, 75, 45, 1, 561};
            
        // Print the array before sorting
        System.out.println("Array Before Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
            
        // Call selectionSort method to sort the array
        selectionSort(nums);
            
        // Print the array after sorting
        System.out.println("\n");
        System.out.println("Array After Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
    /**
     * Method to perform Selection Sort on an array.
     * Selection Sort repeatedly selects the smallest element and places it in sorted order.
     * 
     * Time Complexity:
     * Best Case: O(n^2) - Even if the array is already sorted, nested loops still execute.
     * Worst Case: O(n^2) - Maximum comparisons and swaps occur when the array is sorted in reverse order.
     * Average Case: O(n^2) - On average, the number of comparisons remains quadratic.
     * 
     * Space Complexity:
     * Auxiliary Space: O(1) (In-place sorting algorithm, as no extra space is used).
     * 
     * Important Points:
     * 1. Selection Sort is simple but inefficient for large datasets due to quadratic time complexity.
     * 2. Selection Sort is not stable. Equal elements may not retain their relative order after sorting.
     * 3. It is ideal for small datasets or when memory usage is critical (in-place sorting).
     * 
     * @param nums Array to be sorted.
     */
    public static void selectionSort(int[] nums) {
        // Get the size of the array
        int size = nums.length;

        // Loop through the unsorted part of the array
        for (int i = 0; i < size - 1; i++) {
            // Assume the current index as the minimum index
            int minIndex = i;

            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted part
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}

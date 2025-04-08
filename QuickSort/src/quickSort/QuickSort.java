/**
 * QuickSort implementation in Java
 * This program sorts an array of integers using the QuickSort algorithm.
 * Important Notes:
 * - QuickSort is an efficient, divide-and-conquer sorting algorithm.
 * - Time Complexity: 
 *   - Best Case: O(n log n) (when the pivot divides the array into two equal parts).
 *   - Worst Case: O(n^2) (when the array is already sorted or has all identical elements).
 *   - Average Case: O(n log n).
 * - Space Complexity: O(log n) due to recursive calls stack.
 */

package quickSort;

public class QuickSort {

    /**
     * Main method
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize an array to be sorted
        int nums[] = {4, 45, 1, 2, 6, 5, 98, 89, 5, 75, 45, 1, 561};

        // Print the array before sorting
        System.out.println("Array Before Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Define the left and right boundaries for sorting
        int left = 0;
        int right = nums.length - 1;

        // Call quickSort method to sort the array
        quickSort(nums, left, right);

        // Print the array after sorting
        System.out.println("\n");
        System.out.println("Array After Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * Recursive QuickSort method
     * @param nums Array to be sorted
     * @param left Left boundary index
     * @param right Right boundary index
     */
    private static void quickSort(int[] nums, int left, int right) {
        if (left <= right) {
            // Partition the array and get the pivot index
            int piIndex = partition(nums, left, right);

            // Recursively sort elements before and after the pivot
            quickSort(nums, left, piIndex - 1); // Sort left subarray
            quickSort(nums, piIndex + 1, right); // Sort right subarray
        }
    }

    /**
     * Partition method
     * @param nums Array to be partitioned
     * @param left Left boundary index
     * @param right Right boundary index
     * @return The index of the pivot element
     * Important Notes:
     * - Pivot is chosen as the last element in the array (nums[right]).
     * - Elements less than the pivot are placed to its left, and greater elements to its right.
     */
    private static int partition(int[] nums, int left, int right) {
        // Choose the pivot element (last element in the array)
        int pivot = nums[right];

        // Variable to track position for swapping elements
        int swapPos = left - 1;

        // Traverse the array and rearrange elements around the pivot
        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swapPos++;
                // Swap nums[swapPos] and nums[i] to place smaller element before pivot
                int temp = nums[swapPos];
                nums[swapPos] = nums[i];
                nums[i] = temp;
            }
        }

        // Place the pivot in its correct sorted position
        int temp = nums[swapPos + 1];
        nums[swapPos + 1] = nums[right];
        nums[right] = temp;

        // Return the pivot index
        return swapPos + 1;
    }
}

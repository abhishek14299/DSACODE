/**
 * MergeSort Program
 * Implements the Merge Sort algorithm in Java to sort an integer array.
 * Time Complexity:
 * - Best case: O(n log n)
 * - Average case: O(n log n)
 * - Worst case: O(n log n)
 * Space Complexity: O(n)
 */

package mergeSort;

public class MergeSort {

    /**
     * Main method - Entry point of the program.
     */
    public static void main(String[] args) {
        // Declare and initialize an array to be sorted
        int nums[] = {4, 45, 1, 2, 6, 5, 98, 89, 5, 75, 45, 1, 561};

        // Print the array before sorting
        System.out.println("Array Before Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Define the left and right boundaries for sorting
        int left = 0;
        int right = nums.length - 1;

        // Call mergeSort method to sort the array
        mergeSort(nums, left, right);

        // Print the array after sorting
        System.out.println("\n\nArray After Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * Recursively divides and sorts the array using Merge Sort.
     *
     * @param nums The array to be sorted.
     * @param left The starting index of the subarray.
     * @param right The ending index of the subarray.
     */
    private static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            // Find the middle point to divide the array
            int mid = left + (right - left) / 2;

            // Recursively sort the left half
            mergeSort(nums, left, mid);

            // Recursively sort the right half
            mergeSort(nums, mid + 1, right);

            // Merge the sorted halves
            merge(nums, left, mid, right);
        }
    }

    /**
     * Merges two sorted subarrays into a single sorted subarray.
     *
     * @param nums The array to be merged.
     * @param left The starting index of the first subarray.
     * @param mid The middle index (end of the first subarray).
     * @param right The ending index of the second subarray.
     */
    private static void merge(int[] nums, int left, int mid, int right) {
        // Calculate the sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays for left and right halves
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = nums[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = nums[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;

        // Compare elements from both arrays and copy the smaller element
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            } else {
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array
        while (i < n1) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array
        while (j < n2) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }
}

/**
 * Important Notes:
 * - The Merge Sort algorithm is stable, meaning it maintains the relative order of equal elements.
 * - It is suitable for sorting linked lists as well as arrays.
 * - The algorithm is divide-and-conquer based, recursively dividing the array into subarrays until it can merge them.
 */

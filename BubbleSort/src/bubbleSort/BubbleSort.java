package bubbleSort;

public class BubbleSort {

    public static void main(String[] args) {
        
        // Initialize an array of integers to be sorted
        int nums[] = {4, 45, 1, 2, 6, 5, 98, 89, 5, 75, 45, 1, 561};
        
        // Print the array before sorting
        System.out.println("Array Before Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        // Call bubbleSort method to sort the array
        bubbleSort(nums);
        
        // Print the array after sorting
        System.out.println("\n");
        System.out.println("Array After Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // BubbleSort method to sort the array
    public static void bubbleSort(int[] nums) {
        int size = nums.length;  // Determine the size of the array
        boolean swapFlag = false;  // Flag to track if any swaps were made in a pass

        // Outer loop to track the number of passes through the array
        for (int i = 0; i < size - 1; i++) {
            swapFlag = false;  // Reset the flag at the start of each pass

            // Inner loop to compare adjacent elements and swap if needed
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapFlag = true;  // Set the flag if a swap is made
                }
            }
            
            // If no swaps were made, the array is already sorted; exit early
            if (!swapFlag) {
                break;
            }
        }
    }
}

/*
 * Bubble Sort Algorithm
 * 
 * Time Complexity:
 * 1. Best Case (Already Sorted): O(n)
 *    - The algorithm makes n comparisons but performs no swaps since the array is already sorted.
 *    - An optimization is added using a flag to check if any swaps occur during a pass (early exit).
 * 2. Worst Case (Reverse Order): O(n^2)
 *    - The algorithm performs n passes, and on each pass, it compares up to n elements (nested loop structure).
 * 3. Average Case: O(n^2)
 *    - On average, Bubble Sort performs close to n passes with multiple comparisons and swaps.
 * 
 * Important Notes:
 * 1. Bubble Sort is an in-place sorting algorithm, meaning it doesn't require extra memory for a temporary array.
 * 2. It is stable as it preserves the relative order of equal elements.
 * 3. Adding a flag can optimize the algorithm by breaking out of the loop early if no swaps are made during a pass.
 * 4. Bubble Sort is rarely used for large datasets due to its inefficiency but is a great tool for learning sorting concepts.
 */


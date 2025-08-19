public class PrintSubArrays {
    // Using a nested loop to print all subarrays of an array
    public static void main(String[] args) {
        int[] array = {1, 2, 3}; // Example array
        printSubArrays(array); // Print all subarrays
    }

    public static void printSubArrays(int[] array) {
        System.out.println("All subarrays of the array:");
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                // Print the subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println(); // New line after each subarray
            }
        }
    }
    // Time Complexity: O(n^2) - The function uses nested loops to generate all subarrays.
}

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example array to search
        int target = 30; // Value to search for
        int index = linearSearch(numbers, target); // Perform linear search

        if (index != -1) {
            System.out.println("Value found at index: " + index); // Print found index
        } else {
            System.out.println("Value not found in the array."); // Print not found message
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
    // Time Complexity: O(n) - Linear search checks each element until it finds the target or reaches the end of the array. Worse case occurs when the target is not present or is at the end of the array.
}

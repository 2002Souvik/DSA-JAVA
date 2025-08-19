public class ReverseAnArray {
    // Using a two-pointer technique to reverse an array
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        reverseArray(array); // Reverse the array
        System.out.println("Reversed array: " + java.util.Arrays.toString(array)); // Print the reversed array
    }

    public static void reverseArray(int[] array) {
        int left = 0; // Start pointer
        int right = array.length - 1; // End pointer

        while (left < right) {
            // Swap elements at left and right pointers
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++; // Move left pointer to the right
            right--; // Move right pointer to the left
        }
    }
    // Time Complexity: O(n) - The function processes each element in the array once.
}

public class smallestLargestNumberInArray {
    // Using a linear search to find the largest and smallest number in an array
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 20}; // Example array
        findSmallestLargest(numbers); // Find the smallest and largest number
    }

    public static void findSmallestLargest(int[] array) {
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize smallest to the largest possible integer

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if current element is greater
            }
            if (array[i] < smallest) {
                smallest = array[i]; // Update smallest if current element is smaller
            }
        }

        System.out.println("The smallest number in the array is: " + smallest); // Print the smallest number
        System.out.println("The largest number in the array is: " + largest); // Print the largest number
    }
    // Time Complexity: O(n) - The function checks each element in the array to find the largest and smallest numbers.
}

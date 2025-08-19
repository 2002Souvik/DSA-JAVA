public class AllPairsInArray {
    // Using a nested loop to find all pairs in an array
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4}; // Example array
        findAllPairs(array); // Find and print all pairs
    }

    public static void findAllPairs(int[] array) {
        System.out.println("All pairs in the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println("(" + array[i] + ", " + array[j] + ")"); // Print each pair
            }
        }
    }
    // Time Complexity: O(n^2) - The function uses a nested loop to check each pair of elements.
}

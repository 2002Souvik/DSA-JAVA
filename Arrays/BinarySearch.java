public class BinarySearch {
    // Using binary search to find an element in a sorted array
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11}; // Example sorted array
        int target = 5; // Element to search for
        int result = binarySearch(sortedArray, target); // Perform binary search

        if (result != -1) {
            System.out.println("Element found at index: " + result); // Print the index if found
        } else {
            System.out.println("Element not found in the array."); // Print if not found
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0; // Start index
        int right = array.length - 1; // End index

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid index

            if (array[mid] == target) {
                return mid; // Return mid index if target is found
            } else if (array[mid] < target) {
                left = mid + 1; // Move left pointer to mid + 1 if target is greater
            } else {
                right = mid - 1; // Move right pointer to mid - 1 if target is smaller
            }
        }

        return -1; // Return -1 if target is not found
    }
    // Time Complexity: O(log n) - The function divides the search space in half each time.
}

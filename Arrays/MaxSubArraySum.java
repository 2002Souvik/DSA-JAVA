public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -1, 2}; // Example array
        int maxSum = findMaxSubArraySum_III(array); // Find maximum subarray sum using Brute Force
        System.out.println("Maximum subarray sum (Brute Force): " + maxSum);
    }

    //// kadane's Algorithm - O(n) time complexity
    public static int findMaxSubArraySum_III(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }


    //// Prefix Sum Approach - O(n^2) time complexity
    // public static int findMaxSubArraySum_II(int[] array) {
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefixSum[] = new int[array.length];

    //     prefixSum[0] = array[0];

    //     for (int i = 1; i < array.length; i++) {
    //         prefixSum[i] = prefixSum[i - 1] + array[i];
    //     }

    //     for (int start = 0; start < array.length; start++) {
    //         for (int end = start; end < array.length; end++) {
    //             int currentSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
            
    //             if (currentSum > maxSum) {
    //                 maxSum = currentSum;
    //             }
    //         }
    //     }
    //     return maxSum;
    // }

    //// Brute Force Approach - O(n^3) time complexity
    // public static int findMaxSubArraySum_I(int[] array) {
    //     int maxSum = Integer.MIN_VALUE; // Initialize to the smallest integer
    //     for (int start = 0; start < array.length; start++) {
    //         for (int end = start; end < array.length; end++) {
    //             int currentSum = 0;
    //             // Calculate the sum of the subarray from start to end
    //             for (int k = start; k <= end; k++) {
    //                 currentSum += array[k];
    //             }
    //             // Update maxSum if currentSum is greater
    //             if (currentSum > maxSum) {
    //                 maxSum = currentSum;
    //             }
    //         }
    //     }
    //     return maxSum; // Return the maximum subarray sum found
    // }
}

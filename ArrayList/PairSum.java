import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        numbers.add(5);

        int target = 17;
        boolean result = hasPairWithSum(numbers, target);
        System.out.println("Pair with sum " + target + " exists: " + result);

        boolean resultOptimized = hasPairWithSumOptimized(numbers, target);
        System.out.println("Pair with sum " + target + " exists (Optimized): " + resultOptimized);
    }

    public static boolean hasPairWithSum(ArrayList<Integer> numbers, int target) {
        // Brute Force Approach O(n^2)
        for(int i = 0; i < numbers.size(); i++) {
            for(int j = i + 1; j < numbers.size(); j++) {
                if(numbers.get(i) + numbers.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasPairWithSumOptimized(ArrayList<Integer> numbers, int target) {
        // Two Pointer Approach O(n log n) due to sorting
        numbers.sort(Integer::compareTo);
        int left = 0;
        int right = numbers.size() - 1;

        while(left < right) {
            int currentSum = numbers.get(left) + numbers.get(right);
            if(currentSum == target) {
                return true;
            } else if(currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
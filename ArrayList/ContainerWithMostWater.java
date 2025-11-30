import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();

        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        int maxWater = StoreWater(heights);
        System.out.println("Maximum water that can be stored: " + maxWater);
        
        int maxWaterOptimized = StoreWaterOptimized(heights);
        System.out.println("Maximum water that can be stored (Optimized): " + maxWaterOptimized);
    }

    public static int StoreWater(ArrayList<Integer> heights) {
        int maxWater = 0;
        // Brute Force Approach O(n^2)
        for(int i = 0; i < heights.size(); i++) {
            for(int j = i + 1; j < heights.size(); j++) {
                int height = Math.min(heights.get(i), heights.get(j));
                int width = j - i;
                int currentWater = height * width;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }

    public static int StoreWaterOptimized(ArrayList<Integer> heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.size() - 1;

        // Two Pointer Approach O(n)
        while(left < right) {
            int height = Math.min(heights.get(left), heights.get(right));
            int width = right - left;
            int currentWater = height * width;
            maxWater = Math.max(maxWater, currentWater);

            if(heights.get(left) < heights.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}

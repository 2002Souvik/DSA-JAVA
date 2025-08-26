import java.util.*;
import java.util.Arrays;
public class ContainsDuplicate {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        System.out.println(checkDuplicate_III(arr));
    }

    //// HashSet Approach - O(n) time complexity
    public static boolean checkDuplicate_III(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<array.length; i++) {
            if(set.contains(array[i])) {
                return true;
            }
            set.add(array[i]);
        }
        return false;
    }

    //// Best Approach - O(n) time complexity
    public static boolean checkDuplicate_II(int[] array) {
        Arrays.sort(array);
        for(int i = 0; i<array.length-1; i++) {
            if(array[i] == array[i+1]) {
                return true;
            }
        }
        return false;
    }
    
    //// Brute Force Approach - O(n^2) time complexity
    public static boolean checkDuplicate_I(int[] array) {
        for(int i = 0; i< array.length; i++) {
            for(int j = i+1; j<array.length; j++) {
                if(array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}

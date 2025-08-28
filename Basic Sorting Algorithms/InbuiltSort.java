import java.util.Arrays;
public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Arrays.sort(arr);
        // Arrays.sort(arr, 2, 5); // Sort from index 2 to 4
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

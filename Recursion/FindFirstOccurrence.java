public class FindFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int index = findFirstOccurrence(arr, target, 0);
        System.out.println("First occurrence of " + target + " is at index: " + index);
    }

    public static int findFirstOccurrence(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findFirstOccurrence(arr, target, index + 1);
    } 
}

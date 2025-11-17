public class FindLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int index = findLastOccurrence(arr, target, arr.length - 1);
        System.out.println("Last occurrence of " + target + " is at index: " + index);
    }

    public static int findLastOccurrence(int[] arr, int target, int index) {
        if (index < 0) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findLastOccurrence(arr, target, index - 1);
    }
}

public class IncreasingOrderNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Increasing order from 1 to " + n + ":");
        printIncreasingOrder(1, n);
    }

    public static void printIncreasingOrder(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        printIncreasingOrder(current + 1, n);
    }
}
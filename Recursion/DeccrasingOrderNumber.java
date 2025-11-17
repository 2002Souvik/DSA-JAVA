public class DeccrasingOrderNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Decreasing order from " + n + " to 1:");
        printDecreasingOrder(n);
    }

    public static void printDecreasingOrder(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printDecreasingOrder(n - 1);
    }
}

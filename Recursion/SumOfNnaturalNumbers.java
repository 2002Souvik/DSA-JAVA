public class SumOfNnaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfN(n));
    }

    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfN(n - 1);
    }
}
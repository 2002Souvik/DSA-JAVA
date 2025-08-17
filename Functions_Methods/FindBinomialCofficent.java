public class FindBinomialCofficent {
    public static int binomialCoefficient(int n, int r) {
    // Base case: if r == 0 or r == n, return 1
    if (r == 0 || r == n) {
        return 1;
    }

    // Invalid case: if r > n, return 0
    if (r > n) {
        return 0;
    }

    // Recursive step:
    // C(n, r) = C(n-1, r-1) + C(n-1, r)
    return binomialCoefficient(n - 1, r - 1) + binomialCoefficient(n - 1, r);
}


    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter n (total items): ");
        int n = scanner.nextInt();
        System.out.print("Enter r (items to choose): ");
        int r = scanner.nextInt();
        scanner.close();
        int result = binomialCoefficient(n, r);
        System.out.println("Binomial Coefficient C(" + n + ", " + r + ") is: " + result);
    }
}

public class ProductOfab {
    public static void printProduct(int a, int b) {
        System.out.println("Product of " + a + " and " + b + " is: " + (a * b));
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        scanner.close();
        printProduct(a, b);
    }
}

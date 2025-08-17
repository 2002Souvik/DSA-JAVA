import java.util.Scanner;

public class FunctionParameterSyntex {
    public static void printMessage(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        scanner.close();
        printMessage(a, b);
    }
}

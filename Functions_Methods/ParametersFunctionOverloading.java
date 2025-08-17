public class ParametersFunctionOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Call the method with two parameters
        int result1 = sum(num1, num2);
        System.out.println("Sum of two numbers: " + result1);
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Call the method with three parameters
        int result2 = sum(num1, num2, num3);
        System.out.println("Sum of three numbers: " + result2);
        
        scanner.close();
    }
}

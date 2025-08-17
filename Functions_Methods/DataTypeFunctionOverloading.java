public class DataTypeFunctionOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Sum of two integers
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        int intResult = sum(int1, int2);
        System.out.println("Sum of two integers: " + intResult);
        
        // Sum of two floats
        System.out.print("Enter first float: ");
        float float1 = scanner.nextFloat();
        System.out.print("Enter second float: ");
        float float2 = scanner.nextFloat();
        float floatResult = sum(float1, float2);
        System.out.println("Sum of two floats: " + floatResult);
        
        scanner.close();
    }
}

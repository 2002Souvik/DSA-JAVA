public class Arithmetic_Operator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        // Binary Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        // Unary Arithmetic Operators
        System.out.println("Unary Plus: " + (+a));
        System.out.println("Unary Minus: " + (-a));
        // pre-increment and post-increment (Unary Operators)
        System.out.println("Pre-increment: " + (++a)); // Increment before use
        System.out.println("Post-increment: " + (a++)); // Increment after use
        System.out.println("Value after Post-increment: " + a); // 11
        System.out.println("Pre-decrement: " + (--b)); // Decrement before use
        System.out.println("Post-decrement: " + (b--)); // Decrement after use
        System.out.println("Value after Post-decrement: " + b); // 4
    }
}
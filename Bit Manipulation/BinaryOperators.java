public class BinaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = b - a;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = b / a;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = b % a;
        System.out.println("Remainder: " + remainder);

        // Bitwise AND
        int andResult = a & b;
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b;
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR: " + xorResult);

        // Left Shift
        int leftShift = a << 2;
        System.out.println("Left Shift: " + leftShift); // a = a * 2^b, b-it positions to the left

        // Right Shift
        int rightShift = b >> 2;
        System.out.println("Right Shift: " + rightShift); // b = b / 2^a, a-it positions to the right

        // Unsigned Right Shift
        int unsignedRightShift = b >>> 2;
        System.out.println("Unsigned Right Shift: " + unsignedRightShift);

        // 1s Complement
        int onesComplement = ~a;
        System.out.println("1s Complement: " + onesComplement);

        // 2s Complement
        int twosComplement = ~a + 1;
        System.out.println("2s Complement: " + twosComplement);
        
    }
}

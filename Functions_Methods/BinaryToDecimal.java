public class BinaryToDecimal {
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int base = 0;

        // Convert binary int to decimal
        while (binary > 0) {
            int lastDigit = binary % 10; // Get the last digit (0 or 1)
            decimal += lastDigit * Math.pow(2, base); // Add value to decimal
            binary = binary / 10; // Remove the last digit
            base++; // Increase power (2^0, 2^1, 2^2, ...)
        }

        return decimal;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a binary number (as integer): ");
        int binaryInput = scanner.nextInt(); // Taking int input
        scanner.close();

        int decimalOutput = binaryToDecimal(binaryInput);
        System.out.println("Decimal equivalent: " + decimalOutput);
    }
}

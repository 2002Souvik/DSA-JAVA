public class printReverseOfaNumberDigits {
    public static void main(String[] args) {
        int number = 12345;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            System.out.print(digit + " "); // Print the digit
            number /= 10; // Remove the last digit from the original number
        }
    }
}

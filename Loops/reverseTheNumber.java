public class reverseTheNumber {
    public static void main(String[] args) {
        int number = 12345; // You can change this value to reverse any number
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}

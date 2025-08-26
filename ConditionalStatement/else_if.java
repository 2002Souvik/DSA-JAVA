public class else_if {
    public static void main(String[] args) {
        int number = 15; // Example number

        // Use of if-else statement to check if the number is even, odd, or zero
        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
}

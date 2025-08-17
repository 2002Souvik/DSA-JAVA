public class numberFloydsTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows for Floyd's Triangle
        int number = 1; // Starting number

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number for the next position
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

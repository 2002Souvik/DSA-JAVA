public class InvertedStarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the inverted star pattern

        // Outer loop for each row
        for (int i = n; i >= 1; i--) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

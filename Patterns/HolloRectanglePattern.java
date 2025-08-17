public class HolloRectanglePattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the rectangle pattern
        int cols = 10; // Number of columns for the rectangle pattern

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for each column in the row
            for (int j = 1; j <= cols; j++) {
                // Print '*' for the first and last row, and first and last column
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for inner part of the rectangle
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

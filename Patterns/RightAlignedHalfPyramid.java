public class RightAlignedHalfPyramid {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print spaces (decreasing)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars (increasing)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to next line
            System.out.println();
        }
    }
}

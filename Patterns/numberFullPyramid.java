public class numberFullPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the full pyramid pattern

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

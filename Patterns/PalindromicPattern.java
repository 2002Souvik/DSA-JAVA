public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the palindromic pattern

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Inner loop for printing increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

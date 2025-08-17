public class SolidRombos {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the solid rhombus pattern

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing stars in each row
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

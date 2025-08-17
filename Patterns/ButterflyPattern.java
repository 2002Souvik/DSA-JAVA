public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the butterfly pattern

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

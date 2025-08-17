public class Triangle0_1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the triangle pattern

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing 0s and 1s in each row
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

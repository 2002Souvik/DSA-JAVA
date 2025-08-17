public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping the iteration when i = " + i);
                continue; // Skip the rest of the loop body when i is 5
            }
            System.out.println("Current value of i: " + i);
        }
        System.out.println("Loop has ended.");
    }
}

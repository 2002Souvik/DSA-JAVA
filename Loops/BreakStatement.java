public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i is 5
            }
            System.out.println("Current value of i: " + i);
        }
        System.out.println("Loop has ended.");
    }
}

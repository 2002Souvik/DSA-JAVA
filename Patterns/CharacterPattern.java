public class CharacterPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the character pattern
        char ch = 'A'; // Starting character

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing characters in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; // Move to the next character
            }
            // Move to the next line after each row
            System.out.println();
            // ch++; // Move to the next character
        }
    }
}

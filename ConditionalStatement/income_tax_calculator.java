import java.util.Scanner;

public class income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt(); // Input income
        int tex;

        if(income < 500000) {
            tex = 0; // No tax for income less than 500000
        } else if(income >= 500000 && income < 1000000) {
            tex = (int)(income * 0.1); // 10% tax for income between 500000 and 1000000
        } else if(income >= 1000000 && income < 2000000) {
            tex = (int)(income * 0.2); // 20% tax for income between 1000000 and 2000000
        } else {
            tex = (int)(income * 0.3); // 30% tax for income above 2000000
        }

        System.out.println("The income tax is: " + tex); // Output the calculated tax
        sc.close(); // Close the scanner to prevent resource leaks
    }    
}

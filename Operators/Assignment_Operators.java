public class Assignment_Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Using the assignment operator
        a = b;
        System.out.println("Value of a after assignment: " + a);

        // Using the += operator
        a += b;
        System.out.println("Value of a after += operation: " + a);

        // Using the -= operator
        a -= b;
        System.out.println("Value of a after -= operation: " + a);

        // Using the *= operator
        a *= b;
        System.out.println("Value of a after *= operation: " + a);

        // Using the /= operator
        a /= b;
        System.out.println("Value of a after /= operation: " + a);

        // Using the %= operator
        a %= b;
        System.out.println("Value of a after %= operation: " + a);
    }
}

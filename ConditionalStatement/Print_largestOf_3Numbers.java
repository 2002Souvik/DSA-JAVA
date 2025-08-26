public class Print_largestOf_3Numbers {
    public static void main(String[] args) {
        int a = 10; // First number
        int b = 20; // Second number
        int c = 15; // Third number

        // Use of if-else statement to find the largest of three numbers
        if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
    }
}

public class Largest_of2Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // use of if-else statement to find the largest of two numbers
        if (a > b) {
            System.out.println("The largest number is: " + a);
        } else if (b > a) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}

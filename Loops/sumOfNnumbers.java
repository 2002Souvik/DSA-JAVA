public class sumOfNnumbers {
    public static void main(String[] args) {
        int n = 10; // You can change this value to sum numbers up to any N
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}

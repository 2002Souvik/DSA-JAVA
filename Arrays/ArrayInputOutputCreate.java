public class ArrayInputOutputCreate {
    public static void main(String[] args) {
        // Example of creating an array
        int[] numbers = new int[5]; // Create an array of integers with size 5

        // Assign values to the array
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i * 10; // Assign multiples of 10
        }

        // Output the array values
        for (int i = 1; i<numbers.length; i++) {
            System.out.println(numbers[i]); // Print each number in the array
        }
    }
}

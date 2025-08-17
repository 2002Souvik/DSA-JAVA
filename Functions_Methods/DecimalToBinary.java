public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        String binary = "";

        // Convert decimal to binary using remainder method
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary; // Add remainder at the front
            decimal = decimal / 2;
        }

        // If input was 0, return "0"
        if (binary.equals("")) {
            return "0";
        }

        return binary;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalInput = scanner.nextInt(); // Taking int input
        scanner.close();

        String binaryOutput = decimalToBinary(decimalInput);
        System.out.println("Binary equivalent: " + binaryOutput);
    }
}

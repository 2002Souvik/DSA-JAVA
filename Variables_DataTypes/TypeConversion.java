import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        // byte->short->int->long->float->double
        byte b = 10;
        short s = b; // byte to short
        System.out.println("Short value: " + s);
        int i = s; // short to int
        System.out.println("Int value: " + i);
        long l = i; // int to long
        System.out.println("Long value: " + l);
        float f = l; // long to float
        System.out.println("Float value: " + f);
        double d = f; // float to double
        System.out.println("Double value: " + d);

        // but you cannot convert double to byte directly
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextFloat() // error: incompatible types: possible lossy conversion from float to int
        float num = sc.nextInt(); // float to int conversion is allowed
        System.out.println(num);
        
        sc.close();
    }
}

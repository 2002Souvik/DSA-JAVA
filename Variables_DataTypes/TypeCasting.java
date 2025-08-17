import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float a = 25.5f; // float value
        // int b = a; // error: incompatible types: possible lossy conversion from float to int
        // int b = (int) a; // explicit type casting from float to int
        // System.out.println(b);

        // float number = 99.999f; // float value
        // int marks2 = (int) number; // explicit type casting from float to int
        // System.out.println(marks2); // prints 99

        char ch = 'a'; // character value
        int num = ch; // implicit type casting from char to int
        System.out.println(num);
        sc.close();
    }
}

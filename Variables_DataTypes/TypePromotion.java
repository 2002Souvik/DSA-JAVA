public class TypePromotion {
    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) a);
        // System.out.println((int) b);
        // System.out.println(b-a); // prints 1
        
        // System.out.println(a); // prints 'a'


        // int a = 10;
        // float b = 20.5f;
        // long c = 30;
        // double d = 40;
        // double ans = a + b + c + d; // type promotion occurs here
        // System.out.println(ans); // prints 100.5

        byte b = 5;
        byte a = (byte) (b * 2); // explicit type casting from int to byte
        System.out.println(a); // prints 10
    }
}

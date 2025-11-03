public class Polymorphism_MethodOverloding {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of two integers: " + math.add(5, 10));
        System.out.println("Sum of three integers: " + math.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + math.add(5.5, 10.5));
        System.out.println("Sum of two floats: " + math.add(5.5f, 10.5f));
        System.out.println("Sum of four integers: " + math.sum(5, 10, 15, 20));
    }
}

// Class demonstrating method overloading
class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add two floats
    float add(float a, float b) {
        return a + b;
    }

    // Overloaded method to add four integers
    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

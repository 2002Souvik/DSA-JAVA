public class HybridInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        cat.scratches();
    }  
}

// Base class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Derived/Sub class Cat
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
    
    void scratches() {
        System.out.println("Scratching...");
    }
}



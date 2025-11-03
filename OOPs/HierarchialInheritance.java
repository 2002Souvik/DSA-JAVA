public class HierarchialInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
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
}

// Derived/Sub class Dog
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}



public class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
// Parent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

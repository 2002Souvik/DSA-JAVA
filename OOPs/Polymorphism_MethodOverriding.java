public class Polymorphism_MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Output: Animal makes a sound

        Dog myDog = new Dog();
        myDog.sound(); // Output: Dog barks

        Cat myCat = new Cat();
        myCat.sound(); // Output: Cat meows
    }
}

// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}



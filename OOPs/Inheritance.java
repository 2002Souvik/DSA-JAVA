public class Inheritance {
    public static void main(String[] args) {
        Fish goldenFish = new Fish();
        goldenFish.color = "golden";
        goldenFish.fins = 4;
        goldenFish.eat();
        goldenFish.breathe();
        goldenFish.swim();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eating...");
    }

    void breathe() {
        System.out.println("breathing...");
    }
}

// Derived/Sub class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swimming...");
    }
}

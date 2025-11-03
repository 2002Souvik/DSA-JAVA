public class AbstractClassesExmp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        System.out.println("Dog color: " + dog.color);
        
        dog.changeColor("black");
        System.out.println("Dog new color: " + dog.color);

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();
        System.out.println("Chicken color: " + chicken.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
        System.out.println("Animal Constructor Called");
    }

    void eat() {
        System.out.println("Animal Eating...");
    }

    abstract void walk();
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog Constructor Called");
    }

    void changeColor(String newColor) {
        color = newColor;
    }

    void walk() {
        System.out.println("Dog walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken Constructor Called");
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

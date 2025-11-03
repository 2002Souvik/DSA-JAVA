public class MultiLevelInheritance {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
    }  
}

// Grandparent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Child class
class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

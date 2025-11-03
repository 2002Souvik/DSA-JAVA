public class SuperKeyword {
    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println("Horse color: " + horse.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown";
        System.out.println("Horse constructor called");
    }
}

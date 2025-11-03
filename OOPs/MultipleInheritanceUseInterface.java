public class MultipleInheritanceUseInterface {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatPlants();
        bear.eatMeat();
    }
}

interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Eating plants...");
    }

    public void eatMeat() {
        System.out.println("Eating meat...");
    }
}

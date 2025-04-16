public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Buttercup");
        Animal sheep2 = registry.createSheep("Blossom");

        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        sheep1.makeSound();
        sheep2.makeSound();
        cow.makeSound();
        horse.makeSound();
    }
}

public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baaa!", "Grass", "Daisy");
        cowPrototype = new Cow(4, "Mooo!", "Hay");
        horsePrototype = new Horse(4, "Neighh!", "Oats", "Brown");
    }

    public Animal createSheep(String name) {
        Sheep cloned = (Sheep) sheepPrototype.clone();
        cloned.setName(name);
        return cloned;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}

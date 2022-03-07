public abstract class Animal {
    protected String name;
    protected Habitat habitat;

    public Animal(String name, Habitat habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public Animal(String name) {
        this.name = name;
        this.habitat = Habitat.City;
    }

    public String getInfo() {
        return "My name is " + name + "and I live in the " + habitat;
    }

    public abstract String sound();
}
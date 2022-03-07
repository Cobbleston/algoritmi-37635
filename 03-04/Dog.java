public class Dog extends Animal {
    private Size size;

    public Dog(String name, Size size) {
        super(name);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ". My size is " + size;
    }

    public String sound() {
        return "Bau Bau";
    }
}
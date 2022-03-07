public class Man implements AnimalInterface, MammalsInterface {
    private String name;
    private Habitat habitat;
    private String city;
    private String surname;

    public Man(String name, String surname, String city) {
        // super(name, Habitat.City);
        this.habitat = Habitat.City;
        this.name = name;
        this.city = city;
        this.surname = surname;
    }

    @Override
    public String getInfo() {
        return "My name is " + name + " " + surname + " and I live in the " + habitat + " of " + city;
    }

    public String sound() {
        return "Bla Bla";
    }

    public int fur () {
        return 0;
    }

    public int gestationalTime() {
        return 0;
    }
}
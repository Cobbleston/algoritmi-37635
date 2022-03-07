public class TestAnimal {

    public static void main(String[] args) {
        //Animal general_man = new Animal("Mario Rossi", Habitat.City);
        //Animal general_dog = new Animal("Pluto");
        //Animal general_fish = new Animal("Nemo", Habitat.Sea);
        Animal pluto = new Dog("Pluto", Size.MEDIUM);
        Man mario = new Man("Mario", "Rossi", "Bologna");
        
        //Animal[] A = {general_man, general_dog, general_fish, pluto, mario};
        //Animal[] A = {pluto, mario};

        //for(Animal a : A)
        //    System.out.println(a.sound() + " : " + a.getInfo());
        
        System.out.println(pluto.getInfo());
        System.out.println(mario.getInfo());

        //System.out.println("pluto" + pluto.sound());
        //System.out.println(pluto.toString());
        //System.out.println(man.toString());

        //System.out.println(mario.name + " " + mario.surname);
    }
}
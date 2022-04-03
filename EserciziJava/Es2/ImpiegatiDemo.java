public class ImpiegatiDemo {
    public static void main(String[] args) {
         
        Impiegato i1 = new Impiegato("Simone", 8, 10, 2001, 2000);
        Impiegato i2 = new Impiegato("Cioni", 12, 9, 2001, 3000);
        Stagista i3 = new Stagista("Grimandi", 1, 1, 2000, 300, 124, 123456);

        i2.set("Davide");

        Impiegato L[] = {i1, i2, i3};

        for (Impiegato i : L)
            System.out.println(i.get() + "\n");
    }
}

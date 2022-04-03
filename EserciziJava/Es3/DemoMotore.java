public class DemoMotore {
    public static void main(String[] args) {
        Motore m1 = new Motore(tipoMotore.benzina, 120, 4);
        Motore m2 = new Motore(tipoMotore.diesel, 200, 8);
        Motore m3 = new Motore(tipoMotore.metano, 100, 2);
        Motore m4 = new Motore(tipoMotore.diesel, 90, 5);
        Motore m5 = new Motore(tipoMotore.benzina, 80, 3);

        Motore T[] = { m1, m2, m3, m4, m5 };

        for (Motore i : T)
            System.out.println(i + "\t" + i.potenza());
    }
}

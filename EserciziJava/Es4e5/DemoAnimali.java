import java.time.Year;

public class DemoAnimali {
    public static void main(String[] args) {
        Gatto g = new Gatto("Flash", Year.of(2000));
        Cane c = new Cane("Pluto", Year.of(2010));
        Tacchino t = new Tacchino("Gary", Year.of(2013));

        IAnimale L[] = { g, c, t };

        for (IAnimale i : L)
            System.out.println(i.toString());

        
        System.out.println("\n");

        System.out.println("G vs C:\t" + g.confronta(c));
        System.out.println("C vs T:\t" + c.confronta(t));
        System.out.println("T vs G:\t" + t.confronta(g));
    }
}

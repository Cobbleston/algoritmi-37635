import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class DemoCollections {

    public static void main(String args[]) {
        List<Integer> L = new ArrayList<>();

        for(int i = 0; i < 5; i++)
            L.add(i);
        
        System.out.println("Primo Elemento");
        for(int i = 0; i < L.size(); i++)
            System.out.println(L.get(i));
        
        System.out.println("Secondo metodo");
        for(Integer i : L)
            System.out.println(i);

        System.out.println("Terzo metodo");
        Iterator iter = L.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
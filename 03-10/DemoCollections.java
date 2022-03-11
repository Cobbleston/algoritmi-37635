import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class DemoCollections {

    public static void main(String args[]) {
        //List<Integer> L = new ArrayList<>();
        List<Integer> L1 = new LinkedList<>();
        List<Integer> L2 = new ArrayList<>();

        long sum1 = 0;
        long sum2 = 0;

        for(int i = 0; i < 10000; i++)
            L1.add(i);
            L2.add(i);
        
        //System.out.println("Primo Elemento");
        //for(int i = 0; i < L.size(); i++)
        //    System.out.println(L.get(i));
        //
        //System.out.println("Secondo metodo");
        //for(Integer i : L)
        //    System.out.println(i);
        //System.out.println("Terzo metodo");
        //Iterator iter = L.iterator();
        //while(iter.hasNext())
        //    System.out.println(iter.next());

        for(int i = 0; i < 100000; i++)
            sum += L1.get(i);
        

    }
}
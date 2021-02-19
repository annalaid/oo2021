package IndependantWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;


public class Lists {
    public static void main(String[] args) {
        vectors();
    }

    public static void arrayLists() {
        ArrayList<String> flowers = new ArrayList<String>();

        flowers.add("Roses");
        flowers.add("Irises");
        flowers.add("Tulips");
        flowers.add("Sunflowers");
        
        System.out.println(flowers);
        System.out.println(flowers.get(0));  

        flowers.set(0, "Lavender");
        System.out.println(flowers);
        
        flowers.add("Orchids");
        flowers.remove(0);
        System.out.println(flowers);

        System.out.println("Listis on " + flowers.size() + " lille");

        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i));
          }

        Collections.sort(flowers);
        
        System.out.println(flowers);
        for (String i : flowers) {
            System.out.println(i);
          }
    }

    public static void linkedLists() {
        LinkedList<String> flowers = new LinkedList<String>();

        flowers.add("Roses");
        flowers.add("Irises");
        flowers.add("Tulips");
        flowers.add("Sunflowers");
        System.out.println(flowers);

        flowers.addFirst("Orchids");
        System.out.println(flowers);

        flowers.addLast("Gardenias");
        System.out.println(flowers);

        System.out.println(flowers.getFirst());
        System.out.println(flowers.getLast());

        flowers.removeFirst();
        System.out.println(flowers);
        flowers.removeLast();
        System.out.println(flowers);
        
    }

    public static void vectors() {
        Vector<Integer> v1 = new Vector<Integer>();
        Vector<Integer> v2 = new Vector<Integer>(15);
        Vector<Integer> v3 = new Vector<Integer>(20);
        Vector<Integer> v4 = new Vector<Integer>(10, 5);
        Vector<Integer> v5 = new Vector<Integer>(v3);

        System.out.println(v3.capacity());

        
    }
}

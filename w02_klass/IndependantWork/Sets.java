package IndependantWork;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        hashSets();
    }

    public static void hashSets() {
        HashSet<String> flowers = new HashSet<String>();

        flowers.add("Roses");
        flowers.add("Irises");
        flowers.add("Tulips");
        flowers.add("Sunflowers");
        flowers.add("Orchids");
        System.out.println(flowers);

        System.out.println(flowers.contains("Irises"));

        flowers.remove("Tulips");
        System.out.println(flowers);

        flowers.size();
        System.out.println(flowers);

        for (String i : flowers) {
            System.out.println(i);
          }

        flowers.clear();
        System.out.println(flowers);

        // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);
    numbers.add(9);

        // Show which numbers between 1 and 10 are in the set
    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
            }
        }
    }

    
}

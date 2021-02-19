package IndependantWork;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        hashMaps();
    }

    public static void hashMaps() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Estonia", "Tallinn");
        capitalCities.put("Netherlands", "Amsterdam");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Norway"));

        capitalCities.remove("Germany");
        System.out.println(capitalCities);

        capitalCities.size();
        System.out.println(capitalCities);

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
          }

        capitalCities.clear();
        System.out.println(capitalCities);
    }
}

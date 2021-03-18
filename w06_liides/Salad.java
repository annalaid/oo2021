import java.util.HashMap;

public class Salad implements Food {
    private String string;

    public Salad(String string) {
        this.string = string;
    }

    @Override
    public String contains() {
        return "This salad contains salad mix, mango dressing, strawberries, grapes, goat cheese and honey.";
    }

    @Override
    public String name() {
        return "This is a goat cheese salad!";
        
    }

    @Override
    public void calories() {
        System.out.println(string + " salad has approximately 555 calories.");
    }

    @Override
    public void type() {
        System.out.println(string + " salad can be called as lunch or dinner!");
        
    }

    @Override
    public void nutrition() {
        HashMap<String, Integer> nutrition = new HashMap<String, Integer>();
        nutrition.put("Fat", 50);
        nutrition.put("Cholesterol", 2);
        nutrition.put("Carbs", 40);
        nutrition.put("Protein", 8);

        System.out.println("\nNutritions:");
        for (String key : nutrition.keySet()) {
            System.out.println(key + " = " + nutrition.get(key) + "g");
        }
        
    }
    
}

import java.util.HashMap;

public class Pizza implements Food {
    private String string;

    public Pizza(String string) {
        this.string = string;
    }

    @Override
    public String contains() {
        return "This pizza contains: tomato sauce, cheese, shrimps, mussels and arugula ";
    }

    @Override
    public void calories() {
        System.out.println(string + " pizza slice has approximately 272 calories.");
        
    }

    @Override
    public void type() {
        System.out.println(string + " pizza can be called as lunch or dinner!");
    }

    @Override
    public void nutrition() {
        HashMap<String, Integer> nutrition = new HashMap<String, Integer>();
        nutrition.put("Fat", 11);
        nutrition.put("Cholesterol", 4);
        nutrition.put("Carbs", 14);
        nutrition.put("Protein", 8);

        System.out.println("\nNutritions:");
        for (String key : nutrition.keySet()) {
            System.out.println(key + " = " + nutrition.get(key) + "g");
        }
    }

    @Override
    public String name() {
        return "This is a sea food pizza!";
    }
    
}

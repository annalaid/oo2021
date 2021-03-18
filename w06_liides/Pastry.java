import java.util.HashMap;

public class Pastry implements Food {
    private String string;

    public Pastry(String string) {
        this.string = string;
    }

    @Override
    public String contains() {
        return "This croissant contains, almond cream and almond pieces.";
    }

    @Override
    public String name() {
        return "This is an almond croissant!";
    }

    @Override
    public void calories() {
        System.out.println(string + " pastry has approximately 672 calories.");
        
    }

    @Override
    public void type() {
        System.out.println(string + " pastry can be called as breakfast or a snack!");
        
    }

    @Override
    public void nutrition() {
        HashMap<String, Integer> nutrition = new HashMap<String, Integer>();
        nutrition.put("Fat", 25);
        nutrition.put("Cholesterol", 8);
        nutrition.put("Carbs", 40);
        nutrition.put("Protein", 8);

        System.out.println("\nNutritions:");
        for (String key : nutrition.keySet()) {
            System.out.println(key + " = " + nutrition.get(key) + "g");
        }
        
    }

    
    
}

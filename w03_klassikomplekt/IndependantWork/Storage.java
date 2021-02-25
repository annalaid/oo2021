package IndependantWork;

import java.util.ArrayList;

public class Storage {
    public static final int storageLimit = 20;
    private int count = 1;
    private ArrayList<Fridge> fridges = new ArrayList<>();

    public Storage() {
    }

    public void addFridge(Fridge fridge) {
        if (count < storageLimit) {
            this.fridges.add(fridge);
            count++;
        }
    }

    public void removeFridges(String model) {
        fridges.removeIf(fridge -> fridge.getModel().equals(model));
    }

    public ArrayList<Fridge> getFridges() {
        return fridges;
    }

    public void newModelName(String oldModelName, String newModelName) {
        Fridge matchingObject = fridges.stream().filter(p -> p.getModel().equals(oldModelName)).findFirst()
                .orElse(null);
        if (matchingObject == null) {
            return;
        }
        matchingObject.setModel(newModelName);
    }

    @Override
    public String toString() {
        return fridges.toString();
    }
}

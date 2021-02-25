package IndependantWork;

public class Fridge {
    private String brand;
    private String model;

    public Fridge(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Fridge(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}

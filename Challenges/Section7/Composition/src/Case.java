public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    // uses Dimensions class for local field
    private Dimensions dimensions;

    // Constructor class Case to be used in PC class
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    // public method to be used in PC class
    public void PressPowerButton() {
        System.out.println("Power Button Pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

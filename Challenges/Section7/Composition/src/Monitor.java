public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    // uses Resolution class for local field
    private Resolution nativeResolution;

    // Monitor Constructor created with local fields, to be used in composition by PC class
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    // public method to be called by PC class
    public void drawPixelAt (int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}

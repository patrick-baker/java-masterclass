public class Cylinder extends Circle {

    private double height;

    // Constructor sets radius (inherited constructor) and height
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // Calculates volume from inherited method and height
    public double getVolume() {
        return getArea() * height;
    }
}

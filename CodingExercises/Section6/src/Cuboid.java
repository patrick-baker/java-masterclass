public class Cuboid extends Rectangle {

    private double height;

    // Constructor initializes inherited fields and height
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // Calculates volume from inherited method and private field height
    public double getVolume() {
        return getArea() * height;
    }
}

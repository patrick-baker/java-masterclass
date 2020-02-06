public class Rectangle {

    private double width;
    private double length;

    // Constructor initializes width and length of Rectangle
    public Rectangle(double width, double length) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
        if (length < 0)
            this.length = 0;
        else
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Calculates Area from private fields width and length
    public double getArea() {
        return width * length;
    }
}

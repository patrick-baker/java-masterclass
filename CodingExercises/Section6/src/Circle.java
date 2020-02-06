public class Circle {

    private double radius;

    // Constructor sets radius of circle
    public Circle(double radius) {
        if (radius < 0)
            this.radius = 0;
        else
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Calculates Area of circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

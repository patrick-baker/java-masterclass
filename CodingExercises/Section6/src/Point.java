import static java.lang.Math.sqrt;

public class Point {

    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point () {
        this (0,0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // calculates the distance from (0,0) to (this.x, this.y) by calculating the hypotenuse of an equilateral triangle
    public double distance () {
        double distance = sqrt((this.x * this.x) + (this.y * this.y));
        return distance;
    }

    // calculates the distance from (x,y) to (this.x, this.y) by calculating the hypotenuse of an equilateral triangle
    public double distance (int x, int y) {
        double distance = sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
        return distance;
    }

    // calculates the distance from (another.x, another.y) to (this.x, this.y) by calculating the hypotenuse of an equilateral triangle
    public double distance (Point another) {
        double distance = sqrt(((this.x - another.x) * (this.x - another.x)) + ((this.y - another.y) * (this.y - another.y)));
        return distance;
    }
}

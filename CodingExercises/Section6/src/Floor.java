public class Floor {

    private double width;
    private double length;

    // Constructor initializes width and length of floor
    public Floor (double width, double length) {
        if (length < 0)
            this.length = 0;
        else
            this.length = length;
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    // method calculates floor area
    public double getArea () {
        return width * length;
    }
}


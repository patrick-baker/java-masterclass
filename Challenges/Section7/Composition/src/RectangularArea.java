public class RectangularArea {

    private int length;
    private int width;

    public RectangularArea(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }
}

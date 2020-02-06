public class Resolution {

    private int height;
    private int width;

    // Resolution constructor to be used in composition by Monitor class
    public Resolution(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

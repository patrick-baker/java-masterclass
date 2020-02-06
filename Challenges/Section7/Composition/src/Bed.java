public class Bed {

    private String size;
    private String sheetColor;
    private int numberOfPillows;
    private int height;
    private boolean isMade;

    public Bed(String size, String sheetColor, int numberOfPillows, int height, boolean isMade) {
        this.size = size;
        this.sheetColor = sheetColor;
        this.numberOfPillows = numberOfPillows;
        this.height = height;
        this.isMade = isMade;
    }

    public void makeBed() {
        if (!isMade) {
            System.out.println("The bed is not made, but it will be.");
            isMade = true;
        }
        System.out.println("The bed is made.");
    }

    public String getSize() {
        return size;
    }

    public String getSheetColor() {
        return sheetColor;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public int getHeight() {
        return height;
    }

    public boolean isMade() {
        return isMade;
    }
}

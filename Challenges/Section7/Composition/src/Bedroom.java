public class Bedroom {

    private Bed bed;
    private Closet closet;
    private RectangularArea size;
    private int numberOfBookshelves;
    private boolean hasWindows;
    private boolean isCleaned;
    private String otherThings;

    public Bedroom(Bed bed, Closet closet, RectangularArea size, int numberOfBookshelves, boolean hasWindows, boolean isCleaned, String otherThings) {
        this.bed = bed;
        this.closet = closet;
        this.size = size;
        this.numberOfBookshelves = numberOfBookshelves;
        this.hasWindows = hasWindows;
        this.isCleaned = isCleaned;
        this.otherThings = otherThings;
    }

    private void cleanRoom() {
        if (!isCleaned)
            System.out.println("I really need to clean my room one of these days.");
    }

    public void enterRoom() {
        System.out.println("Thank god I am home.");
        bed.makeBed();
        closet.organizedCloset();
        cleanRoom();
    }

    public Bed getBed() {
        return bed;
    }

    public Closet getCloset() {
        return closet;
    }

    public RectangularArea getSize() {
        return size;
    }

    public int getNumberOfBookshelves() {
        return numberOfBookshelves;
    }

    public boolean isHasWindows() {
        return hasWindows;
    }

    public boolean isCleaned() {
        return isCleaned;
    }

    public String getOtherThings() {
        return otherThings;
    }
}

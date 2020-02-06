public class Closet {

    private int pairsOfPants;
    private int numberOfShirts;
    private int numberOfShoes;
    private boolean isOrganized;
    private RectangularArea size;
    private String thingsStored;

    public Closet(int pairsOfPants, int numberOfShirts, int numberOfShoes, boolean isOrganized, RectangularArea size, String thingsStored) {
        this.pairsOfPants = pairsOfPants;
        this.numberOfShirts = numberOfShirts;
        this.numberOfShoes = numberOfShoes;
        this.isOrganized = isOrganized;
        this.size = size;
        this.thingsStored = thingsStored;
    }

    public void organizedCloset () {
        if (!isOrganized) {
            System.out.println("The closet is not organized. I will want to do that later.");
        } else
            System.out.println("The closet is organized.");
    }

    public int getPairsOfPants() {
        return pairsOfPants;
    }

    public int getNumberOfShirts() {
        return numberOfShirts;
    }

    public int getNumberOfShoes() {
        return numberOfShoes;
    }

    public boolean isOrganized() {
        return isOrganized;
    }

    public RectangularArea getSize() {
        return size;
    }

    public String getThingsStored() {
        return thingsStored;
    }
}

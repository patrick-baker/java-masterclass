public class Calculator {

    private Floor floor;
    private Carpet carpet;

    // Constructor initializes Carpet and Floor values
    public Calculator (Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }

    // method calculates const of Carpet for given floor size
    public double getTotalCost () {
        return carpet.getCost() * floor.getArea();
    }

}

public class Carpet {

    private double cost;

    // Constructor initializes cost of Carpet
    public Carpet (double cost) {
        if (cost < 0)
            this.cost = 0;
        else
            this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

public class DeluxeBurger extends Burger {

    public DeluxeBurger(String bunType, String meatType) {
        super(bunType, meatType);
        recalculatePrice(4.00);
    }


    @Override
    public String getToppings() {
        return "with a soda and chips.";
    }
}

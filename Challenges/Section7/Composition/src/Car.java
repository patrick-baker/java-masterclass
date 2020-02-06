public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    // a simple inheritance example, where this constructor is inheriting vehicle constructor for name,
    // and initializing doors and engineCapacity fields
    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

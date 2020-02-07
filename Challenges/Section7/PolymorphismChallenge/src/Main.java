class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine () {
        System.out.println("And the engine starts up loudly;");
    }

    public void accelerate () {
        System.out.println("The engine revs loudly and the car accelerates slowly");
    }

    public void brake () {
        System.out.println("SCREEEECHHH!!!!!!");
    }
}

class Taurus extends Car {
    public Taurus() {
        super(4,  "Taurus");
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class BMW extends Car {
    public BMW() {
        super(8, "BMW");
    }

    @Override
    public void startEngine() {
        System.out.println("The car starts quiet as the night!");
    }

    @Override
    public void accelerate() {
        System.out.println("And we speed up quicker and quieter than ever before.");
    }

    @Override
    public void brake() {
        System.out.println("She stops on a dime!");
    }
}




public class Main {

    public static void main(String[] args) {
        Car car = new Car(6, "Basic");
        Taurus taurus = new Taurus();
        BMW Bmw = new BMW();
        car.accelerate();
        taurus.accelerate();
        Bmw.accelerate();
    }

}

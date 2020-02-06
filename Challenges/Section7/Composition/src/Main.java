public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        // initializes Case, Monitor, and Motherboard using constructors, which will be parameters of PC constructor below
        Case theCase = new Case("200B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("the Beast", "acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");


        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        // If the PC getters were public then we could access these methods from Main
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 10");
//        thePC.getTheCase().PressPowerButton();


        Closet closet = new Closet(8, 30, 15, false, new RectangularArea(3, 9), "Documents, personal care items, and hats.");
        Bed bed = new Bed("double", "brown", 2, 30, true);

        Bedroom bedroom = new Bedroom(bed, closet, new RectangularArea(8, 20), 5, true, false, "Computer, chair, fan, mirror, desk, and lamps.");
        bedroom.enterRoom();
    }

}

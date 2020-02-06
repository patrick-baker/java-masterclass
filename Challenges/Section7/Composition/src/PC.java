public class PC {

    // all Composition classes for local fields
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // PC constructor initializes local fields using composition classes
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // public method which runs private methods, using public methods from composition classes accessed from field variables
    public void powerUp() {
        theCase.PressPowerButton();
        drawLogo();
        loadProgram();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    private void loadProgram() {
        motherboard.loadProgram("Windows 10");
    }

    // getters not necessary, as public composition methods are accessed from fields
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }

}

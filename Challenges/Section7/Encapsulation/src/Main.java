public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        // possible to do because fields in Class player are public
//        player.name = "Patrick";
//        player.health = 20;
//        player.weapon = "Dagger";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Patrick", 102, "Dagger");
        System.out.println(player.healthRemaining());

        Printer printer = new Printer (50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        printer.printPages(13);
        System.out.println("New page count = " + printer.getPagesPrinted());
    }

}

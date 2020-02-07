public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.pagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerAmount + tonerLevel <= 100) {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
            else
                return -1;
        } else
            return -1;
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        if (isDuplexPrinter) {
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

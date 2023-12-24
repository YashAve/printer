public class Printer {

    private double tonerLevel;
    private double pagesPrinted;
    private boolean duplex;

    public Printer(int pagesPrinted, boolean duplex) {
        this.tonerLevel = 100;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public double printPages(int pages) {
        boolean left = this.pagesPrinted > 0 && pages <= (duplex ? this.pagesPrinted * 2 : this.pagesPrinted);
        if (left && this.tonerLevel > 0.0) {
            double print = duplex ? pages / 2.0 : pages;
            if (this.tonerLevel - (pages * 0.25) <= 0.0) {
                System.out.println("printer ran out of ink, please fill");
                return this.pagesPrinted;
            }
            this.pagesPrinted -= print;
            this.tonerLevel -= pages * 0.25;
            System.out.printf("it's a %s printer, %.1f pages printed%n", duplex ? "duplex" : "normal", duplex ? pages / 2.0 : pages);
            return this.pagesPrinted;
        }
        System.out.printf("%s%n", !left ? "printer ran out of pages" : "printer ran out of ink, please fill");
        return this.pagesPrinted;
    }

    public double addToner(int tonerAmount) {
        if (this.tonerLevel + tonerAmount > 100) {
            System.out.println("printer ran out of ink cartridges, try something lower");
            return -1.0;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }
}

public class Main {

    public static void startPrinting(Printer printer, int pages) {
        double pagesLeft = printer.printPages(pages);
        System.out.printf("%.1f %s left in the printer to print%n", pagesLeft, pagesLeft > 1 ? "pages are" : "page is");
        System.out.printf("toner level equals %.1f%n", printer.getTonerLevel());
        System.out.println("*".repeat(7));
    }
    public static void enhancedPlayer() {
        EnhancedPlayer player = new EnhancedPlayer("tim");
        player.loseHealth(10);
        player.loseHealth(10);
        System.out.printf("remaining health equals %d%n", player.remainingHealth());
    }

    public static void player() {
        Player player = new Player();
        player.name = "tim";
        player.health = 20;
        player.weapon = "Sword";

        player.loseHealth(10);
        System.out.printf("remaining health equals %d\n", player.remainingHealth());
        player.health = 200;
        player.loseHealth(11);
        System.out.printf("remaining health equals %d\n", player.remainingHealth());
    }

    public static void main(String[] args) {
        Printer printer = new Printer(200, true);
        startPrinting(printer, 10);
        startPrinting(printer, 20);
        startPrinting(printer, 170);
        printer.addToner(100);
        startPrinting(printer, 1);
        /*enhancedPlayer();
        player();*/
    }
}
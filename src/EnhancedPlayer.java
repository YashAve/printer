public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = health < 0 ? 1 : (Math.min(health, 100));
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.printf("%s has been knocked out of the game\n", this.name);
        }
    }

    public void restoreHealth(int extraHealth) {
        this.health += extraHealth;
        if (this.health >= 100) {
            this.health = 100;
            System.out.printf("%S's health was completely restored\n", this.name);
        }
    }

    public int remainingHealth() {
        return this.health;
    }
}

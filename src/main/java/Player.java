public abstract class Player {

    private String name;
    private int healthPoints;
    private int maxHealth;

    public Player(String name, int healthPoints, int maxHealth) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damage){
        if (damage >=0) {
            if (damage > this.healthPoints) {
                this.healthPoints = 0;
            } else {
                this.healthPoints -= damage;
            }
        }
    }

    public void heal(int increase){
        if (increase >=0) {
            if (increase > this.maxHealth - this.healthPoints) {
                this.healthPoints = this.maxHealth;
            } else {
                this.healthPoints += increase;
            }
        }
    }

}

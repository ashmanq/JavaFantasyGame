package enemies;

public abstract class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
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

}

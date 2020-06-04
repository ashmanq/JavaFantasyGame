package mythicalcreatures;

import behaviors.IDefend;
import enemies.Enemy;

public class Ogre implements IDefend {

    private int damage;

    public Ogre() {
        this.damage = 25;
    }

    public int getDamage() {
        return damage;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(this.damage);
    }

}

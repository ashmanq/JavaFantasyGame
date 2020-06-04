package mythicalcreatures;

import behaviors.IDefend;
import enemies.Enemy;

public class Dragon implements IDefend {

    private int damage;

    public Dragon() {
        this.damage = 45;
    }

    public int getDamage() {
        return damage;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(this.damage);
    }
}

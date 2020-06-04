package spells;

import behaviors.ISpell;
import enemies.Enemy;

public class FireBlast implements ISpell {

    private int damage;
    private String incantation;

    public FireBlast() {
        this.damage = 20;
        this.incantation = "Infernio";
    }

    public int getDamage() {
        return damage;
    }

    public String getIncantation() {
        return incantation;
    }

    public String cast(Enemy enemy) {
        enemy.takeDamage(this.damage);
        return this.incantation;
    }
}

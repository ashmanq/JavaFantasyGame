package spells;

import behaviors.ISpell;
import enemies.Enemy;

public class IceBlast implements ISpell {

    private int damage;
    private String incantation;

    public IceBlast() {
        this.damage = 15;
        this.incantation = "Freezeio";
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

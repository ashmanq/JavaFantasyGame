package spells;

import enemies.Enemy;

public class WindBlast implements ISpell{

    private int damage;
    private String incantation;

    public WindBlast() {
        this.damage = 10;
        this.incantation = "Whoosh";
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

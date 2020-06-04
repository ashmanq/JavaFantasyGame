package weapons;

import enemies.Enemy;

public abstract class Weapon implements IWeapon {

    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.damage);
    }

}

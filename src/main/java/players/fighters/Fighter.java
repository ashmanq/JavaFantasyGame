package players.fighters;

import enemies.Enemy;
import players.Player;
import behaviors.IWeapon;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int maxHealth, IWeapon weapon) {
        super(name, maxHealth);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }

}

package players.fighters;

import behaviors.IWeapon;

public class Knight extends Fighter{

    public Knight(String name, int maxHealth, IWeapon weapon) {
        super(name, maxHealth, weapon);
    }

    public void changeWeapon(IWeapon weapon){
        this.setWeapon(weapon);
    }
}

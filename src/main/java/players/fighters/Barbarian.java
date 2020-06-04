package players.fighters;

import weapons.IWeapon;

public class Barbarian extends Fighter{

    public Barbarian(String name, int maxHealth, IWeapon weapon) {
        super(name, maxHealth, weapon);
    }

    public void changeWeapon(IWeapon weapon){
        this.setWeapon(weapon);
    }
}

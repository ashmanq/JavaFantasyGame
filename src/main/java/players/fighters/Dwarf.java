package players.fighters;

import weapons.IWeapon;

public class Dwarf extends Fighter{

    public Dwarf(String name, int maxHealth, IWeapon weapon) {
        super(name, maxHealth, weapon);
    }

    public void changeWeapon(IWeapon weapon){
        this.setWeapon(weapon);
    }
}

package players.fighters;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Dwarf;
import weapons.Club;
import behaviors.IWeapon;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Enemy enemy;
    private IWeapon weapon1, weapon2;

    @Before
    public void before() {
        weapon1 = new Sword("Stabby", 25);
        weapon2 = new Club("Smashy", 50);
        enemy = new Orc(60);
        dwarf = new Dwarf("Hector", 100, weapon1);
    }

    @Test
    public void hasName(){
        assertEquals("Hector", dwarf.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        Weapon weapon = (Weapon) dwarf.getWeapon();
        assertEquals("Stabby", weapon.getName());
    }

    @Test
    public void canAttackEnemy(){
        dwarf.attack(enemy);
        assertEquals(35, enemy.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.changeWeapon(weapon2);
        Weapon weapon = (Weapon) dwarf.getWeapon();
        assertEquals("Smashy", weapon.getName());
    }


}

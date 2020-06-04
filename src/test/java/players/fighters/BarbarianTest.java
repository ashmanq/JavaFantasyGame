package players.fighters;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Barbarian;
import weapons.Club;
import behaviors.IWeapon;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Enemy enemy;
    private IWeapon weapon1, weapon2;

    @Before
    public void before() {
        weapon1 = new Sword("Stabby", 25);
        weapon2 = new Club("Smashy", 50);
        enemy = new Orc(60);
        barbarian = new Barbarian("Conan", 100, weapon1);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        Weapon weapon = (Weapon) barbarian.getWeapon();
        assertEquals("Stabby", weapon.getName());
    }

    @Test
    public void canAttackEnemy(){
        barbarian.attack(enemy);
        assertEquals(35, enemy.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.changeWeapon(weapon2);
        Weapon weapon = (Weapon) barbarian.getWeapon();
        assertEquals("Smashy", weapon.getName());
    }

}

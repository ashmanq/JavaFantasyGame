package players;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Knight;
import weapons.Club;
import weapons.IWeapon;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Enemy enemy;
    private IWeapon weapon1, weapon2;

    @Before
    public void before() {
        weapon1 = new Sword("Stabby", 25);
        weapon2 = new Club("Smashy", 50);
        enemy = new Orc(60);
        knight = new Knight("Sir Stabs Alot", 100, weapon1);
    }

    @Test
    public void hasName(){
        assertEquals("Sir Stabs Alot", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        Weapon weapon = (Weapon) knight.getWeapon();
        assertEquals("Stabby", weapon.getName());
    }

    @Test
    public void canAttackEnemy(){
        knight.attack(enemy);
        assertEquals(35, enemy.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        knight.changeWeapon(weapon2);
        Weapon weapon = (Weapon) knight.getWeapon();
        assertEquals("Smashy", weapon.getName());
    }
    
}

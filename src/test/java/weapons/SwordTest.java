package weapons;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;
    private Enemy enemy;

    @Before
    public void before(){
        sword = new Sword("Glamdrung", 35);
        enemy = new Orc(50);
    }

    @Test
    public void hasName(){
        assertEquals("Glamdrung", sword.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(35, sword.getDamage());
    }

    @Test
    public void canAttack(){
        sword.attack(enemy);
        assertEquals(15, enemy.getHealthPoints());
    }


}

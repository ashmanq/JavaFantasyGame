package weapons;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    private Axe axe;
    private Enemy enemy;

    @Before
    public void before(){
        axe = new Axe("Choppy", 35);
        enemy = new Orc(50);
    }

    @Test
    public void hasName(){
        assertEquals("Choppy", axe.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(35, axe.getDamage());
    }

    @Test
    public void canAttack(){
        axe.attack(enemy);
        assertEquals(15, enemy.getHealthPoints());
    }


}

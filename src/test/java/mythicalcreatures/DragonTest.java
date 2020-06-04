package mythicalcreatures;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    private Dragon dragon;
    private Enemy enemy;

    @Before
    public void before(){
        dragon = new Dragon();
        enemy = new Orc(80);
    }

    @Test
    public void hasDamage(){
        assertEquals(45, dragon.getDamage());
    }

    @Test
    public void canDefend(){
        dragon.defend(enemy);
        assertEquals(35, enemy.getHealthPoints());
    }

}

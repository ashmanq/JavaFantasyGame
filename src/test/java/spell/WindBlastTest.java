package spell;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import spells.WindBlast;


import static org.junit.Assert.assertEquals;

public class WindBlastTest {

    private WindBlast windBlast;
    private Enemy enemy;

    @Before
    public void before(){
        windBlast = new WindBlast();
        enemy = new Orc(60);
    }

    @Test
    public void hasDamage(){
        assertEquals(10, windBlast.getDamage());
    }

    @Test
    public void hasIncantation(){
        assertEquals("Whoosh", windBlast.getIncantation());
    }

    @Test
    public void canCast(){
        assertEquals("Whoosh", windBlast.cast(enemy));
    }

    @Test
    public void canDamageEnemy(){
        windBlast.cast(enemy);
        assertEquals(50,enemy.getHealthPoints());
    }
}

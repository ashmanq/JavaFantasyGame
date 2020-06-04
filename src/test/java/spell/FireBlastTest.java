package spell;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import spells.FireBlast;

import static org.junit.Assert.assertEquals;

public class FireBlastTest {

    private FireBlast fireBlast;
    private Enemy enemy;

    @Before
    public void before(){
        fireBlast = new FireBlast();
        enemy = new Orc(60);
    }

    @Test
    public void hasDamage(){
        assertEquals(20, fireBlast.getDamage());
    }

    @Test
    public void hasIncantation(){
        assertEquals("Infernio", fireBlast.getIncantation());
    }

    @Test
    public void canCast(){
        assertEquals("Infernio", fireBlast.cast(enemy));
    }

    @Test
    public void canDamageEnemy(){
        fireBlast.cast(enemy);
        assertEquals(40,enemy.getHealthPoints());
    }

}

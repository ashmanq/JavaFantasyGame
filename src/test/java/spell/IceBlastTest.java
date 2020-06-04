package spell;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import spells.IceBlast;

import static org.junit.Assert.assertEquals;

public class IceBlastTest {

    private IceBlast iceBlast;
    private Enemy enemy;

    @Before
    public void before(){
        iceBlast = new IceBlast();
        enemy = new Orc(60);
    }

    @Test
    public void hasDamage(){
        assertEquals(15, iceBlast.getDamage());
    }

    @Test
    public void hasIncantation(){
        assertEquals("Freezeio", iceBlast.getIncantation());
    }

    @Test
    public void canCast(){
        assertEquals("Freezeio", iceBlast.cast(enemy));
    }

    @Test
    public void canDamageEnemy(){
        iceBlast.cast(enemy);
        assertEquals(45,enemy.getHealthPoints());
    }


}

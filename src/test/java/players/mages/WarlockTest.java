package players.mages;

import behaviors.IDefend;
import behaviors.ISpell;
import enemies.Enemy;
import enemies.Orc;
import mythicalcreatures.Dragon;
import mythicalcreatures.Ogre;
import org.junit.Before;
import org.junit.Test;
import spells.FireBlast;
import spells.IceBlast;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private Enemy enemy;
    private ISpell spell1, spell2;
    private IDefend creature1,creature2;

    @Before
    public void before(){
        spell1 = new FireBlast();
        spell2 = new IceBlast();
        creature1 = new Dragon();
        creature2 = new Ogre();
        warlock = new Warlock("Azaroth", 80, spell1, creature1 );
        enemy = new Orc(150);
    }

    @Test
    public void hasName(){
        assertEquals("Azaroth", warlock.getName());
    }

    @Test
    public void hasHealthpoints(){
        assertEquals(80, warlock.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        assertEquals(spell1, warlock.getSpell());
    }

    @Test

    public void hasCreature(){
        assertEquals(creature1, warlock.getCreature());
    }

    @Test
    public void canChangeSpell(){
        warlock.swapSpell(spell2);
        assertEquals(spell2, warlock.getSpell());
    }

    @Test
    public void canChangeDefender(){
        warlock.swapDefender(creature2);
        assertEquals(creature2, warlock.getCreature());
    }

    @Test
    public void canDefend(){
        warlock.defend(enemy);
        assertEquals(105, enemy.getHealthPoints());
    }

    @Test
    public void canCastSpell(){
        String result = warlock.castSpell(enemy);
        assertEquals("Infernio", result);
        assertEquals(130, enemy.getHealthPoints());
    }


}

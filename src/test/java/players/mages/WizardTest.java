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

public class WizardTest {

    private Wizard wizard;
    private Enemy enemy;
    private ISpell spell1, spell2;
    private IDefend creature1,creature2;

    @Before
    public void before(){
        spell1 = new FireBlast();
        spell2 = new IceBlast();
        creature1 = new Dragon();
        creature2 = new Ogre();
        wizard = new Wizard("Merlin", 80, spell1, creature1 );
        enemy = new Orc(150);
    }

    @Test
    public void hasName(){
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void hasHealthpoints(){
        assertEquals(80, wizard.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        assertEquals(spell1, wizard.getSpell());
    }

    @Test

    public void hasCreature(){
        assertEquals(creature1, wizard.getCreature());
    }

    @Test
    public void canChangeSpell(){
        wizard.swapSpell(spell2);
        assertEquals(spell2, wizard.getSpell());
    }

    @Test
    public void canChangeDefender(){
        wizard.swapDefender(creature2);
        assertEquals(creature2, wizard.getCreature());
    }

    @Test
    public void canDefend(){
        wizard.defend(enemy);
        assertEquals(105, enemy.getHealthPoints());
    }

    @Test
    public void canCastSpell(){
        String result = wizard.castSpell(enemy);
        assertEquals("Infernio", result);
        assertEquals(130, enemy.getHealthPoints());
    }

}

package mythicalcreatures;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    private Ogre ogre;
    private Enemy enemy;

    @Before
    public void before(){
        ogre = new Ogre();
        enemy = new Orc(80);
    }

    @Test
    public void hasDamage(){
        assertEquals(25, ogre.getDamage());
    }

    @Test
    public void canDefend(){
        ogre.defend(enemy);
        assertEquals(55, enemy.getHealthPoints());
    }

}

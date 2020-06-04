package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    private Troll troll;

    @Before
    public void before(){
        troll = new Troll(100);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(40);
        assertEquals(60, troll.getHealthPoints());
    }

    @Test
    public void cantHaveNegativeHealthPoints(){
        troll.takeDamage(110);
        assertEquals(0, troll.getHealthPoints());
    }

}

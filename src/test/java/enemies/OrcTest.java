package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    private Orc orc;

    @Before
    public void before(){
        orc = new Orc(50);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(40);
        assertEquals(10, orc.getHealthPoints());
    }

    @Test
    public void cantHaveNegativeHealthPoints(){
        orc.takeDamage(110);
        assertEquals(0, orc.getHealthPoints());
    }

}

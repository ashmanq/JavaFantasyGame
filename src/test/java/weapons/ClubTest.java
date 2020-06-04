package weapons;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    private Club club;
    private Enemy enemy;

    @Before
    public void before(){
        club = new Club("Oooof", 35);
        enemy = new Orc(50);
    }

    @Test
    public void hasName(){
        assertEquals("Oooof", club.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(35, club.getDamage());
    }

    @Test
    public void canAttack(){
        club.attack(enemy);
        assertEquals(15, enemy.getHealthPoints());
    }


}

package healingitems;

import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.fighters.Knight;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class HerbTest {

    private Herb herb;
    private Player player;
    private Weapon weapon;

    @Before
    public void before(){
        herb = new Herb();
        weapon = new Sword("Stabby", 25);
        player = new Knight("Sir Stabs Alot", 100, weapon);
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(25, herb.getHeal());
    }

    @Test
    public void canHeal(){
        player.takeDamage(50);
        herb.heal(player);
        assertEquals(75, player.getHealthPoints());
    }
}

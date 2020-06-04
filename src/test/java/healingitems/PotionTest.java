package healingitems;

import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.fighters.Knight;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    private Potion potion;
    private Player player;
    private Weapon weapon;

    @Before
    public void before(){
        potion = new Potion();
        weapon = new Sword("Stabby", 25);
        player = new Knight("Sir Stabs Alot", 100, weapon);
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(45, potion.getHeal());
    }

    @Test
    public void canHeal(){
        player.takeDamage(50);
        potion.heal(player);
        assertEquals(95, player.getHealthPoints());
    }

}

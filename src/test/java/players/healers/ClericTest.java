package players.healers;

import behaviors.IHeal;
import healingitems.Herb;
import healingitems.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private IHeal item1, item2;

    @Before
    public void before(){
        item1 = new Potion();
        item2 = new Herb();
        cleric = new Cleric("Father John", 90, item1);
    }

    @Test
    public void hasHealingItem(){
        assertEquals(item1, cleric.getHealingItem());
    }

    @Test
    public void canChangeHealingItem(){
        cleric.swapHealingItem(item2);
        assertEquals(item2, cleric.getHealingItem());
    }


}

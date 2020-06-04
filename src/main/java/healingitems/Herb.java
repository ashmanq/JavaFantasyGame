package healingitems;

import behaviors.IHeal;
import players.Player;

public class Herb implements IHeal {

    private int heal;

    public Herb() {
        this.heal = 25;
    }

    public int getHeal() {
        return heal;
    }

    public void heal(Player player) {
        player.heal(this.heal);
    }
}

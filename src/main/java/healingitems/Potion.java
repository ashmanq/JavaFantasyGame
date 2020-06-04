package healingitems;

import behaviors.IHeal;
import players.Player;

public class Potion implements IHeal {

    private int heal;

    public Potion() {
        this.heal = 45;
    }

    public int getHeal() {
        return heal;
    }

    public void heal(Player player) {
        player.heal(this.heal);
    }
}

package players.healers;

import behaviors.IHeal;
import players.Player;

public class Cleric extends Player {

    private IHeal healingItem;

    public Cleric(String name, int maxHealth, IHeal healingItem) {
        super(name, maxHealth);
        this.healingItem = healingItem;
    }

    public IHeal getHealingItem() {
        return healingItem;
    }

    public void swapHealingItem(IHeal healingItem){
        this.healingItem = healingItem;
    }
}

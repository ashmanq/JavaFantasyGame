package players.mages;

import behaviors.IDefend;
import behaviors.ISpell;

public class Wizard extends Mage {

    public Wizard(String name, int maxHealth, ISpell spell, IDefend creature) {
        super(name, maxHealth, spell, creature);
    }
}

package players.mages;

import behaviors.IDefend;
import behaviors.ISpell;
import enemies.Enemy;
import players.Player;

public abstract class Mage extends Player {

    private ISpell spell;
    private IDefend creature;

    public Mage(String name, int maxHealth, ISpell spell, IDefend creature) {
        super(name, maxHealth);
        this.spell = spell;
        this.creature = creature;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IDefend getCreature() {
        return creature;
    }

    public void swapDefender(IDefend creature){
        this.creature = creature;
    }

    public void swapSpell(ISpell spell){
        this.spell = spell;
    }

    public void defend(Enemy enemy){
        this.creature.defend(enemy);
    }

    public String castSpell(Enemy enemy){
        return this.spell.cast(enemy);
    }
}

package droids;


import java.util.ArrayList;

/**
 * class for creating a specific type of droid
 */
public class Brave extends Droid{

    public Brave(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public String className() {
        return "Brave";
    }

    @Override
    public Droid chooseOpponent(ArrayList<Droid> group) {
        Droid sel = null;
        int maxHealth = Integer.MIN_VALUE;
        for(Droid d : group) {
            if(!d.isAlive()) continue;
            if(d.getHealth() > maxHealth) {
                maxHealth = d.getHealth();
                sel = d;
            }
        }
        return sel;
    }
}

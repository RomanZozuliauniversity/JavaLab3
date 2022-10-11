package droids;

import java.util.ArrayList;


/**
 * class for creating a specific type of droid
 */
public class Tricky extends Droid{

    public Tricky(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public String className() {
        return "Tricky";
    }

    @Override
    public Droid chooseOpponent(ArrayList<Droid> group) {
        Droid sel = null;
        int minHealth = Integer.MAX_VALUE;
        for(Droid d : group) {
            if(!d.isAlive()) continue;
            if(d.getHealth() < minHealth) {
                minHealth = d.getHealth();
                sel = d;
            }
        }
        return sel;
    }
}
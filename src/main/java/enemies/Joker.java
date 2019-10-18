package enemies;

import weapons.JokerCane;

public class Joker extends Enemy {

    public Joker(){
        super(20, "The Joker", new JokerCane());
    }
}

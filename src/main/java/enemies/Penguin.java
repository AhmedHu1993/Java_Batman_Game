package enemies;

import behaviours.IHero;
import weapons.PenguinUmbrella;

public class Penguin extends Enemy{



    public Penguin(){
        super(75 , "The Penguin" , new PenguinUmbrella());
    }
}



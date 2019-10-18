package heroes;

import behaviours.IHero;
import behaviours.IWeapon;
import weapons.Batarang;
import weapons.Kick;
import weapons.Punch;

import java.util.ArrayList;

public class Batman extends Player implements IHero {

    private Batarang batarang = new Batarang();
    private Kick kick = new Kick();
    private Punch punch = new Punch();

    public Batman(){
        super("BatMan", 200, new ArrayList<IWeapon>());
    }

    public void addWeapons(){
        getWeapons().add(batarang);
        getWeapons().add(kick);
        getWeapons().add(punch);
    }
}

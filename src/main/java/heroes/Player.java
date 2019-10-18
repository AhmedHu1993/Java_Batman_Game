package heroes;

import behaviours.IVillain;
import behaviours.IWeapon;

import java.util.ArrayList;
import java.util.Random;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<IWeapon> weapons;

    public Player(String name, int healthPoints, ArrayList<IWeapon> weapons){
        this.name = name;
        this.healthPoints =healthPoints;
        this.weapons = weapons;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints(){
        return healthPoints > 0 ? healthPoints : 0;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

    public void takeDamage(int damagePoints){
        int newHealthPoints = getHealthPoints() - damagePoints;
        setHealthPoints(newHealthPoints);
    }

    public ArrayList<IWeapon> getWeapons() {
        return weapons;
    }

    public abstract void addWeapons();

    public String attack(IVillain enemy){
        addWeapons();
        Random random = new Random();
        IWeapon attackingWeapon = this.weapons.get(random.nextInt(weapons.size()));
        int damagePoints = attackingWeapon.attackPoints();
        enemy.takeDamage(damagePoints);
        String attackMsg = attackingWeapon.getSound().toUpperCase() + ", " + getName() + " has Attacked " + enemy.getName() + " with " +
                attackingWeapon.getName()+ ". " + enemy.getName() + " lost " +
                attackingWeapon.attackPoints() + " health points. " + enemy.getName()
                + "'s remaining health points is " + enemy.getHealthPoints() + "." ;
        return attackMsg;
    }
}

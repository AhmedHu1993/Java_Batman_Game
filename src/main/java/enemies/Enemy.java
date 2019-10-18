package enemies;


import behaviours.IHero;
import behaviours.IVillain;
import behaviours.IWeapon;

public abstract class Enemy implements IVillain {

    private int healthPoints;
    private String name;
    private IWeapon weapon;

    public Enemy(int healthPoints, String name, IWeapon weapon){
        this.healthPoints = healthPoints;
        this.name = name;
        this.weapon = weapon;
    }

    public void takeDamage(int damagePoints){
        int newHealthPoints = getHealthPoints() - damagePoints;
        setHealthPoints(newHealthPoints);
    }

    public int getHealthPoints(){
        return healthPoints > 0 ? healthPoints : 0;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

    public String getName(){
        return this.name;
    }

    public String attack(IHero hero){
        int damagePoints = this.weapon.attackPoints();
        hero.takeDamage(damagePoints);
        String attackMsg = weapon.getSound().toUpperCase() + ", " + getName() + " has Attacked " + hero.getName() + " with " +
                weapon.getName()+ ". " + hero.getName() + " lost " +
                weapon.attackPoints() + " health points. " + hero.getName()
                + "'s remaining health points is " + hero.getHealthPoints() ;
        return attackMsg;
    }
}

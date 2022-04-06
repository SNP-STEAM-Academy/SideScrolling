import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapons here.
 * 
 * @author Nicodemus Allan 
 * @version March 5, 2022
 */
public class Weapon extends A_Weapon
{
    public Weapon(int speed, int damage, int numBullets, int spread)
    {
        this.speed = speed;
        this.damage = damage;
        this.numBullets = numBullets;
        this.spread = spread;
    }
    
    /**
     * Act - do whatever the Weapons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Checks to see if space bar was pressed
        //if so creat a Bullet with the given values
        //loop numBullets to spawn multiple Bullets
    }
    
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public void setNumBullets(int numBullets)
    {
        this.numBullets = numBullets;
    }
    
    public void setSpread(int spread)
    {
        this.spread = spread;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int getNumBullets()
    {
        return numBullets;
    }
    
    public int getSpread()
    {
        return spread;
    }
}

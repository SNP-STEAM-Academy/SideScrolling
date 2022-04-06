import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Weapon class will control 
 * 
 * @author Nicodemus Allan
 * @version March 5, 2022
 */
public abstract class A_Weapon extends Actor
{
    protected int damage;
    protected int speed;
    protected int numBullets;
    protected int spread;
    
    public abstract void setDamage(int damage);
    public abstract void setSpeed(int speed);
    public abstract void setNumBullets(int numBullets);
    public abstract void setSpread(int spread);
    public abstract int getDamage();
    public abstract int getSpeed();
    public abstract int getNumBullets();
    public abstract int getSpread();
}

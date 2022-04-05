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
    
    protected abstract void setDamage(int damage);
    protected abstract void setSpeed(int speed);
    protected abstract void setNumBullets(int numBullets);
    protected abstract void setSpread(int spread);
}

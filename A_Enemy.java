import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Enemy here.
 * Enemies fire and so have I_Weapon
 * They die in one shot tho'
 *
 * @author Luca Quacquarelli
 * @version (a version number or a date)
 */
public abstract class A_Enemy extends Asteroid {
    
    
    protected int moveCooldown;
    protected int moveTimer;
    protected double mX;
    protected double mY;
    
   
    public abstract void move(double speed);
    abstract void fire();
    public abstract void getRandomLocation();
    
}

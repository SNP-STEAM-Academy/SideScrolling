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

    protected int cooldown;
    protected int shotTimer = 0;
    
    /** random x for the Enemy to drive towards **/
    //protected double mX;
    
    /** random y for the Enemy to drive towards **/
    //protected double mY;
    
    //Game game;
    protected Healthbar healthBar;
    protected GreenfootImage img;
    //protected GreenfootSound shot; //NR use soundpool
    
    abstract void fire();
    
}

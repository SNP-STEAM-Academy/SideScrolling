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
    
    /** cooldown to drive towards a random point for 300 frames / 5 seconds **/
    protected int moveCooldown;
    
    /** timer to drive towards a random point for 5 seconds **/
    protected int moveTimer;
    
    protected int move;
    protected int cooldown;
    protected int shotTimer = 0;
    //protected int Health;
    
    /** random x for the Enemy to drive towards **/
    protected double mX;
    
    /** random y for the Enemy to drive towards **/
    protected double mY;
    
    Game game;
    GreenfootImage img;
   
    //public abstract void move(double speed);
    
    abstract void fire();
    public abstract void getRandomLocation();
    
}

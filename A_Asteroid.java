import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Asteroids here.
 * Asteroids just move in one direction and spawn in smaller asteroids when shot
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_Asteroid extends VecActor
{
    
   protected int size;
   protected int minSize;
   protected int maxSize;
    
    // speed variables 
   protected double speed; 
   protected double minSpeed;
   protected double maxSpeed;
    
    
    /**
     * Method collide has not been created yet. 
     */
    public abstract void collide();
    
    
    
    
    
    /**
     * Method split has not been created yet. 
     */
    public abstract void split();
}

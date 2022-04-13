import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Asteroids here.
 * Asteroids just move in one direction and spawn in smaller asteroids when shot
 * 
 * @author (Luca Quacquarelli) 
 * @date 2022-04-05
 */
public abstract class A_Asteroid extends VecActor {
    
    // size  variables
    protected int size;
    protected int minSize = 20;
    protected int maxSize = 150;
    
    // speed variables 
    protected double speed = 0; 
    protected double minSpeed = 2;
    protected double maxSpeed = 10;
    
    protected double move = 0;
    protected String name;
    
    // Game and image variables 
    GreenfootImage img;
    Game game;
    
    /**
     * Method collide has not been created yet. 
     */
    public abstract void collide();
    
    /**
     * Method split has not been created yet. 
     */
    protected abstract void split(Actor b);
    
    
}// end

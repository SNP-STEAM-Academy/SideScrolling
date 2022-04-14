import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This A_Ship class is just to hold on to all the variables for the Ship class to run.
 * 
 * @author Cole Spiers 
 * @version April 4th, 2022
 */
public abstract class A_Ship extends VecActor implements I_Damageable
{
    double speed = 5; 
    //int maxSpeed = 10;
    //double thrust = 0.5;
    //double thrustBack = 0.25;
    //int turnSpeed = 4;
    
    protected int damage;
    protected int Health;
    
    protected Game game;    
    protected GreenfootImage img;
    //MouseInfo mouse;
    
    //Healthbar healthbar;
    int maxhealth = 600;
    
    protected abstract void checkKeys();
    protected abstract void forward();
    protected abstract void up();
    
}

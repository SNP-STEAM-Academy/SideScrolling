import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Boss here.
 * Boss has health and this implements I_Damageable
 * Maybe have it construct a wack of bullets to store to prevent lag from constructing them on the fly
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_Boss extends Enemy implements I_Damageable{
    
    
    protected int health;
    
     // size  variables
    protected int size;
    protected int minSize = 20;
    protected int maxSize = 150;
    
    // speed variables 
    protected double speed = 0; 
    protected double minSpeed = 2;
    protected double maxSpeed = 10;
    
    
    // Game and image variables 
   Healthbar healthBar;
    GreenfootImage img;
    Game game;
    Weapon weapon;
    
    
    public abstract void setHealthbar();//ensures the implementation should have a health bar
    
    //damage, heal, reset, setHealth, getHealth
    public abstract void damage(int amount);
    
    public abstract void heal(int amount);
    
    public abstract void reset();
    public abstract void setHealth(int amount);
    
    public abstract int getHealth();
    
}

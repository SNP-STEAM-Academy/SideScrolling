import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Boss here.
 * Boss has health and this implements I_Damageable
 * Maybe have it construct a wack of bullets to store to prevent lag from constructing them on the fly
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_Boss extends Enemy {
    
    
    protected int Health;
    
     // size  variables
    protected int size;
    protected int minSize = 20;
    protected int maxSize = 150;
    
    // speed variables 
    protected double speed = 0; 
    protected double minSpeed = 2;
    protected double maxSpeed = 10;
    
    
    // Game and image variables 
    GreenfootImage img;
    Game game;
    Weapon weapon;
    
}

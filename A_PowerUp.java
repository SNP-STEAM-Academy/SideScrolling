import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_PowerUp here.
 * 
 * @author Nicodemus Allan 
 * @version March 4, 2022
 */
public abstract class A_PowerUp extends Actor
{
    protected int powerUpTimer;
    protected int PowerUpCooldown;
    
    public abstract void act();
    protected abstract void applyEffects();
    protected abstract void detectTouching();
}

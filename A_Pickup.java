import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Pickup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_Pickup extends VecActor
{
    protected abstract void applyEffect(Ship s);
    protected abstract void detectShip();
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_Bullet extends Actor
{
    protected double speed;
    protected int damage;
    
    public abstract void act();
    protected abstract void causeDamage();
    protected abstract void checkBounds();
}

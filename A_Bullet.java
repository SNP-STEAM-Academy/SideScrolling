import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Bullet here.
 * 
 * @author Nicodemus Allan 
 * @version March 4, 2022
 */
public abstract class A_Bullet extends Actor
{
    protected double speed;
    protected int damage;
    
    public abstract void act();
    protected abstract void causeDamage();
    protected abstract void checkBounds();
}

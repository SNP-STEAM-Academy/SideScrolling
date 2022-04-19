import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_Bullet here.
 * 
 * @author Nicodemus Allan 
 * @version March 4, 2022
 */
public abstract class A_Bullet extends Actor
{
    protected World world;
    protected Ship ship;
    protected int speed;
    protected int damage;
    
    protected abstract void causeDamage(Ship hit);
    protected abstract void checkBounds();
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Weapon class will control 
 * 
 * @author Nicodemus Allan
 * @version March 5, 2022
 */
public abstract class A_Weapon extends Actor
{
    protected World world;
    protected Bullet[] bullets;
    
    protected int damage;
    protected int coolDown;
    protected int shotTimer = 0;
}

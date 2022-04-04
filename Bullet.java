import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Bullet class will control the basic functions of the bullet such as movement, damage and, bonderyChecking.
 * 
 * @author Nicodemus Allan 
 * @version March 4, 2022
 */
public class Bullet extends A_Bullet
{
    public Bullet(int speed)
    {
        this.speed = speed;
    }
    
    public void act()
    {
        move(speed);
    }
    
    protected void causeDamage()
    {
        
    }
    
    protected void checkBounds()
    {
        if (world == null)
        {
            world = getWorld();
        }
        if (getX() > world.getWidth())
        {
            world.removeObject(this);
            return;
        }
    }
}

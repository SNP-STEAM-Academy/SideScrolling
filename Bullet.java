import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Bullet class will control the basic functions of the bullet such as movement, damage and, bonderyChecking.
 * 
 * @author Nicodemus Allan 
 * @version March 4, 2022
 */
public class Bullet extends A_Bullet
{
    /**
     * Bullet class constructor
     */
    public Bullet(int damage)
    {
        this.damage = damage;
        this. speed = 25;
    }
    
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        checkBounds();
    }
    
    protected void causeDamage(Ship hit)
    {
        
    }
    
    protected void checkBounds()
    {
        if (world == null)
        {
            world = getWorld();
        }
        if (getX() > (world.getWidth() + 50))
        {
            world.removeObject(this);
            return;
        }
    }
}

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
    public Bullet(int speed, int damage, int rotation)
    {
        this.speed = speed;
        this.damage = damage;
        setRotation(rotation);
    }
    
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        //checkBounds();
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
        if (getX() > (world.getWidth() + 50))
        {
            world.removeObject(this);
            return;
        }
    }
}

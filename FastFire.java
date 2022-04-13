import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FastFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FastFire extends A_Weapon
{
    public FastFire()
    {
        this.coolDown = 5;
        this.damage = 10;
    }
    
    /**
     * Act - do whatever the Weapons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (world == null)
        {
            world = getWorld();
        }
        //Checks to see if space bar was pressed
        if (Greenfoot.isKeyDown("space") && shotTimer >= coolDown)
        {
            fire();
        }
        else
        {
            shotTimer ++;
        }
    }
    
    public void fire()
    {
        Bullet temp = new Bullet(damage);
        world.addObject(temp, getX(), getY());
        temp.move(getImage().getWidth()/2);
        
        shotTimer = 0;
    }
}

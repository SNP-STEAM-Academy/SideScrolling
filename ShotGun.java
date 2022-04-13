import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShotGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShotGun extends A_Weapon
{
    private int numBullets;
    private int spread;
    
    public ShotGun()
    {
        this.coolDown = 35;
        this.damage = 10;
        numBullets = 7;
        spread = 15;
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
        for(int i = 0; i < numBullets; i ++)
        {
            Bullet temp = new Bullet(damage);
            temp.turn(Util.random(-spread, spread));
            world.addObject(temp, getX(), getY());
        }
        
        shotTimer = 0;
    }
}

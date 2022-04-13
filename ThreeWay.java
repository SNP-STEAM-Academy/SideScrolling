import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThreeWay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThreeWay extends A_Weapon
{
    public ThreeWay()
    {
        this.coolDown = 20;
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
        int turn = 0;
        for(int i = 0; i < 3; i ++)
        {
            Bullet temp = new Bullet(damage);
            temp.turn(turn);
            world.addObject(temp, getX(), getY());
            
            if (i == 1) turn = 15;
            if (i == 2) turn = -15;
        }
        
        shotTimer = 0;
    }
}

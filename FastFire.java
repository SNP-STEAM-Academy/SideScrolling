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
        
        bullets = new Bullet[100];
        for (int i = 0; i < bullets.length; i++)
        {
            bullets[i] = new Bullet(damage);
        }
    }
    
    /**
     * Act - do whatever the Weapons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void main()
    {
        if (game == null)
        {
            game = (Game)getWorld();
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
        game.addObject(temp, getX(), getY());
        temp.move(getImage().getWidth()/2);
        
        shotTimer = 0;
    }
}

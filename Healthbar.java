import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Healthbar class it is making the healthbar and doing anything involved with the healthbar
 * 
 * @author Cole Spiers 
 * @version (a version number or a date)
 */
public class Healthbar extends A_Healthbar
{   
    public void HealthBar(int h)
    {
        health = h;
        img = getImage();
        img.scale(health, img.getHeight());
    }
    
    public void HealthBar (Ship s)
    {
        owner = s;
        health = owner.maxhealth;
        img = getImage();
        img.scale(health, img.getHeight());
    }
    
    public void act()
    {
        //check 2 see if health 2 small
        if(health < 1)
        {
            //signal DEd
            if(owner != null)
            {
                owner.world.removeObject(this);
                owner.world.removeObject(owner);
                
            }
            return;
        }
        else
        {
            //no set set img wdith to health
            img.scale(health,img.getHeight());
            setLocation(10+health/2, getY());
        }
    }
    
    public int getHealth()// a health getter method
    {
        return health;
    }
    
    public void setHealth(int h)//a health setter method
    {
        health = h;
    }
}

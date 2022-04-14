import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where the magic of the ship happens, brings in everything from elsewhere. Makes ship do all the stuff
 * 
 * @author Cole Spiers
 * @version April 4th, 2022
 */
public class Ship extends A_Ship
{
    /**
     * Main ship stuff
     */
    public Ship()
    {
        
    }
    
    
    
    public void act()
    {
        super.act();
        
        if (world == null)
        {
            world = getWorld();
        }
        
        checkKeys();
        checkBounds();
        
        Asteroid temp = (Asteroid)getOneIntersectingObject(Asteroid.class);
        
        //mouse info
        mouse = Greenfoot.getMouseInfo();
    }
    
    
    
    void checkKeys()
    {
        // if (Greenfoot.isKeyDown("w")&& speed < maxSpeed)
        // {
            // speed += thrust;
        // }
        
        // if (Greenfoot.isKeyDown("a"))
        // {
            // turn(-turnSpeed);
        // }
        
        // if (Greenfoot.isKeyDown("s")&& speed > 0)
        // {
            // speed -= thrustBack;
        // }
        
        // if (Greenfoot.isKeyDown("d"))
        // {
            // turn(+turnSpeed);
        // }
        
        // if (Greenfoot.isKeyDown("space")&& shotTimer > shotcooldown)
        // {
            // //shoooting
        // }
    }
    
    void checkBounds()
    {
        
    }
    
    /**
     * 
     * Everything from I_Damageable that is needed here in ship This is just a big list of all the stuff from the implement
     * 
     * from setHealthBar down to getHealth
     * 
     */
    public void setHealthbar()//ensures the implementation should have a health bar
    {
        
    }
    
    
    //damage, heal, reset, setHealth, getHealth
    public void damage(int amount)
    {
        
    }
    
    
    
    public void heal(int amount)
    {
        
    }
    
    
    
    public void reset()
    {
        
    }
    
    
    
    public void setHealth(int amount)
    {
        
    }
    
    
    
    public int getHealth()
    {
        return Health;
    }
    
    
    
}

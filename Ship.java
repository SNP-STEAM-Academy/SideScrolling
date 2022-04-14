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

        vel = new Vector();
    }
    
    
    
    public void act()
    {
        super.act();
        
        if (game == null)
        {
            game = (Game)getWorld();

            pos = new Vector(game.getWidth()*0.2,game.getHeight()*0.5);
        }
        
        checkKeys();
        checkBounds();
        move();
        
        Asteroid temp = (Asteroid)getOneIntersectingObject(Asteroid.class);
        
        //mouse info
        //mouse = Greenfoot.getMouseInfo();
    }
    
    
    
    protected void checkKeys()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            up();
        }
        else if (Greenfoot.isKeyDown("s")){
            down();
        }
        else if (Greenfoot.isKeyDown("a"))
        {
            left();
        }
        else if (Greenfoot.isKeyDown("d")){
            right();
        }
        
        vel.normalize();
        vel.scale(speed);
        pos.add(vel);
    }
    
    protected void checkBounds()
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
    
    
    
    protected void up(){
        vel.y(+speed);
    }
    
    protected void down(){
        vel.y(-speed);
    }
    
    protected void left(){
        vel.x(+speed);
    }
    
    protected void right(){
        vel.x(-speed);
    }
}

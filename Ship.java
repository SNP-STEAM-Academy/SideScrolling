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

            pos = new Vector((double)game.getWidth()*0.2,(double)game.getHeight()*0.5);
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
        //get a new velocity vector
        vel = new Vector();
        if (Greenfoot.isKeyDown("w"))
        {
            up();
        }
        else if (Greenfoot.isKeyDown("s")){
            down();
        }
        if (Greenfoot.isKeyDown("a"))
        {
            left();
        }
        else if (Greenfoot.isKeyDown("d")){
            right();
        }
        
        //if (vel.calcMag()>1){
            vel.normalize();
            
        //}
        vel.scale(speed);
        
        //Util.say("vel:"+vel.getX()+", "+vel.getY());
        //pos.add(vel);
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
    
    
    //NR=>CS I think I will change the way we implement this.
    protected void up(){
        vel.add(new Vector(0,-1));
    }
    
    protected void down(){
        vel.add(new Vector(0,1));
    }
    
    protected void left(){
        vel.add(new Vector(-1, 0));
    }
    
    protected void right(){
        vel.add(new Vector(1, 0));
    }
}

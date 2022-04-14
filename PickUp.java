import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PickUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PickUp extends A_Pickup
{
    Ship ship;
    
    /**
     * Act - do whatever the PickUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        detectShip();
        if (ship != null){
            applyEffect(ship);
            getWorld().removeObject(this);
        }
    }
    
    protected void applyEffect(Ship s){
        
    }
    
    protected void detectShip(){
        ship = (Ship)getOneIntersectingObject(Ship.class);
    }
}

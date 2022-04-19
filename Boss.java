import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author Luca Quacquarelli 
 * @version (a version number or a date)
 */
public class Boss extends A_Boss 
{
    
    
    
    public Boss() {
        
        img = getImage();
        //shot = new GreenfootSound("Button_Press.mp3");
        //healthBar = new HealthBar(this);
        speed = 100;
        cooldown = 10;
        
    
    }
    
    
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       super.act();
    }
    
    
    public void setHealthbar(){
    
        
    
    }
    
    //damage, heal, reset, setHealth, getHealth
    public void damage(int amount) {
    
        
    
    }
    
    public void heal(int amount) {
    
        
    
    }
    
    public void reset() {
    
    
    }
    
    public void setHealth(int amount) {
        this.health = amount;
    
    }
    
    public int getHealth() {
    
        return health;
    }
}

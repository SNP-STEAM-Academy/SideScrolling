import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
        healthBar = new Healthbar();
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
       getHealth();
    }
    
    
    void fire() {
        // int eBullets;
         // eBullets = new ArrayList<Bullet>();
    
    
    
    }
    
    public void setHealthbar(){
        setHealth(30);
         
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

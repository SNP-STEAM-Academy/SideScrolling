import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author Luca Quacquarelli 
 * @version (a version number or a date)
 */
public class Enemy extends A_Enemy {
    
    
    public Enemy() {
        
        img = getImage();
        //shot = new GreenfootSound("Button_Press.mp3");
        //healthBar = new HealthBar(this);
        speed = 5;
        cooldown = 90;
        
    
    }
    
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    
    public void move(double speed) {
        
        // if(Util.distance(mX,mY, getExactX(), getExactY())<speed){
            
            // getRandomLocation();
            
        // }
        // else {
            
            // turnTowards((int)mX, (int)mY);
          
            // super.move(speed);
            
    
        // }
    
    }
    
    void fire() {

    }
    
    
    public void getRandomLocation() {
    
    }
    
}

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
        speed = 4;
        cooldown = 90;
        
    
    }
    
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (world == null) {
            
            world = getWorld();
            getRandomLocation();
            speed = 3;
            
        }
        
        moveTimer++;
        //checkBounds();
        move(speed);
        
        if (shotTimer > cooldown) {
            
            fire();
            
        }
        
        shotTimer++;
        
    }
    
    
    public void move(double speed) {
        
        if(Util.distance(mX,mY, getX(), getY())<speed){
            
            getRandomLocation();
            
        }
        else {
            
            turnTowards((int)mX, (int)mY);
          
            move();
            
    
        }
    
    }
    
    void fire() {

    }
    
    
    public void getRandomLocation() {
     //get a random moveX
        mX = Util.random(0, world.getWidth());
        //get a random moveX
        mY = Util.random(0, world.getHeight());
        moveTimer = 0;
        
    }
    
}

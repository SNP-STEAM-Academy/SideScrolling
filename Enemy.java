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
        //shot = new GreenfootSound("");NR=> use the games soundpool of enemyShot
        //healthBar = new Healthbar(); NR=> enemies are one shot kills and do not need a healthbar
        speed = 4;
        cooldown = 90;
        vel = new Vector(-speed, 0);
    
    }
    
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (game == null) {
            
            game = (Game)getWorld();
        
            pos = new Vector(getX(), getY());
        }
        
        moveTimer++;
        //checkBounds();
        move();
        
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
        Bullet temp = new Bullet(0);
        
        /*
         if(!shot.isPlaying()) {
            
            shot.play();
            
         }
         else {
            
            shot.stop();
            shot.play();
            
        }*/
        game.enemyShot.play();
        
        game.addObject(temp, getX(), getY());
        temp.move(img.getWidth()/2);
        
        shotTimer = 0;
    }
    
    
    public void getRandomLocation() {
     //get a random moveX
        mX = Util.random(0, game.getWidth());
        //get a random moveX
        mY = Util.random(0, game.getHeight());
        moveTimer = 0;
        
    }
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (Luca Quacquarelli) 
 * @date 2022-04-05
 */
public class Asteroid extends A_Asteroid {
    
    /**
     * Constructor for objects of class Asteroid.
     * 
     * This constructor gets a random size from the Util class and then sets the image to that size.
     * Gets a random direction from the Util class.
     * Gets a random speed from the Util class. 
     */
    public Asteroid() {
        size = Util.random(5*minSize, maxSize);
        
        setParameters();
    }// end Asteroid()
    
    /**
     * Constructor for objects of class Asteroid.
     * 
     * This constructor sets the image size and gets a random speed from the Util class. 
     * 
     * @param siz 
     * 
     */
    public Asteroid(int siz) {
        size = siz;
        setParameters();
        
    }// end Asteroid()   
    
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    public void act() {
        
          if (game == null) {
            
            game = (Game)getWorld();
            turnTowards(game.getWidth()/2,game.getHeight()/2);
            //get out position
            //NR=>JN need to move this to a vector method
            pos = new Vector((double)getX(),(double)getY());
            //NR=>JN need to move this to a vector method
            vel = new Vector(Math.cos(getRotation()/180.*Math.PI),Math.sin(getRotation()/180.*Math.PI));
            //get our velocity
        }
        //move
        move(); //NRthis does all the movement
        turn(rotSpeed); // spin  NR=>moved here to keep it with other updating of variables
        
        if (getX() > game.getWidth() + 300 || getX() < -300 || getY() > game.getHeight() + 300 || getY() < -300) {
            
            //yes ==> remove from world
            Util.say("Removed at "+getX()+", "+getY());
            game.removeObject(this);
            
            return;
            
        }
        
        /*
        if (getY() < getRotation() || getY() > getRotation()) // check limits
        {
            xSpeed   = -xSpeed;
            ySpeed = -ySpeed; 
            //getImage().mirrorHorizontally(); // mirror image
        }
        */
       
       //NR=>LQ, NA this should probably lie with the bullet class
       //since the split method is already public
        Actor temp = getOneIntersectingObject(Bullet.class);
        
        if (temp != null) {
            split(temp);
            
        }    
                
    }// end act()
    
    
    //NR used to set the parameters of the asteroid in the constructors in one spot 
    private void setParameters(){
        
        img = getImage();
        img.scale(size, size);
  
        speed = Util.random(minSpeed, maxSpeed);
        rotSpeed = Util.random(minRotation, maxRotation);
        
    }
    
    
    
    /**
     * Method collide has not been created yet. 
     */
    public void collide() {
    
    
    }// end collide()
    
    
    

    /**
     * Method split has not been created yet. 
     */
    public void split(Actor temp) {
         int numKids = Util.random(2, 5);
            int newSize = size/numKids;
            
            if (newSize <= minSize) {
                
                return;
                
            }
            
            //for each one
            for(int i = 0; i < numKids; i++) {
                
                Asteroid kid = new Asteroid(newSize);
                game.addObject(kid, getX(), getY());
                
                kid.turnTowards(temp.getX(), temp.getY());
                
                kid.turn(Util.random(-90, 90));
                                
            }
            
            // //add explosin
            // game.addObject(new Explosion(temp), temp.getX(), temp.getY());
            
            game.removeObject(temp);
            //remove 
            game.removeObject(this);   
            
            
    
    }// end split()
    
    
    
}

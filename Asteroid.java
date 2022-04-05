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
        img = getImage();
        img.scale(size, size);
        
        
        //turn(Util.random(-180,181));
  
        speed = Util.random(minSpeed, maxSpeed);
        
    }// end Asteroid()
    
    
    
    
    
    /**
     * Constructor for objects of class Asteroid.
     * 
     * This constructor sets the image size and gets a random speed from the Util class. 
     * 
     * @param siz 
     * 
     */
    public Asteroid (int siz) {
        
        size = siz;
        
        img = getImage();
        img.scale(size, size);
        speed = Util.random(minSpeed, maxSpeed);
        
    }// end Asteroid()
    
    
    
    
    
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    public void act() {
        
        if (game == null) {
            
            game = (Game)getWorld();
            
        }
        
        //move
        //move(speed);
        
        if (getX() > game.getWidth() + 500 || getX() < -500 || getY() > game.getWidth() + 500 || getY() < -500) {
            
            //yes ==> remove from world
            game.removeObject(this);
            return;
            
        }
        
        Actor temp = getOneIntersectingObject(Bullet.class);
        
        if (temp != null) {
            
            int numKids = Util.random(2, 5);
            int newSize = size/numKids;
            
            if (newSize <= minSize) {
                
                return;
                
            }
            
            //for each one
            for(int i = 0; i < numKids; i++) {
                
                Asteroid kid = new Asteroid(newSize);
                //game.addObject(kid, getX() + Util.random(0, size), getY() + Util.random(0, size));//add it to the world
                game.addObject(kid, getX(), getY());
                
                kid.turnTowards(temp.getX(), temp.getY());
                
                kid.turn(180+Util.random(-90, 90));
                
                //kid.move(kid.speed);
                
            }
            
            // //add explosin
            // game.addObject(new Explosion(temp), temp.getX(), temp.getY());
            
            game.removeObject(temp);
            //remove 
            game.removeObject(this);   
            
        }    
                
    }// end act()
    
    
    
    
    
    /**
     * Method collide has not been created yet. 
     */
    public void collide() {
    
    
    }// end collide()
    
    
    
    
    
    /**
     * Method split has not been created yet. 
     */
    public void split() {
    
    
    }// end split()
    
    
    
    
    
    /**
     * Method getHealth
     *  
     * @return health
     *
     */
    public int getHealth() {//a health getter method
        
       return Health; 
       
    }// end etHealth()
    
    
    
    
    
}

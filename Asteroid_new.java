import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (Luca Quacquarelli) 
 * @date 2022-04-05
 */
public class Asteroid_new extends A_Asteroid {
    
    /**
     * Constructor for objects of class Asteroid.
     * 
     * This constructor gets a random size from the Util class and then sets the image to that size.
     * Gets a random direction from the Util class.
     * Gets a random speed from the Util class. 
     */
    public Asteroid_new() {
        
        size = Util.random(5*minSize, maxSize);
        img = getImage();
        img.scale(size, size);
        
        //turn to ensure the asteroids come in at different angles 
        //turn(Util.random(-45,46));
  
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
    public Asteroid_new (int siz) {
        
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
            turnTowards(game.getWidth()/2,game.getHeight()/2);
            //get out position
            //NR=>JN need to move this to a vector method
            pos = new Vector((double)getX(),(double)getY());
            //NR=>JN need to move this to a vector method
            vel = new Vector(Math.cos(getRotation()/180.*Math.PI),Math.sin(getRotation()/180.*Math.PI));
            //get our velocity
        }
        //move
        move();
        
        if (getX() > game.getWidth() + 500 || getX() < -500 || getY() > game.getWidth() + 500 || getY() < -500) {
            
            //yes ==> remove from world
            System.out.println("Removed at "+getX()+", "+getY());
            game.removeObject(this);
            
            return;
            
        }
        
        Actor temp = getOneIntersectingObject(Bullet.class);
        
        if (temp != null) {
            split(temp);
            
        }    
            
        //System.out.println(""+pos.x+", "+pos.y);
    }// end act()
    
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

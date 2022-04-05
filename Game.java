import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends A_Game
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {
        boolean DEBUG = false;
    
    GifImage templateGif = new GifImage("explosion.gif");
    GifImage gifImg;
    TitleScreen title;
    Ship ship;
    private int lives = 3;

    /**
    * Constructor for objects of class MyWorld.
    *
    */
    public Game()
    {

        // Create a new world with 1000x800 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, false);
        
        ship = new Ship();
        addObject(ship, getWidth()/2, getHeight()/2);//add the ship to the world at its midpoint
        for(int i = 0; i < Spawner.xLocations.length; i++){
            Spawner temp = new Spawner();
            addObject(temp, Spawner.xLocations[i], Spawner.yLocations[i]);
        }
        addObject(new Enemy(), 200, 200); //to do
        setPaintOrder(Ship.class, Bullet.class, Asteroid.class);
        
        if (DEBUG == false)
        {
            title = new TitleScreen();
            title.setGame(this);
            Greenfoot.setWorld(title);
        }
    }

    public void act(){
        //display the lives remaining
        //if lives > 0
        if(lives > 0){
            //create a new ship
            showText("Lives: "+ lives, 35,90);
            //add it into the world
        }
        else{
            showText("Lives: "+ lives, 35,90);
            showText("Game Over", getWidth()/2, getHeight()/2);
            return;
        }

        int numShips = getObjects(Ship.class).size() - getObjects(Enemy.class).size();
        //check to see if a ship is in world
        if(numShips<=0){
            //decrease lives
            lives--;
            if(lives > 0){
                addObject(new Ship(), getWidth()/2, getHeight()/2);
            }
        }
    }
    }
    
    protected void updateBackground(){
        
    }
    
    public void start(){
        
    }
    
    protected void pause(){
        
    }
    
    protected void reset(){
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author Haiden Murphy
 * @version 04/05/2022
 */
public class Game extends A_Game
{
    TitleScreen title;
    Ship ship;
    private int lives = 3;
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {
        
        // Create a new world size with a cell size of 1x1 pixels.
        super(800, 600);
        
        ship = new Ship();
        //add the ship to the world at its midpoint
        addObject(ship, getWidth()/2, getHeight()/2);
        
        /*
        for(int i = 0; i < Spawner.xLocations.length; i++){
            Spawner temp = new Spawner();
            addObject(temp, Spawner.xLocations[i], Spawner.yLocations[i]);
        }
        addObject(new Enemy(), 200, 200); //to do
        setPaintOrder(Ship.class, Bullet.class, Asteroid.class);
        */
        
        if (DEBUG == false)
        {
            title = new TitleScreen();
            title.setGame(this);
            Greenfoot.setWorld(title);
        }
        
        
    }
    
    
    protected void updateBackground()
    {
        
    }
    
    public void start()
    {
        
    }
    
    protected void pause()
    {
        /*
        if (DEBUG && Greenfoot.isKeyDown("p"))
        {
            pause = new PauseMenu();
            pause.setGame(this);
            Greenfoot.setWorld(pause);
        }
        */    
    }
    
    protected void reset(){
        
    }
}

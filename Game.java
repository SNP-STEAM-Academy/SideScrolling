import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 */
public class Game extends A_Game
{

    boolean DEBUG = false;
    TitleScreen title;
    Ship ship;
    
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

    }

    public void act(){
        //display the lives remaining


    }
    
    
    protected void updateBackground()
    {
        
    }
    
    public void start()
    {
        
    }
    
    protected void pause()
    {
        
    }
    
    protected void reset(){
        
    }
}

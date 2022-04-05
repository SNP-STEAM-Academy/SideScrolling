import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class AGame here.
 * 
 * Game has:
 * Player object
 *      ArrayList Ship objects
 * Array of Wave objects
 * UI object
 * Array of Spawners
 * Array of Greenfoot images for background
 * int state  - playing, paused, over
 * 
 * Game does:
 * act()
 * updateBackground()
 * start()
 * pause()
 * reset()
 * 
 */
public abstract class A_Game extends World
{
    protected Player player;
    protected Wave[] waves;
    protected UI ui;
    protected Spawner [] spawners;
    protected GreenfootImage[] backgrounds;
    protected int state;
    
    boolean DEBUG = true;
    
    Ship ship;
    PowerUp powerup;
    World world;
    //TitleScreen title;
    //PauseMenu pause;
    
    private int lives = 3;
    
    private int Spawncooldown = 10;
    private int Minspawncooldown = 25;
    private int Maxspawncooldown = 75;
    
    
    /**
     * Constructor for objects of class AGame.
     * 
     */
    public A_Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
    }
    
    protected abstract void updateBackground();
    public abstract void start();
    protected abstract void pause();
    protected abstract void reset();
    
}

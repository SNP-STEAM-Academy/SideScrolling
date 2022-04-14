import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
import java.util.ArrayList;

/**
 * Discription of A_Game class:
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
    protected ArrayList<Wave> waves;//NR allows us to scale based on number of wave files present
    protected UI ui;
    public Spawner [] spawners;
    protected GreenfootImage[] backgrounds;
    protected int state;
    
    boolean DEBUG = true;
    
    Ship ship;//NR prob not needed as the waves can specify the tiems
    PowerUp powerup;
    //TitleScreen title;
    //PauseMenu pause;
    
    private int lives = 3;//NR perhaps replace this with a Player object
    private int Spawncooldown = 10;//NR prob not needed as the waves can specify the tiems
    private int Minspawncooldown = 25;//NR prob not needed as the waves can specify the tiems
    private int Maxspawncooldown = 75;//NR prob not needed as the waves can specify the tiems
    
    /**
     * Constructor for objects of class AGame.
     * 
     */
    public A_Game(int w, int h)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1, false); 
        
    }
    
    protected abstract void updateBackground();
    public abstract void start();
    protected abstract void pause();
    protected abstract void reset();
    
}

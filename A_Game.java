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


//NR I made this nonabstract to see if the game would allow the Asteroids to leave.
public  class A_Game extends World
{
    protected Player player;
    protected ArrayList<Wave> waves;//NR allows us to scale based on number of wave files present
    protected UI ui;
    public Spawner [] spawners;
    protected GreenfootImage[] backgrounds;
    protected int state;
    

    //public static boolean DEBUG = false;

    boolean DEBUG = false;

    
    protected Ship ship;//NR prob not needed as the waves can specify the tiems
    protected PowerUp powerup;
    protected TitleScreen title;
    //PauseMenu pause;
    
    protected int lives = 3;//NR perhaps replace this with a Player object
    protected int Spawncooldown = 10;//NR prob not needed as the waves can specify the tiems
    protected int Minspawncooldown = 25;//NR prob not needed as the waves can specify the tiems
    protected int Maxspawncooldown = 75;//NR prob not needed as the waves can specify the tiems
    
    /**
     * Constructor for objects of class AGame.
     * 
     */
    public A_Game (int w, int h, int siz, boolean bounded){
        super(w, h, siz, false);
    }
    /*
    protected abstract void updateBackground();
    public abstract void start();
    protected abstract void pause();
    protected abstract void reset();
    */
}

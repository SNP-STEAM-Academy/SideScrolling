import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Haiden Murphy
 * @version 04/05/2022
 */
public class TitleScreen extends A_TitleScreen
{
    
    private GifImage gifImg = new GifImage("TitleScreenboth.gif");//sets new GifIMage
    //int width;//NR=>HM uset getWidth and getHeight instead              
    //int height;
    //protected Game game; //NR=>HM moved to abstract class
    GreenfootSound myMusic = new GreenfootSound("Title.mp3");//NR=>HM just commenting this until you have music to use
    private double volume = 0;
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen(Game g)
    {
        super(1000, 600);
        //gifImg = templateGif; //gifImg
        //This is the main screen we are starting in now.  How?
        game = g;
        
        //(gifImg);                 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        GreenfootImage img = new GreenfootImage(500,500);//NR Is this for a button?
        
        //call the onstructer for title screen
        //Greenfoot.setWorld(title);
        
        //game = g;
        //(gifImg);                 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //GreenfootImage img = new GreenfootImage(500,500);
        addObject(new Label("Click Anywhere to Contitue", 25), getWidth()/2, (int)(getHeight() * 0.7));
        
    }
    
    public void act()
    {
        setImage();
        if (!myMusic.isPlaying()){
            myMusic.playLoop();
        }
        
        if (volume<50){
            myMusic.setVolume((int)(volume+= 0.2));
            
        }
        //myMusic.play();//NR=>HM just commenting this until you have music to use
        if (Greenfoot.mouseClicked(this))
        {//
            myMusic.stop();
            Greenfoot.setWorld(game);
        }//
    }
    /* NR=> HM removed this as responisibility should lie with the constructor
    public void setGame(Game g)
    {
        Util.say("setting game variable"+game);
        game = g;

    }
    */
    
   
    protected void setImage()
    {
        GreenfootImage temp = gifImg.getCurrentImage();
        //temp.scale(getWidth(), getHeight());//comment out if image size changed
        
        setBackground(temp);
    }
}

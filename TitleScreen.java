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
<<<<<<< Updated upstream

    //int width;//NR=>HM uset getWidth and getHeight instead                                                         //w
    //int height;                                                        //h
    //protected Game game; //NR=>HM moved to abstract class
    GreenfootSound myMusic = new GreenfootSound("Title.mp3");//NR=>HM just commenting this until you have music to use
=======
    //GifImage gifImg; 
    int width;                                                         //w
    int height;                                                        //h
    private Game game;
    GreenfootSound myMusic = new GreenfootSound("");
>>>>>>> Stashed changes
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen(Game g)
    {
        super(1000, 600);
        //gifImg = templateGif; //gifImg
<<<<<<< Updated upstream
        //This is the main screen we are starting in now.  How?
        game = g;
        
        //(gifImg);                 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        GreenfootImage img = new GreenfootImage(500,500);//NR Is this for a button ?
=======
        
        //call the onstructer for title screen
        //Greenfoot.setWorld(title);
        
        //game = g;
        //(gifImg);                 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        GreenfootImage img = new GreenfootImage(500,500);
>>>>>>> Stashed changes
        //(new Label("Click Anywhere to Contitue", 25), getWidth()/2, (int)(getHeight() * 0.7));
    }
    
    public void act()
    {
        setImage();
<<<<<<< Updated upstream
        myMusic.play();//NR=>HM just commenting this until you have music to use
=======
        myMusic.play();
>>>>>>> Stashed changes
        if (Greenfoot.mouseClicked(this))
        {//
            Util.say(""+game);
            Greenfoot.setWorld(game);
        }//
    }
<<<<<<< Updated upstream
    /* NR=> HM removed this as responisibility should lie with the constructor
    public void setGame(Game g)
    {
        Util.say("setting game variable"+game);
        game = g;

    }
    */
=======
    
    public void setGame(Game g)
    {
        this.game = g;
    }
    
>>>>>>> Stashed changes
    protected void setImage()
    {
        GreenfootImage temp = gifImg.getCurrentImage();
        //temp.scale(getWidth(), getHeight());//comment out if image size changed
        
<<<<<<< Updated upstream
=======
        
>>>>>>> Stashed changes
        setBackground(temp);
    }
}

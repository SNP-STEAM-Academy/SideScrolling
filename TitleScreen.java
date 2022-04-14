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
    //GifImage gifImg; 
    int width;                                                         //w
    int height;                                                        //h
    private Game game;
    GreenfootSound myMusic = new GreenfootSound("");
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {
        super(1000, 600);
        //gifImg = templateGif; //gifImg
        
        //call the onstructer for title screen
        //Greenfoot.setWorld(title);
        
        //game = g;
        //(gifImg);                 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        GreenfootImage img = new GreenfootImage(500,500);
        //(new Label("Click Anywhere to Contitue", 25), getWidth()/2, (int)(getHeight() * 0.7));
    }
    
    public void act()
    {
        setImage();
        myMusic.play();
        if (Greenfoot.mouseClicked(this))
        {//
            Greenfoot.setWorld(game);
        }//
    }
    
    public void setGame(Game g)
    {
        this.game = g;

    }
    
    protected void setImage()
    {
        GreenfootImage temp = gifImg.getCurrentImage();
        //temp.scale(getWidth(), getHeight());//comment out if image size changed
        
        
        setBackground(temp);
    }
}

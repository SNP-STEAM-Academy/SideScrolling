import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Haiden Murphy
 * @version 04/05/2022
 */
public class TitleScreen extends A_TitleScreen
{
    
    private GifImage templateGif = new GifImage("TitleScreenboth.gif");//sets new GifIMage
    GifImage gifImg; 
    int width;                                                         //w
    int height;                                                        //h
    private Game game;
    //Label titlelabel;
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {
        super(800, 600);
        gifImg = templateGif; //gifImg
        //game = g;
        //setImage(gifImg);                 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        //addObject(new Label("Click Anywhere to Contitue", 25), getWidth()/2, (int)(getHeight()));
        
        
        
        
    }
    
    public void act()
    {
        setImage();
        if (Greenfoot.mouseClicked(this))
        {//
            Greenfoot.setWorld(game);
        }//
    
    }
    
    public void setGame(Game g){
    }
    
    protected void setImage(){}
}

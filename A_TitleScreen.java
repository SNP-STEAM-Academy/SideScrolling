import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_TitleScreen extends World
{

    /**
     * Constructor for objects of class A_TitleScreen.
     * 
     */
    public A_TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public abstract void act();
    public abstract void setGame(Game g);
    protected abstract void setImage();
    
    
}

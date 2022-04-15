import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A_TitleScreen here.
 * 
 * @author Haiden Murphy
 * @version 04/05/2022
 */
public abstract class A_TitleScreen extends World
{
    Game game;
    
    
    /**
     * Constructor for objects of class A_TitleScreen.
     * 
     */
    public A_TitleScreen(int w, int h)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1, false);
    }
    
    protected abstract void setImage();
    
    
}

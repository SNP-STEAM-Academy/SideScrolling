import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Haiden Murphy
 * @version 04/07/2022
 */
public class UI extends A_UI
{
    /**
     *
     */
    public void UI(int u)
    {
        UIBanner = u;
        img = getImage();
        img.scale(UIBanner, img.getHeight());
    }
    
    public void UI(Ship s)
    {
        owner = s;
        //UIBanner = owner.maxUIBanner;
        img = getImage();
        img.scale(UIBanner, img.getHeight());
    }
    
    public void act()
    {
    
    }
}

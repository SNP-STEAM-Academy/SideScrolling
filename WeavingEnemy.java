import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WeavingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeavingEnemy extends Enemy
{
    /**
     * Act - do whatever the WeavingEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        vel.rotate(2*Math.sin(pos.getY()/500+50));
    }
}

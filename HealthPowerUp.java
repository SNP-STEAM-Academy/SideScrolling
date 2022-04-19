import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPowerUp extends PickUp
{   
    protected void applyEffect(){
        ship.heal(10);
    }
}

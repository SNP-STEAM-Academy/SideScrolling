import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawners here.
 * 
 * @author Rowbottom 
 * @version Apr 2022
 */
public abstract class A_Spawner extends Actor
{
    //public static int [] probabilities = {3, 14};
    public static int [] xLocations = {1300, 1300,1300, 1300, 1300};
    public static int [] yLocations = {-300, 100, 300, 500, 900};
    //int spawnTimer = 0;NR using time from wave 
    //int spawnCooldown = 200;
    //int minCooldown = 150;
    //int maxCooldown = 1600;
    protected EnemyType enemyType;
    int spread = 15; //NR still have some RNG although we could specify the velocity vector as well
    
    public void spawn(Asteroid a){
        getWorld().addObject(a, getX(), getY()); 
    }
    
}

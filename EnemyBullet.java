import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Bullet
{
    public int damage = 25;//just an example damage, change for progression
    protected Game game;
    protected int speed = 8;
    public EnemyBullet(int d){
        damage = d;
        
    }
    
    
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (game == null){
            game = (Game)getWorld(); 
            //if close enough, aim at the ship
            List<Ship> targets = getObjectsInRange(game.getWidth(), Ship.class);
            
            if (targets.size() > 0){
                turnTowards(targets.get(0).getX(), targets.get(0).getY());
            }
            else{
                //or just go straight
                turn(180);
            }
        }
        move(speed);
        checkBounds();
        
    }
}

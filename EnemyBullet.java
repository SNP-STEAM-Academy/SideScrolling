import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author Nicodemus Allan
 * @version March 14 2022
 */
public class EnemyBullet extends A_Bullet
{
    public EnemyBullet(int damage)
    {
        this.damage = damage;
        this.speed = 15;
    }
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //vel.x(speed);
        checkBounds();
        
        Ship hit = (Ship)getOneIntersectingObject(Ship.class);
        if(hit == ship)
        {
            hit = null;
        }
        causeDamage(hit);
        
    }
    
    protected void causeDamage(Ship hit)
    {
        if (hit == null)
        {
            return;
        }
        world.removeObject(hit);
        world.removeObject(this);
    }
    
    protected void checkBounds()
    {
        if (world == null)
        {
            world = getWorld();
        }
        if (getX() > (world.getWidth() + 50))
        {
            world.removeObject(this);
            System.out.println("EnemeyBullet Removed");
            return;
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Bullet class will control the basic functions of the bullet such as movement, damage and, bonderyChecking.
 * 
 * @author Nicodemus Allan 
 * @version March 4, 2022
 */
public class Bullet extends A_Bullet
{
    /**
     * Bullet class constructor
     */
    public Bullet(int damage)
    {
        super();
        this.damage = damage;
        this. speed = 25;
    }
    
    public Bullet(){
        super();
    }
    
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (game == null)
        {
            game = (Game)getWorld();
        }
        move(speed);
        checkHit(Asteroid.class);
        checkBounds();
        
    }
    
    protected void checkHit(Class targetClass){
        //try to get an object we intersected with
        Asteroid target = (Asteroid)getOneIntersectingObject(targetClass);//NR for the enemy bullet you need to override the checkHit call and causedamage as the Ship is not a subclass of Asteroid
        if (target != null){
            causeDamage(target);
        }
    }
    
    
    protected void causeDamage(Asteroid t)
    {

        t.damage(damage);//NR=>LQ the Asteroid need a takeDamage function, it should at teh very least remove the Asteroid
        //world.removeObject(Asteroid());

        //add pick up construcror 
        game.removeObject(this);
    }
    
    protected void causeDamage(Enemy e)
    {
        e.damage(damage);
        
        //add pick up construcror 
        game.removeObject(this);
    }
    
    protected void causeDamage(Ship hit)
    {
        //t.takeDamage(damage);//NR=>LQ the Asteroid need a takeDamage function, it should at teh very least remove the Asteroid
        
    }
    
    protected void checkBounds()
    {
        if (game == null)
        {
            return;//NR protect from a null pointer exception from the check hit method
        }
        if (getX() > (game.getWidth() + 50) || getX() < -50 || getY() > (game.getHeight() + 50) || getY() < -50)
        {
            game.removeObject(this);
            return;
        }
    }
}

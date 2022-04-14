import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VecActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VecActor extends A_VecActor
{
    /**
     * Act - do whatever the VecActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        //new code below
    }
    
    public void move(){//use the mag and direction of the vel to move
        pos.add(vel);
        setLocation(pos.getX(), pos.getY());
    }
    
    public void setVel(double vx, double vy){
        vel.x = vx;
        vel.y = vy;
    }
    
    public void setVel(Vector v){
        vel = v;
    }
    
    public Vector getVel(){
        return vel;
    }
    
    public Vector getPos(){
        return pos;
    }
    
    public void setLocation(int x, int y){
        super.setLocation(x, y);
    }
    
    public void setLocation(double x, double y){
        super.setLocation((int)x + 0.5, (int) y + 0.5);
    }
    
    public void setLocation(Vector p){
        setLocation(p.getX(), p.getY());
    }
    
    public int getRotation(){
        return super.getRotation();
    }
    
}

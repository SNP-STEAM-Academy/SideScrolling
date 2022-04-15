import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AVecActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_VecActor extends Actor
{
    protected Vector pos;
    protected Vector vel;
    //protected Vector dir;
    public abstract void move();//use the mag and direction of the vel to move
    
    public abstract void setVel(double vx, double vy);
    public abstract void setVel(Vector v);
    public abstract Vector getVel();
    public abstract Vector getPos();
    public void setLocation(int x, int y){
        pos = new Vector(x, y);
        super.setLocation(x, y);
    }
    public void setLocation(double x, double y){
        pos = new Vector(x, y);
        super.setLocation((int)(x+0.5),(int)(y+0.5));
    }
    public abstract void setLocation(Vector p);
    
    public int getRotation(){
        
        if (vel == null){
           return super.getRotation(); 
        }
        
        return (int)vel.calcAngle();
    }
    
}

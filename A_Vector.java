/**
 * Write a description of class AVector here.
 * 
 * A Vector has:
 *  x, y, angle, magnitude
 * 
 * A Vector does:
 * add, sub, scale, normalize, calcAngle, calcMag
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_Vector  
{
    protected double x;//changed from int
    protected double y;//changed from int
    protected double angle;//angle in degrees
    protected double theta;//angle in radians
    protected double mag;
    
    public abstract void add(Vector other);
    public abstract void sub(Vector other);
    public abstract void scale(double num);
    public A_Vector(double x, double y){
        this.x = x;
        this.y = y;
        calcAngle();
        calcMag();
    }
    
    public A_Vector(){
        this.x = 0;
        this.y = 0;
    }
    public abstract void normalize();
    public abstract double calcAngle();
    public abstract double calcMag();
    public abstract double getX();
    public abstract double getY();
    
    public  double[] asArray(){
        return new double[]{x,y};
    }
}

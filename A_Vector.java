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
    protected double angle;
    protected double mag;
    
    public abstract void add(AVector other);
    public abstract void sub(AVector other);
    public abstract void scale(double num);
    
    public abstract void normalize();
    public abstract double calcAngle();
    public abstract double calcMag();
    public abstract double getX();
    public abstract double getY();
    public  double[] asArray(){
        return new double[]{x,y};
    }
}

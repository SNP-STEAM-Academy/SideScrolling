/**
 * Write a description of class Vector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector extends A_Vector 
{
    /**
     * Constructor for objects of class Vector
     */
    public Vector()
    {
        super();
    }

    public void add(A_Vector other){
        x += other.getX();
        y += other.getY();
    }
    
    public void sub(A_Vector other){
        x -= other.getX();
        y -= other.getY();
    }
    
    public void scale(double num){
        mag *= num;
    }
    
    public void normalize(){
        x = x/mag;
        y = y/mag;
    }
    
    public double calcAngle(){
        angle = Math.atan(y/x);
        return angle;
    }
    
    public double calcMag(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public  double[] asArray(){
        return super.asArray();
    }
}

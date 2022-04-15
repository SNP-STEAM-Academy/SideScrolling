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
    
    public Vector(int x, int y)
    {
        super((double)x, (double)y);
    }
    
    public Vector(int angle, double mag){
        double theta = (double)angle/180.*Math.PI;
        x = mag*Math.cos(theta);
        y = mag*Math.sin(theta);
    }

    public Vector(double _x, double _y)
    {
        super();
        x = _x;
        y = _y;
    }
    //move ==> pos.add(vel)
    public void add(Vector other){

        x += other.getX();
        y += other.getY();
    }
    
    public void sub(Vector other){
        x -= other.getX();
        y -= other.getY();
    }
    
    public void scale(double num){
        mag *= num;
    }
    
    public void normalize(){
        //NR=>JN I think we need to make sure we have calculated the latest
        //magnitude first
        calcMag();
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

    public void x(double _x){
        x = _x;
    }
    
    public void y(double _y){
        y = _y;
    }
    
    public  double[] asArray(){
        return super.asArray();
    }
}

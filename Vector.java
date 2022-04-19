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
        this.mag = mag;
        this.angle = angle;
        theta = (double)angle/180.*Math.PI;
        x = mag*Math.cos(theta);
        y = mag*Math.sin(theta);
    }

    public Vector(double _x, double _y)
    {
        
        x = _x;
        y = _y;
        calcAngle();
        calcMag();
    }
    //move ==> pos.add(vel)
    public void add(Vector other){

        x += other.getX();
        y += other.getY();
        calcMag();
        calcAngle();
    }
    
    public void sub(Vector other){
        x -= other.getX();
        y -= other.getY();
        calcMag();
        calcAngle();
    }
    
    public void scale(double num){
        mag *= num;
        //NR need to use this to update the x, y components
        x = mag*Math.cos(theta);
        y = mag*Math.sin(theta);
    }
    
    public void normalize(){
        //NR=>JN I think we need to make sure we have calculated the latest
        //magnitude first
        if (x == 0 && y == 0){
            return;
        }
        
        calcMag();
        
        Util.say("Normalized"+x+", "+y);
        x = x/mag;
        y = y/mag;
        Util.say("Normalized"+x+", "+y);
    }
    
    public void rotate(double a){
        angle += a;
        theta = angle*Math.PI/180.;
        calcMag();
        x = mag*Math.cos(theta);
        y = mag*Math.sin(theta);
        
    }
    
    public double calcAngle(){
        //NR we should be doing this by quadrant
        theta = Math.atan2(y,x);//this should be in radians
        angle = theta/Math.PI*180.;
        return angle;
    }
    
    public double calcMag(){
        mag = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (mag == 0){
            mag = 1;
        }
        return mag;
    }
    
    public double getMag(){
        return mag;
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

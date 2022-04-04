/**
 * Write a description of interface IDamageable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface I_Damageable  
{
    public abstract void setHealthbar();//ensures the implementation should have a health bar
    
    //damage, heal, reset, setHealth, getHealth
    public abstract void damage(int amount);
    
    public abstract void heal(int amount);
    
    public abstract void reset();
    public abstract void setHealth(int amount);
    
    public abstract int getHealth();
    
}

import greenfoot.GreenfootSound;

/**
 * Write a description of class SoundPool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundPool  
{
    protected static GreenfootSound[] pool = new GreenfootSound[20];
    public static int current = 0;
    
    public SoundPool(String fileName){
        //load up the pool
        for (int i = 0; i < pool.length; i++){
            pool[i] = new GreenfootSound(fileName);
        }
    }
    
    public static void play(){
        //find an available sound
        for (int i = 0; i < pool.length;i++){
            if (!pool[i].isPlaying()){
               current = i;    
               pool[current].play();
               break;
            }
        }
    }
    
    public static void stop(){
        //Stop all sounds that are playing
        for (int i = 0; i < pool.length;i++){
            if (pool[i].isPlaying()){
               pool[i].stop();
            }
        }
    }
}

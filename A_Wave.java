import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;

/**
 * Write a description of class Wave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_Wave  
{
    protected long currentTime = 0;
    protected long startTime = 0;
    protected ArrayList<A_Asteroid> enemies;
    protected ArrayList<Long> times;
    protected ArrayList<Integer> spawners;
    protected Game game;
    
    public A_Wave(Game g){
        game = g;
        
        enemies = new ArrayList<A_Asteroid>();
        times = new ArrayList<Long>();
        spawners = new ArrayList<Integer>();
    }
    
    //call this in the world act method
    public void act(){
        //the first time running, get the starting time
        if (startTime == 0){
            startTime = System.currentTimeMillis();
        }
        currentTime = System.currentTimeMillis() - startTime;
        if (enemies.size()>0){
            //NR note these need to be switched to Asteroid when completed
            Asteroid_new nextEnemy = (Asteroid_new)enemies.get(0);
            if (times.get(0).longValue()<currentTime){
                System.out.println("spawners"+spawners.get(0).intValue()%game.spawners.length+", "+game.spawners[spawners.get(0).intValue()%game.spawners.length]);
                game.spawners[spawners.get(0).intValue()%game.spawners.length].spawn(enemies.get(0));
                //remove the enemy, time and spawner int.
                enemies.remove(0);
                times.remove(0);
                spawners.remove(0);
                System.out.println("spawned in an enemy at time "+currentTime);
            }
        }
        else{
            System.out.println("need a new wave");
        }
    }
    
    
    //NR a way to get the number of remaining enemies in the wave
    public int getNumberRemaining(){
        return enemies.size();
    }
    
    protected abstract void addEnemy(String etype, String time, String spawner);
    
}

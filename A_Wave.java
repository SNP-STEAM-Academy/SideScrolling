import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class Wave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class A_Wave  
{
    //NR Unfortunately I have the wave completed at home.
    protected Date date; 
    protected String [] waveString;//a string representation that if read in and contained the current wave
    protected String [] currentSpawn;//a string representation which will be used to spawn in an enemy
    protected int currentWave;
    protected long currentTime;//the current amount of millis so far
    protected long startTime;//the time the wave started
    protected File fileName; 
    protected FileReader file;
    protected Spawner [] spawners;//needs to be set in the contructors
    protected ArrayList<Asteroid> enemies;
    protected Game game;//need this in the constructor to make life easier
    
    public A_Wave(int num, Spawner[] s){
        //num is used to set the file name.  
        //Files should be named something like "wave"+num+".txt"
        currentWave = num;
        spawners = s;
         
        //read the file
        fileName = new File("wave"+num+".txt");
        //create the waves enemies
        //set the time of when the wave started
        date = new Date();
        startTime = date.getTime();
    }
    
    public abstract void act();//needs to be called in the Game.act()
    
    protected abstract String [] readFile();
    
    public abstract ArrayList<Asteroid> createEnemies();
    
    
}

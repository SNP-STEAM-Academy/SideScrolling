import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

/**
 * Write a description of class Game here.
 * 
 */
public class Game extends A_Game
{

    TitleScreen title;
    //Ship ship;//NR removed this as we inherited one
    
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {
        
        // Create a new world size with a cell size of 1x1 pixels.

        super(1000, 600);//NR standard size as recommented by NA

        ship = new Ship();//NR the player will eventually contain the ship object
        //add the ship to the world at its midpoint
        addObject(ship, getWidth()/4, getHeight()/2);//moved towards the left for start
        createWaves();
        addSpawners();

    }

    public void act(){
        
        
        
        
        
        //NR Make sure all action code not related to spawning is above here
        //check to see if any more waves are available
        if (waves.size()==0){
            //no gameover
            showText("GameOver", getWidth()/2, getHeight()/2); 
            return;
        }
        Wave wave = waves.get(0);
        //NR check to see if the wave is empty
        if (wave.getNumberRemaining()>0){
        //no then call its act method
            waves.get(0).act();
        }
        else{
        //yes then remove it from the list of waves
            waves.remove(0);
            System.out.println("Removed wave."+waves.size()+" waves remaining");
        }
    }
    
    
    protected void updateBackground()
    {
        
    }
    
    public void start()
    {
        
    }
    
    protected void pause()
    {
        
    }
    
    protected void reset(){
        
    }
    
    protected void createWaves(){
        waves = new ArrayList<Wave>();
        
        for (int i = 0; i < 100; i++){
            //try to load a file
            try{
                //try to read a wave file
                File file = new File(System.getProperty("user.dir")+"/waves/wave"+i+".txt");
                //if successful then call the wave's and make constructor
                Wave wave = new Wave(this);
                Scanner reader = new Scanner(file);
                while(reader.hasNextLine()){
                    
                    String line = reader.nextLine();
                    if (line.contains("#")){
                        continue;
                    }
                    String[] data = line.split(","); 
                    wave.addEnemy(data[0].trim(), data[1].trim(), data[2].trim());
                    
                    System.out.println(data[0].trim()+", "+ data[1].trim()+", "+ data[2].trim());
                }
                waves.add(wave);
                reader.close();
            }
            catch(FileNotFoundException e){
                System.out.println("we read in "+(i)+"waves.");
                break;
            }
        }
    }
    
    protected void addSpawners(){
        spawners = new Spawner[Spawner.xLocations.length];
        //use the static positions to create the spawners
        for (int i = 0; i < spawners.length;i++){
            //call the constructors
            spawners[i] = new Spawner();
            //add them in
            addObject(spawners[i], Spawner.xLocations[i],Spawner.yLocations[i]);
        }
    }
}

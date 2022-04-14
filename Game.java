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
<<<<<<< Updated upstream
        super(1000, 600);//NR standard size as recommented by NA
=======
        super(1000, 600);
>>>>>>> Stashed changes
        
        ship = new Ship();//NR the player will eventually contain the ship object
        //add the ship to the world at its midpoint
        addObject(ship, getWidth()/4, getHeight()/2);//moved towards the left for start
        createWaves();
        addSpawners();

    }

    public void act(){
        //display the lives remaining


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
                
                File file = new File(System.getProperty("user.dir")+"/waves/wave"+i+".txt");
                Scanner reader = new Scanner(file);
                while(reader.hasNextLine()){
                    
                    String data = reader.nextLine();
                    System.out.println(data);
                }
                reader.close();
            }
            catch(FileNotFoundException e){
                System.out.println("we read in "+(i)+"waves.");
                break;
            }
        }
    }
    
    protected void addSpawners(){
        spawners = new Spawner[5];
        //use the static positions to create the spawners
        for (int i = 0; i < Spawner.xLocations.length;i++){
            //call the constructors
            spawners[i] = new Spawner();
            //add them in
            addObject(spawners[i], Spawner.xLocations[i],Spawner.yLocations[i]);
        }
    }
}

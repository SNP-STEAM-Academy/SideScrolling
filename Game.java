import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends A_Game
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {
<<<<<<< HEAD
        boolean DEBUG = false;
    
    GifImage templateGif = new GifImage("explosion.gif");
    GifImage gifImg;
    TitleScreen title;
    Ship ship;
    private int lives = 3;

    /**
    * Constructor for objects of class MyWorld.
    *
    */
    public Game()
    {

        // Create a new world with 1000x800 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, false);
        
        ship = new Ship();
        addObject(ship, getWidth()/2, getHeight()/2);//add the ship to the world at its midpoint
        for(int i = 0; i < Spawner.xLocations.length; i++){
            Spawner temp = new Spawner();
            addObject(temp, Spawner.xLocations[i], Spawner.yLocations[i]);
        }
        addObject(new Enemy(), 200, 200); //to do
        setPaintOrder(Ship.class, Bullet.class, Asteroid.class);
        
        if (DEBUG == false)
        {
            title = new TitleScreen();
            title.setGame(this);
            Greenfoot.setWorld(title);
        }
    }

    public void act(){
        //display the lives remaining
        //if lives > 0
        if(lives > 0){
            //create a new ship
            showText("Lives: "+ lives, 35,90);
            //add it into the world
        }
        else{
            showText("Lives: "+ lives, 35,90);
            showText("Game Over", getWidth()/2, getHeight()/2);
            return;
        }

        int numShips = getObjects(Ship.class).size() - getObjects(Enemy.class).size();
        //check to see if a ship is in world
        if(numShips<=0){
            //decrease lives
            lives--;
            if(lives > 0){
                addObject(new Ship(), getWidth()/2, getHeight()/2);
            }
        }
    }
=======
<<<<<<< HEAD
        ship = new Ship();
        addObject(ship, getWidth()/2, getHeight()/2);
        
        // for(int i =0; i < Spawner.xLocations.length; i++)
        // {
            // Spawner temp = new Spawner();
            // addObject(temp, Spawner.xLocations[i], Spawner.yLocations[i]);
        // }
        // addObject(new Enemy(), 200, 200);
        // setPaintOrder(Ship.class, Bullet.class, Asteroid.class);
        
        // if(!DEBUG)
        // {
            // //calling a constructor for the title screen
            // title = new TitleScreen();
            // //setting the game for the active instince
            // title.setGame(this);
            // //then opening the title screen first before game
            // Greenfoot.setWorld(title);
        // }
        
        // if (!DEBUG && Greenfoot.isKeyDown("p"))
        // {
            // //calling for pause menu
            // pause = new PauseMenu();
            // pause.setGame(this);
            // Greenfoot.setWorld(pause);
        // }
=======
        
>>>>>>> f8c71cd35be94229b6e1e22ebc2709e31768bcc9
>>>>>>> 49767777ac80fecd984008a70dbabde2f66fd5ee
    }
    
    public void act()
    {
        //display lives 
        // if(lives>0)
        // {
            // showText("Lives: "+lives, 100, 100);
        // }
        // else
        // {
            // //else
            // showText("Start Again?!?", 600, 350);
            // showText("GAME OVER!!!", 600, 400);
            // showText("",100,100);
            // return;
        // }
        // //chek for ship in world
        // int numShips =  getObjects(Ship.class).size() - getObjects(Enemy.class).size();
        // if(numShips<=0)
        // {
            // //if no -1 life
            // lives--;
            // if(lives > 0)
            // {
                // ship = new Ship();
                // addObject(ship, getWidth()/2, getHeight()/2);
            // }           
        // }
        
        // if (lives <= 2)
        // { //power up
            // if (Spawncooldown <= 0)
            // {
                // addObject(new powerUp(), 300, 300);
                // //System.out.println("oof");
            // }else Spawncooldown = Util.random(Minspawncooldown, Maxspawncooldown);
            
            // Spawncooldown--;
        // }
    }
    
    
    
    protected void updateBackground(){
        
    }
    
    public void start(){
        
    }
    
    protected void pause(){
        
    }
    
    protected void reset(){
        
    }
}

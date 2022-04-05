import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author Haiden Murphy
 * @version 04/05/2022
 */
public class Game extends A_Game
{
<<<<<<< HEAD
=======
<<<<<<< HEAD

    /**
     * Constructor for objects of class Game.
     * 1
     */
    public Game()
    {
<<<<<<< HEAD
//<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
        boolean DEBUG = false;
    
=======
    boolean DEBUG = false;
>>>>>>> 1bc8d433465dda9ef752fe82f9148b70bae20aaa
    GifImage templateGif = new GifImage("explosion.gif");
    GifImage gifImg;
>>>>>>> fc181e8f6acfd5975159b66bb6309b2320fa6c2e
    TitleScreen title;
    Ship ship;
    private int lives = 3;
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {
        
        // Create a new world size with a cell size of 1x1 pixels.
        super(800, 600);
        
        ship = new Ship();
        //add the ship to the world at its midpoint
        addObject(ship, getWidth()/2, getHeight()/2);
        
        /*
        for(int i = 0; i < Spawner.xLocations.length; i++){
            Spawner temp = new Spawner();
            addObject(temp, Spawner.xLocations[i], Spawner.yLocations[i]);
        }
        addObject(new Enemy(), 200, 200); //to do
        setPaintOrder(Ship.class, Bullet.class, Asteroid.class);
        */
        
        if (DEBUG == false)
        {
            title = new TitleScreen();
            title.setGame(this);
            Greenfoot.setWorld(title);
        }
<<<<<<< HEAD
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
>>>>>>> 8892dd060a949ef134589e66c335912b4491f2c1
>>>>>>> c8994f8134c6a95bc35eac02e4bfa250023a7cc8
        ship = new Ship();
        addObject(ship, getWidth()/2, getHeight()/2);
=======
>>>>>>> 1bc8d433465dda9ef752fe82f9148b70bae20aaa
        
        
<<<<<<< HEAD
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
<<<<<<< HEAD
//=======
        
//>>>>>>> f8c71cd35be94229b6e1e22ebc2709e31768bcc9
=======
<<<<<<< HEAD
=======
=======
        
>>>>>>> f8c71cd35be94229b6e1e22ebc2709e31768bcc9
>>>>>>> 49767777ac80fecd984008a70dbabde2f66fd5ee
>>>>>>> 8892dd060a949ef134589e66c335912b4491f2c1
>>>>>>> c8994f8134c6a95bc35eac02e4bfa250023a7cc8
=======
>>>>>>> 1bc8d433465dda9ef752fe82f9148b70bae20aaa
    }
    
    
    protected void updateBackground()
    {
        
    }
    
    public void start()
    {
        
    }
    
    protected void pause()
    {
        /*
        if (DEBUG && Greenfoot.isKeyDown("p"))
        {
            pause = new PauseMenu();
            pause.setGame(this);
            Greenfoot.setWorld(pause);
        }
        */    
    }
    
    protected void reset(){
        
    }
}

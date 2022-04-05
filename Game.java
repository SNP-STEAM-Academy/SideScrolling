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

/**
 * Write a description of class Wave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wave extends A_Wave 
{

    public Wave(Game g){
        super(g);
    }
    
    //used to add enemies based on strings in text files
    protected void addEnemy(String e, String time, String spawner){
        int etype = Integer.parseInt(e);
        if (etype == 0){
            enemies.add(new Asteroid_new());
            //enemies.add(new Asteroid());
        }
        else if (etype == 1){
            enemies.add(new Enemy());
        }
        else if (etype == 2){
            enemies.add(new Boss());
        }
        times.add(new Long(time));
        spawners.add(new Integer(spawner));
    }

}

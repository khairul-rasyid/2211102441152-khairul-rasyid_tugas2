import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean alive = true;
    boolean across = false;
    boolean addscore = false;
    public void act()
    {   
        dead();
        if(!addscore && across && alive){
            Score.add(1);
        }
        addscore = across;
    }
    public abstract class Behavior{
        public abstract void location();
        public abstract void jump();
    }
    public void dead(){
        if(Touching() || isAtEdge()){
            getWorld().addObject(new Game_over(), 500, 250);
            getWorld().removeObject(this);
        }
    }
    public boolean Touching(){
        across = false;
        for(Pipe pipe : getWorld().getObjects(Pipe.class)){
            if(Math.abs(pipe.getX() - getX()) < 70 ){
                if(Math.abs(pipe.getY() + 30 - getY()) > 60){
                    alive = false;
                }
                across = true;
            }
        }
        return !alive;
    }
}


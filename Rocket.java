import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Player
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocket(){
        this.getImage().scale(80,40);
    }
    public class Rk extends Behavior{
        public void location(){
            int gravity = 4;
            setLocation(getX(), getY() + gravity);
        }
        public void jump(){
            if(Greenfoot.isKeyDown("space")){
                setLocation(getX(), getY()-12);
                Greenfoot.playSound("rocket.mp3");
            }
        }
    }
    Rk rk = new Rk();
    public void act()
    {
        rk.jump();
        rk.location();
        super.act();
    }
}

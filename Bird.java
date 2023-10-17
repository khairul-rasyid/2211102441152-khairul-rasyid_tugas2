import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Player
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bird(){
        this.setImage(new GreenfootImage("1.png"));
        this.getImage().scale(75,75);
    }
    int nomor = 1;
    int delay = 7;
    void animate(){
        if(delay < 7){
            delay++;
            return;
        }
        delay = 0;
        if(nomor == 4){
            nomor = 1;
        } else{
            nomor++;
        }
        this.setImage(new GreenfootImage(nomor+".png"));
        getImage().scale(75,75);
    }
    public class Brd extends Behavior{
        public void location(){
            int gravity = 2;
            setLocation(getX(), getY() + gravity);
        }
        public void jump(){
            if(Greenfoot.isKeyDown("space")){
                setLocation(getX(), getY()-6);
                Greenfoot.playSound("bird.mp3");
            }
        }
    }
    Brd brd = new Brd();
    public void act()
    {
        animate();
        brd.jump();
        brd.location();
        super.act();
    }
}

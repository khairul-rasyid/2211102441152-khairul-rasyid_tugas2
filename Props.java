import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class props here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Props extends Actor
{
    /**
     * Act - do whatever the props wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if(getX() <= 0){
            this.setLocation(getX() + 1000, Greenfoot.getRandomNumber(300) + 40);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Props
{
    /**
     * Act - do whatever the awan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Cloud(){
        this.getImage().scale(250,110);
    }
    public void act()
    {
        this.setLocation(getX() - 1, getY());
        super.act();
    }
}

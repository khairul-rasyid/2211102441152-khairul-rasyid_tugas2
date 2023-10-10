import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pipa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe extends Props
{
    /**
     * Act - do whatever the pipa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pipe(){
        this.getImage().scale(100,1100);
    }
    public void act()
    {
        this.setLocation(getX() - 2, getY());
        super.act();
    }
}

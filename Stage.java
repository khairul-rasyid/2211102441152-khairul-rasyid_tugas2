import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1);
        setPaintOrder(Game_over.class, Pipe.class, Bird.class, Rocket.class, Cloud.class); 
        
        //addObject(new Bird(), 150, 250);
        addObject(new Rocket(), 150, 300);
        
        addObject(new Cloud(), 800, 250);
        addObject(new Cloud(), 123, 74);
        addObject(new Cloud(), 282, 162);
        addObject(new Cloud(), 500, 331);
        addObject(new Cloud(), 182, 410);
        addObject(new Cloud(), 900, 460);
        addObject(new Cloud(), 730, 100);
        
        addObject(new Pipe(), 300, 250);
        addObject(new Pipe(), 650, 190);
        addObject(new Pipe(), 950, 320);
        
        addObject(new Score(), 500, 100);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Props
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;
    public Score(){
        score = 0;
    }
    public static void add(int n){
        score += n;
    }
    public void act()
    {
        World wrld = getWorld();
        wrld.showText(String.valueOf(score), 500, 100);
    }
}

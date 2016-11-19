import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    int score;
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void turnAtEdge() 
    {
       if (isAtEdge() ){
            turn(17);
       }    
    }
    public void randomTurn() {
         if ( Greenfoot.getRandomNumber(100) < 10 ) {
            turn(4);
       }
    }
    public void move() {
        move(5);
    }
       
   
}

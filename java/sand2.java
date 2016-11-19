import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sand2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sand2 extends World
{
    int score = 0;
    
   
    /**
     * Constructor for objects of class sand2.
     * 
     */
    public sand2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Text();
        worm();
        addObject(new turtle(), Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(400));
        addObject(new crab(), Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(400));
     
    }
    public void worm(){
        for(int i = 0; i<20; i++){
            addObject(new worm(), Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(400));
            
        }
    }
    public void Text(){
       showText("score : "+ score , 60, 30);
    }
}

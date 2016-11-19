import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobster extends Animal
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static final String fail = "실패";
    public void act() 
    { 
      turnAtEdge();
      randomTurn();
      lookForCrab();
      move();
      
    }
    public void lookForCrab(){
        if ( isTouching(crab.class) ){
            World w = getWorld();
            Greenfoot gf = new Greenfoot();
            removeTouching(crab.class);
            w.showText(fail,300,250);
            gf.stop();
            w.stopped();
        }
    } 
    
    }


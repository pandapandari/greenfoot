import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends lobster implements Freezable
{
    int counter ;
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public turtle() {
        counter = 100;
      
    }

   
    public void act()
    {
        if ( counter <= 0)
            {
                move();
                turnAtEdge() ;
                randomTurn();
                counter--;
            }
        else
            counter--;
        
        if(counter == -100)
        {
            counter = 100;
        }
        lookForLobster();
    }
    public void freeze(int count) {
        counter = count;
    }
    public void lookForLobster(){
        if ( isTouching(lobster.class) ){
            removeTouching(lobster.class);
        }
    }
}

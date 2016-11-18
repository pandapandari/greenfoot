import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab extends Animal
{
    int i = 0;
    int score;
    /**
     * Act - do whatever the crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      move();
      lookForWorm();
      turnAtEdge();
      randomTurn();
      Add();
      z();
    }
    public void z()
    {
        if(Greenfoot.isKeyDown("right"))
        turn(4);
    }
    public void Add(){
        if (score == 100){
           for(; i < 1;i++){
            getWorld().addObject(new lobster(), 100, 200);
        }
        }
        else if (score == 200){
        	for(; i < 1;i++){
            getWorld().addObject(new lobster(), 100, 200);
        }
        }
        else if (score == 300){
        	for(; i < 1;i++){
            getWorld().addObject(new lobster(), 100, 200);
        }
        }

    }
    public void lookForWorm(){
        if ( isTouching(worm.class) ){
           World w = getWorld();
           removeTouching(worm.class);
          
           w.showText("score : "+ score , 60, 30);
        }
     }
}

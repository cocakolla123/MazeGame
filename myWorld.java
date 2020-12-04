import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class myWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myWorld extends World
{
    public static wall w1 = new wall();
    public static wallTwo w2 = new wallTwo();
    public static user player = new user();
    public static Exit exit = new Exit();
    public static question q = new question();
    

    /**
     * Constructor for objects of class myWorld.
     * 
     */
    
    public myWorld()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        // adding walls, cherries, player, and the exit to the maze
        addObject(new wallTwo(), 126, 436);
        addObject(new wallTwo(), 126, 611);
        addObject(new wallTwo(), 454, 619);
        addObject(new wallTwo(), 353, 237);
        addObject(new wallTwo(), 235, 189);
        addObject(new wallTwo(), 454, 676);
        addObject(new wallTwo(), 126, 274);
        addObject(new wallTwo(), 21, 83);
        addObject(new wallTwo(), 1090, 24);
        addObject(new wallTwo(), 596, 614);
        addObject(new wallTwo(), 967, 215);
        addObject(new wallTwo(), 771, 88);
        addObject(new wallTwo(), 967, 366);
        addObject(new wallTwo(), 1090, 276);
        addObject(new wallTwo(), 1090, 444);
        addObject(new wallTwo(), 850, 265);
        addObject(new wallTwo(), 233, 612);
        addObject(new wallTwo(), 233, 711);
        addObject(new wallTwo(), 342, 543);
        addObject(new wallTwo(), 342, 599);
        addObject(new wallTwo(), 596, 543);
        addObject(new wall(), 292, 436);
        addObject(new wall(), 562, 306);
        addObject(new wall(), 319, 82);
        addObject(new wall(), 762, 435);
        addObject(new wall(), 436, 781);
        addObject(new wall(), 935, 781);
        addObject(new wall(), 1134, 654);
        addObject(new wall(), 1070, 18);
        addObject(new wall(), 968, 18);
        addObject(new wall(), 1012, 539);
        addObject(new wall(), 902, 539);
        addObject(new wall(), 604, 82);
        addObject(new wall(), 647, 196);
        addObject(new wall(), 562, 306);
        addObject(new wall(), 663, 650);
        addObject(new question(), 183, 379);
        addObject(new question(), 421, 244);
        addObject(new question(), 783, 377);
        addObject(new question(), 523, 581);
        addObject(new question(), 526, 714);
        addObject(new question(), 1158, 482);
        addObject(new Exit(), 1162, 737);
        addObject(player, 50, 750);
    }
    
   
  
    
   
}

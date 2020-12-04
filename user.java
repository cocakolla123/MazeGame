import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.* ;
//import java.util.List; 
//import java.util.ArrayList;
/**
 * Write a description of class user here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class user extends Actor
{
        // set the speed of the player
        int personVal = 5; 
        // count of how many questins are correct
        int count = 0; 
        // initializing questions arraylist
        ArrayList<String> questions = new ArrayList<String>();  
        // initializing answers arraylist 
        ArrayList<String> answers = new ArrayList<String>();
        

    /**
     * Act - do whatever the user wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    // adding all the questions and answers to the arraylists
    protected user() {
        questions.add( "What is Earth's largest continent?" );
        questions.add( "What razor-thin country accounts for more than half of the western coastline of South America?" );
        questions.add( "What river runs through Baghdad?" );
        questions.add("What country has the most natural lakes?");
        questions.add("What is the only sea without any coasts?");
        questions.add("Is Washington D.C. a state?");
        questions.add("What African country served as the setting for Tatooine in Star Wars?");
        questions.add("Which African nation has the most pyramids? (Not Egypt)");
        questions.add("What is the next prime number after 7?");
        questions.add("How many sides does a nonagon have?");
        questions.add("What is the top number on a fraction called?");
        questions.add("What is the periodic symbol for gold?");
        questions.add("What is the hottest planet in the solar system?");
        questions.add("Does sound travel faster in water or air?");
        questions.add("What is the only metal that is liquid at room temperature?");
        questions.add("What is the age of the sun?");
        answers.add("Asia");
        answers.add("Chile");
        answers.add("Tigris");
        answers.add("Canada");
        answers.add("Sargasso Sea");
        answers.add("no");
        answers.add("Tunisia");
        answers.add("Sudan");
        answers.add("11");
        answers.add("9");
        answers.add("numerator");
        answers.add("Au");
        answers.add("Venus");
        answers.add("Water");
        answers.add("Mercury");
        answers.add("5 billion years");
        
    }
    public void act() 
    {
        
   // making arrow keys control direction of the user
    if (Greenfoot.isKeyDown("left")) {
        if (!checkForOtherWall('l')) {
            setLocation(getX() - personVal, getY());
        }
    }
    if (Greenfoot.isKeyDown("right")) {
        if (!checkForOtherWall('r')) {
            setLocation(getX() + personVal, getY());
        }
    }
    if (Greenfoot.isKeyDown("up")) {
        if (!checkForOtherWall('u')) {
            setLocation(getX(), getY() - personVal);
        }
    }
    if (Greenfoot.isKeyDown("down")) {
        if (!checkForOtherWall('d')) {
            setLocation(getX(), getY() + personVal);
        }
    }
    
    if (getX() == 50) {
        setImage(new GreenfootImage("images/ppl1.png"));
    }
    cherryTouch(); // calling cherryTouch functions
    exit(); // calling exit function
    
}
    
    public boolean checkForOtherWall(char dir) {
        wall w = null;
        wallTwo w2 = null;
        // checks for wall in the left direction
        if (dir == 'l') {
            w2 = (wallTwo) getOneObjectAtOffset(-personVal, 0, wallTwo.class);
            w = (wall) getOneObjectAtOffset(-personVal, 0, wall.class);
        }
        // checks for wall in the right direction
        if (dir == 'r') {
            w2 = (wallTwo) getOneObjectAtOffset(personVal, 0, wallTwo.class);
            w = (wall) getOneObjectAtOffset(personVal, 0, wall.class);
        }
        // checks for wall in the down direction
        if (dir == 'd') {
            w = (wall) getOneObjectAtOffset(0, personVal, wall.class);
            w2 = (wallTwo) getOneObjectAtOffset(0, personVal, wallTwo.class);
        }
        // checks for wall in the up direction
        if (dir == 'u') {
            w = (wall) getOneObjectAtOffset(0,-personVal , wall.class);
            w2 = (wallTwo) getOneObjectAtOffset(0,-personVal , wallTwo.class);
        }
        // if there is a wall return true otherwise return false
        if (w != null || w2 != null) {
            return true;
        } 
            
        return false;
        
    }
    
    public void cherryTouch() {
       // getting every time the user touches a cherry
       question c = (question) getOneIntersectingObject(question.class); 
       // selecting a random question from the arraylist
       int rand = Greenfoot.getRandomNumber(questions.size());
       if (c != null) {
           // prompting the user to answer the question
           String q = Greenfoot.ask(questions.get(rand)).toLowerCase();
           // checking if the answer is correct
           if (q.contains(answers.get(rand).toLowerCase())) {
               // if the answer is correct it removes the cherry
               getWorld().removeObject(c);
               // removes the question and answer from the list
               questions.remove(rand);
               answers.remove(rand);
               // adds one to the count
               count ++;
            } else {
                // if its wrong, the game restarts
                Greenfoot.setWorld(new myWorld());
            }
           
        }
    

    }
    
    
    
    public void exit()  {
        // checks if it is toucvhing the exit 
        Exit exit = (Exit) getOneIntersectingObject(Exit.class);
        // checks if all the cherries are answered and the player is at the end of the maze
        if (exit != null && count == 6) {
            // opens a pop up of a you win picture at the middle of the screen
            setImage(new GreenfootImage("you-win-lettering-pop-art-text-banner_185004-60.jpg"));
            setLocation(612, 404);
            
        }
        
    }
}






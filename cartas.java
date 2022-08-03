import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cartas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cartas extends World
{

    /**
     * Constructor for objects of class cartas.
     * 
     */
    public cartas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }
    int score=Granjero.score;
    public void act(){
        showText("Monedas: "+score,65,15);
      
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        cartafresa cartafresa = new cartafresa();
        addObject(cartafresa,250,250);
        right right = new right();
        addObject(right,468,283);
        right.setLocation(465,265);
        right.setLocation(250,16);
    }
}

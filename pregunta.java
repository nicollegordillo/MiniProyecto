import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pregunta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pregunta extends World
{

    /**
     * Constructor for objects of class pregunta.
     * 
     */
    public pregunta()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        flecha flecha = new flecha();
        addObject(flecha,496,158);
        flecha.setLocation(431,324);
    }
    
}

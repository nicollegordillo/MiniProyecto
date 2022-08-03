import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finalfinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finalfinal extends World
{

    /**
     * Constructor for objects of class finalfinal.
     * 
     */
    public finalfinal()
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
        tarjeta tarjeta = new tarjeta();
        addObject(tarjeta,267,247);
        tarjeta.setLocation(250,250);
        
        
    }
}

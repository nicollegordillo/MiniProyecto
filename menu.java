import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    GreenfootSound bgmusic = new GreenfootSound("miniproyecto2.mp3");
    public menu()
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
        jugar jugar = new jugar();
        addObject(jugar,290,163);
        jugar.setLocation(261,163);
    }
    public void act(){
        bgmusic.playLoop();
    }
}

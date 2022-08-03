import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel32 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel32 extends World
{

    /**
     * Constructor for objects of class nivel32.
     * 
     */
    public nivel32()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act(){
        if ((getObjects(cabra1.class).size() == 0)&&(getObjects(cabra2.class).size() == 0)){
            addObject(new milk(), 250, 250);
            //agarrar3();
        }
    }
    private void prepare()
    {
        cabra1 cabra1 = new cabra1();
        addObject(cabra1,362,124);
        cabra1 cabra12 = new cabra1();
        addObject(cabra12,244,120);
        cabra1 cabra13 = new cabra1();
        addObject(cabra13,394,223);
        cabra2 cabra2 = new cabra2();
        addObject(cabra2,164,219);
        cabra2 cabra22 = new cabra2();
        addObject(cabra22,284,295);
        cabra2 cabra23 = new cabra2();
        addObject(cabra23,353,275);
        cabra2 cabra24 = new cabra2();
        addObject(cabra24,171,300);
        cabra23.setLocation(376,295);
        cabra2 cabra25 = new cabra2();
        addObject(cabra25,376,295);
        cabra23.setLocation(432,441);
        cabra22.setLocation(253,260);
        cabra12.setLocation(63,63);
        cabra12.setLocation(54,249);
        cabra2.setLocation(42,58);
        cabra22.setLocation(442,48);
        cabra23.setLocation(244,175);
        cabra24.setLocation(79,442);
        cabra12.setLocation(183,59);
        cabra1.setLocation(266,44);
        cabra13.setLocation(360,53);
        Granjero granjero = new Granjero();
        addObject(granjero,253,278);
        granjero.setLocation(249,350);
        cabra25.setLocation(439,450);
    }
}

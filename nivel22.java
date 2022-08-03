import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel22 extends World
{

    /**
     * Constructor for objects of class nivel22.
     * 
     */
    public nivel22()
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
        if ((getObjects(piña1.class).size() == 0)&&(getObjects(piña2.class).size() == 0)){
            addObject(new pinapple(), 250, 250);
            //agarrar3();
        }
    }
    private void prepare()
    {
        piña1 piña1 = new piña1();
        addObject(piña1,356,311);
        piña1 piña12 = new piña1();
        addObject(piña12,202,247);
        piña1 piña13 = new piña1();
        addObject(piña13,281,100);
        piña1 piña14 = new piña1();
        addObject(piña14,240,379);
        piña1 piña15 = new piña1();
        addObject(piña15,430,275);
        piña2 piña2 = new piña2();
        addObject(piña2,410,199);
        piña2 piña22 = new piña2();
        addObject(piña22,388,365);
        piña2 piña23 = new piña2();
        addObject(piña23,133,120);
        piña23.setLocation(53,294);
        piña13.setLocation(141,119);
        piña12.setLocation(228,52);
        piña14.setLocation(321,115);
        piña1.setLocation(172,432);
        piña15.setLocation(302,447);
        piña1.setLocation(197,454);
        piña14.setLocation(342,101);
        piña12.setLocation(248,56);
        piña22.setLocation(400,359);
        piña22.setLocation(463,440);
        piña2.setLocation(444,57);
        piña23.setLocation(52,255);
        Granjero granjero = new Granjero();
        addObject(granjero,447,176);
        granjero.setLocation(436,253);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel3 extends World
{

    /**
     * Constructor for objects of class nivel3.
     * 
     */
    public nivel3()
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
        if ((getObjects(pollo1.class).size() == 0)&&(getObjects(pollo2.class).size() == 0)){
            addObject(new chicken(), 250, 250);
            //agarrar3();
        }
    }
    private void prepare()
    {
        pollo1 pollo1 = new pollo1();
        addObject(pollo1,112,214);
        pollo1 pollo12 = new pollo1();
        addObject(pollo12,300,145);
        pollo1 pollo13 = new pollo1();
        addObject(pollo13,424,206);
        pollo1 pollo14 = new pollo1();
        addObject(pollo14,324,252);
        pollo1.setLocation(146,251);
        pollo1 pollo15 = new pollo1();
        addObject(pollo15,146,251);
        pollo1 pollo16 = new pollo1();
        addObject(pollo16,397,267);
        pollo2 pollo2 = new pollo2();
        addObject(pollo2,282,339);
        pollo2 pollo22 = new pollo2();
        addObject(pollo22,406,365);
        pollo2 pollo23 = new pollo2();
        addObject(pollo23,182,355);
        pollo12.setLocation(108,103);
        pollo1.setLocation(228,79);
        pollo13.setLocation(323,94);
        pollo1.setLocation(229,45);
        pollo13.setLocation(379,118);
        pollo1.setLocation(255,32);
        pollo15.setLocation(121,372);
        pollo23.setLocation(232,427);
        pollo14.setLocation(41,220);
        pollo22.setLocation(382,360);
        pollo22.setLocation(364,364);
        pollo16.setLocation(440,58);
        pollo2.setLocation(262,135);
        pollo14.setLocation(55,62);
        pollo2.setLocation(274,188);
        Granjero granjero = new Granjero();
        addObject(granjero,274,188);
        granjero.setLocation(246,287);
    }
}

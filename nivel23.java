import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel23 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel23 extends World
{

    /**
     * Constructor for objects of class nivel23.
     * 
     */
    public nivel23()
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
        if ((getObjects(cebolla1.class).size() == 0)&&(getObjects(cebolla2.class).size() == 0)){
            addObject(new onion(), 250, 250);
            //agarrar3();
        }
    }
    private void prepare()
    {
        cebolla1 cebolla1 = new cebolla1();
        addObject(cebolla1,354,283);
        cebolla1.setLocation(388,239);
        cebolla1 cebolla12 = new cebolla1();
        addObject(cebolla12,146,194);
        cebolla1 cebolla13 = new cebolla1();
        addObject(cebolla13,366,105);
        cebolla13.setLocation(401,92);
        cebolla2 cebolla2 = new cebolla2();
        addObject(cebolla2,248,92);
        cebolla2.setLocation(249,81);
        cebolla2 cebolla22 = new cebolla2();
        addObject(cebolla22,97,77);
        cebolla2 cebolla23 = new cebolla2();
        addObject(cebolla23,363,327);
        cebolla2 cebolla24 = new cebolla2();
        addObject(cebolla24,77,367);
        cebolla24.setLocation(47,450);
        cebolla22.setLocation(54,56);
        cebolla23.setLocation(463,444);
        cebolla13.setLocation(240,383);
        cebolla12.setLocation(80,172);
        cebolla2.setLocation(428,75);
        cebolla2 cebolla25 = new cebolla2();
        addObject(cebolla25,251,202);
        cebolla25.setLocation(208,135);
        cebolla25.setLocation(229,139);
        cebolla13.setLocation(255,32);
        cebolla12.setLocation(131,147);
        cebolla1.setLocation(367,152);
        Granjero granjero = new Granjero();
        addObject(granjero,237,295);
    }
}

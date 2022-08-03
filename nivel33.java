import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel33 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel33 extends World
{

    /**
     * Constructor for objects of class nivel33.
     * 
     */
    public nivel33()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }
    public void act(){
        if ((getObjects(vaca1.class).size() == 0)&&(getObjects(vaca2.class).size() == 0)){
            addObject(new meat(), 250, 250);
            //agarrar3();
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        vaca1 vaca1 = new vaca1();
        addObject(vaca1,316,225);
        vaca1 vaca12 = new vaca1();
        addObject(vaca12,249,284);
        vaca1 vaca13 = new vaca1();
        addObject(vaca13,368,73);
        vaca1 vaca14 = new vaca1();
        addObject(vaca14,193,106);
        vaca1 vaca15 = new vaca1();
        addObject(vaca15,416,339);
        vaca15.setLocation(465,345);
        vaca1 vaca16 = new vaca1();
        addObject(vaca16,437,136);
        vaca2 vaca2 = new vaca2();
        addObject(vaca2,180,312);
        vaca2 vaca22 = new vaca2();
        addObject(vaca22,336,385);
        vaca2 vaca23 = new vaca2();
        addObject(vaca23,150,163);
        vaca23.setLocation(259,445);
        vaca2.setLocation(123,403);
        vaca23.setLocation(293,439);
        vaca23.setLocation(232,439);
        vaca22.setLocation(368,391);
        vaca14.setLocation(104,125);
        vaca13.setLocation(157,80);
        vaca1.setLocation(278,71);
        vaca12.setLocation(346,164);
        vaca16.setLocation(344,289);
        vaca12.setLocation(414,157);
        vaca1.setLocation(310,61);
        vaca13.setLocation(181,85);
        vaca16.setLocation(73,307);
        vaca15.setLocation(442,320);
        Granjero granjero = new Granjero();
        addObject(granjero,244,175);
        granjero.setLocation(251,250);
    }
}

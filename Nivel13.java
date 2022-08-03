import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel13 extends World
{

    /**
     * Constructor for objects of class Nivel13.
     * 
     */
    public Nivel13()
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
        if ((getObjects(zanahoria1.class).size() == 0)&&(getObjects(zanahoria2.class).size() == 0)){
            addObject(new carrot(), 250, 250);
            //agarrar3();
        }
    }
    private void prepare()
    {
        zanahoria1 zanahoria1 = new zanahoria1();
        addObject(zanahoria1,336,278);
        zanahoria1 zanahoria12 = new zanahoria1();
        addObject(zanahoria12,182,234);
        zanahoria1 zanahoria13 = new zanahoria1();
        addObject(zanahoria13,394,155);
        zanahoria1 zanahoria14 = new zanahoria1();
        addObject(zanahoria14,140,303);
        zanahoria12.setLocation(228,95);
        zanahoria14.setLocation(69,239);
        zanahoria1.setLocation(255,452);
        zanahoria13.setLocation(420,238);
        Granjero granjero = new Granjero();
        addObject(granjero,239,205);
        granjero.setLocation(243,236);
        zanahoria2 zanahoria2 = new zanahoria2();
        addObject(zanahoria2,395,323);
        zanahoria2 zanahoria22 = new zanahoria2();
        addObject(zanahoria22,408,179);
        zanahoria22.setLocation(360,181);
        zanahoria2 zanahoria23 = new zanahoria2();
        addObject(zanahoria23,360,181);
        zanahoria2.setLocation(364,290);
        zanahoria2 zanahoria24 = new zanahoria2();
        addObject(zanahoria24,364,290);
        zanahoria2 zanahoria25 = new zanahoria2();
        addObject(zanahoria25,137,173);
        zanahoria2 zanahoria26 = new zanahoria2();
        addObject(zanahoria26,123,300);
        zanahoria26.setLocation(154,419);
        zanahoria25.setLocation(19,56);
        zanahoria23.setLocation(454,51);
        zanahoria2.setLocation(503,457);
        zanahoria26.setLocation(198,449);
        zanahoria26.setLocation(35,438);
        zanahoria22.setLocation(335,86);
        zanahoria2.setLocation(154,387);
        zanahoria24.setLocation(442,393);
    }
}

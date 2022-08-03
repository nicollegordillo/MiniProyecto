import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel2 extends World
{

    /**
     * Constructor for objects of class nivel2.
     * 
     */
    public nivel2()
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
        if ((getObjects(maiz.class).size() == 0)&&(getObjects(maiz2.class).size() == 0)){
            addObject(new elote(), 250, 250);
            //agarrar3();
        }
    }
    private void prepare()
    {
        maiz maiz = new maiz();
        addObject(maiz,422,77);
        maiz maiz2 = new maiz();
        addObject(maiz2,273,189);
        maiz maiz3 = new maiz();
        addObject(maiz3,383,201);
        maiz2.setLocation(80,50);
        maiz3.setLocation(231,187);
        maiz3.setLocation(268,191);
        maiz.setLocation(429,55);
        maiz2 maiz22 = new maiz2();
        addObject(maiz22,422,231);
        maiz2 maiz23 = new maiz2();
        addObject(maiz23,278,287);
        maiz2 maiz24 = new maiz2();
        addObject(maiz24,123,179);
        maiz2 maiz25 = new maiz2();
        addObject(maiz25,380,111);
        maiz2 maiz26 = new maiz2();
        addObject(maiz26,406,373);
        maiz2 maiz27 = new maiz2();
        addObject(maiz27,110,323);
        maiz25.setLocation(185,34);
        maiz22.setLocation(459,163);
        maiz26.setLocation(457,439);
        maiz27.setLocation(32,461);
        maiz24.setLocation(50,227);
        maiz22.setLocation(451,232);
        maiz23.setLocation(374,63);
        Granjero granjero = new Granjero();
        addObject(granjero,238,356);
        granjero.setLocation(260,438);
        granjero.setLocation(252,441);
    }
}

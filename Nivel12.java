import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel12 extends World
{

    /**
     * Constructor for objects of class Nivel12.
     * 
     */
    public Nivel12()
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
        if ((getObjects(manzana1.class).size() == 0)&&(getObjects(manzana2.class).size() == 0)){
            addObject(new pie(), 250, 250);
            //agarrar3();
        }
    }
    private void prepare()
    {
        manzana2 manzana2 = new manzana2();
        addObject(manzana2,358,279);
        manzana2 manzana22 = new manzana2();
        addObject(manzana22,204,265);
        manzana2 manzana23 = new manzana2();
        addObject(manzana23,235,112);
        manzana1 manzana1 = new manzana1();
        addObject(manzana1,292,324);
        manzana1 manzana12 = new manzana1();
        addObject(manzana12,315,122);
        manzana1 manzana13 = new manzana1();
        addObject(manzana13,390,354);
        manzana1 manzana14 = new manzana1();
        addObject(manzana14,134,186);
        manzana12.setLocation(463,159);
        manzana23.setLocation(288,50);
        manzana14.setLocation(143,368);
        manzana22.setLocation(55,156);
        manzana12.setLocation(234,241);
        manzana2.setLocation(430,167);
        manzana23.setLocation(267,68);
        manzana12.setLocation(79,35);
        manzana1.setLocation(416,40);
        manzana13.setLocation(457,432);
        manzana14.setLocation(68,423);
        Granjero granjero = new Granjero();
        addObject(granjero,219,209);
        granjero.setLocation(252,319);
    }
}

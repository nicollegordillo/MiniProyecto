import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        //bgmusic.playLoop();
        prepare();
    }
    
      
    //GreenfootSound bgmusic = new GreenfootSound("miniproyecto2.mp3");
    public void act(){
        if ((getObjects(Fresa1.class).size() == 0)&&(getObjects(Fresa2.class).size() == 0)){
            addObject(new jam(), 250, 250);
            //agarrar3();
            
        }
        //bgmusic.playLoop();
        //started();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fresa1 fresa1 = new Fresa1();
        addObject(fresa1,144,108);
        fresa1.setLocation(89,41);
        Fresa1 fresa12 = new Fresa1();
        addObject(fresa12,366,197);
        fresa12.setLocation(412,187);
        Fresa1 fresa13 = new Fresa1();
        addObject(fresa13,143,228);
        Fresa1 fresa14 = new Fresa1();
        addObject(fresa14,352,71);
        Fresa2 fresa2 = new Fresa2();
        addObject(fresa2,305,302);
        Fresa2 fresa22 = new Fresa2();
        addObject(fresa22,224,128);
        Fresa2 fresa23 = new Fresa2();
        addObject(fresa23,154,332);
        fresa2.setLocation(360,363);
        Fresa2 fresa24 = new Fresa2();
        addObject(fresa24,360,363);
        fresa2.setLocation(420,387);
        fresa2.setLocation(228,368);
        Fresa2 fresa25 = new Fresa2();
        addObject(fresa25,228,368);
        fresa2.setLocation(274,416);
        fresa14.setLocation(351,51);
        fresa1.setLocation(71,49);
        fresa14.setLocation(344,62);
        fresa22.setLocation(179,69);
        fresa13.setLocation(90,186);
        fresa2.setLocation(259,158);
        fresa23.setLocation(143,328);
        fresa25.setLocation(300,243);
        fresa24.setLocation(391,321);
        Granjero granjero = new Granjero();
        addObject(granjero,227,263);
        granjero.setLocation(237,431);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finalscene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finalscene extends World
{

    /**
     * Constructor for objects of class finalscene.
     * 
     */
    public void act(){
        if ((getObjects(oso.class).size() == 0)&&(getObjects(vaca1.class).size() == 0)&&(getObjects(Fresa1.class).size() == 0)&&(getObjects(piña1.class).size() == 0)&&(getObjects(maiz2.class).size() == 0)&&(getObjects(cabra2.class).size() == 0)&&(getObjects(pollo2.class).size() == 0)){
            
            addObject(new carneoso(), 250, 250);
            //agarrar3();
        }
    }

    public finalscene()
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
        oso oso = new oso();
        addObject(oso,258,182);
        oso.setLocation(258,70);
        oso.setLocation(272,63);
        vaca1 vaca1 = new vaca1();
        addObject(vaca1,228,161);
        vaca1 vaca12 = new vaca1();
        addObject(vaca12,361,126);
        vaca1 vaca13 = new vaca1();
        addObject(vaca13,91,60);
        vaca1 vaca14 = new vaca1();
        addObject(vaca14,419,17);
        vaca14.setLocation(414,36);
        piña1 piña1 = new piña1();
        addObject(piña1,140,167);
        piña1.setLocation(66,159);
        piña1 piña12 = new piña1();
        addObject(piña12,438,158);
        piña12.setLocation(448,184);
        Fresa1 fresa1 = new Fresa1();
        addObject(fresa1,271,263);
        fresa1.setLocation(140,232);
        Fresa1 fresa12 = new Fresa1();
        addObject(fresa12,340,204);
        fresa12.setLocation(348,207);
        cabra2 cabra2 = new cabra2();
        addObject(cabra2,395,374);
        cabra2.setLocation(442,450);
        cabra2 cabra22 = new cabra2();
        addObject(cabra22,170,381);
        cabra22.setLocation(68,446);
        vaca13.setLocation(131,87);
        maiz2 maiz2 = new maiz2();
        addObject(maiz2,131,87);
        vaca13.setLocation(176,100);
        maiz2 maiz22 = new maiz2();
        addObject(maiz22,328,47);
        maiz22.setLocation(344,63);
        pollo1 pollo1 = new pollo1();
        addObject(pollo1,287,366);
        pollo1.setLocation(251,448);
        pollo1.setLocation(260,421);
        pollo1.setLocation(252,433);
        pollo1.setLocation(252,433);
        pollo1.setLocation(215,437);
        removeObject(pollo1);
        pollo2 pollo2 = new pollo2();
        addObject(pollo2,279,365);
        pollo2.setLocation(265,437);
        Granjero granjero = new Granjero();
        addObject(granjero,280,261);
        granjero.setLocation(255,324);
        vaca13.setLocation(104,43);
        vaca13.setLocation(157,91);
        maiz2.setLocation(153,94);
        vaca13.setLocation(119,106);
        vaca13.setLocation(108,47);
        maiz2.setLocation(132,126);
        vaca12.setLocation(350,143);
        maiz22.setLocation(362,81);
        maiz2.setLocation(44,39);
        vaca13.setLocation(135,88);
        maiz2.setLocation(55,44);
        fresa1.setLocation(131,188);
    }
}

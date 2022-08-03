import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cartacebolla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cartacebolla extends Actor
{
    public cartacebolla(){
        GreenfootImage myimage =getImage();
        int mynewheight = 5*myimage.getHeight()/6;
        int mynewwidth = 5*myimage.getWidth()/6;
        myimage.scale(mynewwidth, mynewheight);
    }
    /**
     * Act - do whatever the cartacebolla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}

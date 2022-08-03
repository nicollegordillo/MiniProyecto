import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cabrabloqueada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cabrabloqueada extends Actor
{
    public cabrabloqueada(){
        GreenfootImage myimage =getImage();
        int mynewheight = 5*myimage.getHeight()/6;
        int mynewwidth = 5*myimage.getWidth()/6;
        myimage.scale(mynewwidth, mynewheight);
    }/**
     * Act - do whatever the cabrabloqueada wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}

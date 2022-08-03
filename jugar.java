import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugar extends Actor
{
    public jugar(){
        GreenfootImage myimage =getImage();
        int mynewheight = myimage.getHeight()/2;
        int mynewwidth = myimage.getWidth()/2;
        myimage.scale(mynewwidth, mynewheight);
    }
    /**
     * Act - do whatever the jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new cartas());
        }// Add your action code here.
    }
}

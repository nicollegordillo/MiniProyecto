import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tarjeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tarjeta extends Actor
{
    /**
     * Act - do whatever the tarjeta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Actor cfin = (Actor)getWorld().getObjects(cartafinal2.class).get(0);
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new menu());
        }
        // Add your action code here.
    }
}

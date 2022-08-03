import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flecha extends Actor
{
    public flecha(){
        GreenfootImage myimage =getImage();
        int mynewheight = myimage.getHeight()/6;
        int mynewwidth = myimage.getWidth()/6;
        myimage.scale(mynewwidth, mynewheight);
    }/**
     * Act - do whatever the flecha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //fresa
    SimpleTimer tiempo= new SimpleTimer();
    public void act()
    {
        Actor flechita= (Actor)getWorld().getObjects(flecha.class).get(0);
            //cartaelote ce = (cartaelote)getWorld().getObjects(cartaelote.class).get(0);
            if((Greenfoot.isKeyDown("enter"))&&(tiempo.millisElapsed()>500)){
                
                Greenfoot.setWorld(new cartas());
                
            }
        // Add your action code here.
    }
}

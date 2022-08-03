import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jam extends Actor
{
    
    public jam(){
        GreenfootImage myimage =getImage();
        int mynewheight = myimage.getHeight()/5;
        int mynewwidth = myimage.getWidth()/5;
        myimage.scale(mynewwidth, mynewheight);
    }/**
     * Act - do whatever the jam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Granjero g = (Granjero) getOneIntersectingObject(Granjero.class);
        
        if(g!= null){
            
            getWorld().removeObject(this);
            Greenfoot.setWorld(new cartas());
            
        }
        // Add your action code here.
    }
    
}

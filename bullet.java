import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    int moval =3;
    int Px = 0;
    int Py=0;
    public bullet(int px, int py){
    
        GreenfootImage myimage =getImage();
        int mynewheight = myimage.getHeight()/3;
        int mynewwidth = myimage.getWidth()/3;
        myimage.scale(mynewwidth, mynewheight);
        Py=py;
        Px=px;
        //turnTowards(Px,Py);
        
    }
    
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if (getWorld().getObjects(Granjero.class).size() == 0){
            turnTowards(this.getX(), this.getY());
        }
        else{
            move(moval);
            
        }
        
        // Add your action code here.
        Granjero g = (Granjero) getOneIntersectingObject(Granjero.class);
        if(g!= null){
            getWorld().removeObject(g);
            getWorld().removeObject(this);
            Greenfoot.setWorld(new pregunta());
            
        }
        else if (getY()>490){
            getWorld().removeObject(this);
        }
        else if (getY()<10){
            getWorld().removeObject(this);
        }
        else if (getX()>490){
            getWorld().removeObject(this);
        }
        else if (getX()<10){
            getWorld().removeObject(this);
        }
        
    }
    
    
    
    
    
    
}

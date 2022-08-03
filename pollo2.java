import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pollo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pollo2 extends Actor
{
    public pollo2(){
        GreenfootImage myimage =getImage();
        int mynewheight = myimage.getHeight()/5;
        int mynewwidth = myimage.getWidth()/5;
        myimage.scale(mynewwidth, mynewheight);
    }
    /**
     * Act - do whatever the pollo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        // Add your action code here.
    }
    public void moveAround(){
        move(6);
        if (Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth()-5){
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight()-5){
            turn(180);
        }
    }
}

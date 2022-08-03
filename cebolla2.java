import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cebolla2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cebolla2 extends Actor
{
    public cebolla2(){
        GreenfootImage myimage =getImage();
        int mynewheight = myimage.getHeight()/5;
        int mynewwidth = myimage.getWidth()/5;
        myimage.scale(mynewwidth, mynewheight);
    }
    /**
     * Act - do whatever the cebolla2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer shotTimer = new SimpleTimer();
    
    int minshotwait = 500;
    int shotgap= 7000;
    int ranshot = minshotwait + Greenfoot.getRandomNumber(shotgap);
    public void act()
    {
        if (shotTimer.millisElapsed()> (minshotwait + ranshot))
        {
            if (getWorld().getObjects(Granjero.class).size() == 0){
                turnTowards(this.getX(), this.getY());
            }
            else{
                Actor h = (Actor)getWorld().getObjects(Granjero.class).get(0);
                bullet bullet = new bullet(h.getX(),h.getY());
                getWorld().addObject(bullet, getX(), getY());
                bullet.turnTowards(h.getX(),h.getY());//maybe
                shotTimer.mark();
                ranshot = Greenfoot.getRandomNumber(shotgap);
            }
        // Add your action code here.
    }
    if (getWorld().getObjects(Granjero.class).size() == 0){
            turnTowards(this.getX(), this.getY());
        }
        else if (this.getX()<250){
            Actor g = (Actor)getWorld().getObjects(Granjero.class).get(0);
            turnTowards(g.getX(), g.getY());
            
        }
        else if (this.getX()>250){
            Actor g = (Actor)getWorld().getObjects(Granjero.class).get(0);
            int x = g.getX();
            int y = g.getY();
            turnTowards(x, y);
            
        }// Add your action code here.
    }
}

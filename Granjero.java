import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Granjero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granjero extends Actor
{
    public Granjero(){
        GreenfootImage myimage =getImage();
        int mynewheight = myimage.getHeight()/5;
        int mynewwidth = myimage.getWidth()/5;
        myimage.scale(mynewwidth, mynewheight);
    }
    /**
     * Act - do whatever the Granjero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score=0;
    //public static int score;
    //GreenfootSound bgmusic = new GreenfootSound("miniproyecto2.mp3");
    public void act()
    {
        
        //score=0;
        agarrar();
        agarrar2();
        
        agarrarpollo1();
        agarrarpollo2();
        
        agarrarcabra1();
        agarrarcabra2();
        
        agarrarvaca1();
        agarrarvaca2();
        
        agarrarzanahoria1();
        agarrarzanahoria2();
        
        agarrarcebolla1();
        agarrarcebolla2();
        
        agarrarmaiz();
        agarrarmaiz2();
        
        agarrarpiña1();
        agarrarpiña2();
        
        agarrarmanzana1();
        agarrarmanzana2();
        agarraroso();
        moveAndTurn();
            agarrar3();
            agarrarpollo3();
            agarrarvaca3();
            agarrarcabra3();
            agarrarcebolla3();
            agarrarzanahoria3();
            agarrarmaiz3();
            agarrarpiña3();
            agarrarmanzana3();
            agarraroso3();
        
        
        
    }
    
    public void moveAndTurn(){
        
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-6, getY()); // left
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+6, getY());
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-6); // up
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+6); // down
        }
    }
    public void agarraroso(){
        Actor oso;
        oso= getOneObjectAtOffset(0,0,oso.class);
        if (oso != null){
            World world;
            world =getWorld();
            world.removeObject(oso);
        }
    }
    //public static int score=0;
    public void agarraroso3(){
        //Actor jam;
        carneoso co = (carneoso) getOneIntersectingObject(carneoso.class);
        
        if(co!= null){
            score+=100;
            getWorld().removeObject(co);
            Greenfoot.setWorld(new finalfinal());
            
        }
    }
    public void agarrar(){
        Actor Fresa1;
        Fresa1= getOneObjectAtOffset(0,0,Fresa1.class);
        if (Fresa1 != null){
            World world;
            world =getWorld();
            world.removeObject(Fresa1);
        }
    }
    public void agarrar2(){
        Actor Fresa2;
        Fresa2= getOneObjectAtOffset(0,0,Fresa2.class);
        if (Fresa2 != null){
            World world;
            world =getWorld();
            world.removeObject(Fresa2);
        }
    }
    //public static int score=0;
    public void agarrar3(){
        //Actor jam;
        jam j = (jam) getOneIntersectingObject(jam.class);
        
        if(j!= null){
            score+=10;
            getWorld().removeObject(j);
            Greenfoot.setWorld(new cartas());
            
        }
    }
    //piña
    public void agarrarpiña1(){
        Actor piña1;
        piña1= getOneObjectAtOffset(0,0,piña1.class);
        if (piña1 != null){
            World world;
            world =getWorld();
            world.removeObject(piña1);
        }
    }
    public void agarrarpiña2(){
        Actor piña2;
        piña2= getOneObjectAtOffset(0,0,piña2.class);
        if (piña2 != null){
            World world;
            world =getWorld();
            world.removeObject(piña2);
        }
    }
    public void agarrarpiña3(){
        //Actor jam;
        pinapple p = (pinapple) getOneIntersectingObject(pinapple.class);
        //jam= getOneObjectAtOffset(0,0,jam.class);
        if(p!= null){
            score+=10;
            getWorld().removeObject(p);
            Greenfoot.setWorld(new cartas());
            
        }
    }
    //manzana
    public void agarrarmanzana1(){
        Actor manzana1;
        manzana1= getOneObjectAtOffset(0,0,manzana1.class);
        if (manzana1 != null){
            World world;
            world =getWorld();
            world.removeObject(manzana1);
        }
    }
    public void agarrarmanzana2(){
        Actor manzana2;
        manzana2= getOneObjectAtOffset(0,0,manzana2.class);
        if (manzana2 != null){
            World world;
            world =getWorld();
            world.removeObject(manzana2);
        }
    }
    public void agarrarmanzana3(){
        //Actor jam;
        pie pi = (pie) getOneIntersectingObject(pie.class);
        //jam= getOneObjectAtOffset(0,0,jam.class);
        if(pi!= null){
            score+=10;
            getWorld().removeObject(pi);
            Greenfoot.setWorld(new cartas());
            
        }
    }
    //cebolla
    public void agarrarcebolla1(){
        Actor cebolla1;
        cebolla1= getOneObjectAtOffset(0,0,cebolla1.class);
        if (cebolla1 != null){
            World world;
            world =getWorld();
            world.removeObject(cebolla1);
        }
    }
    public void agarrarcebolla2(){
        Actor cebolla2;
        cebolla2= getOneObjectAtOffset(0,0,cebolla2.class);
        if (cebolla2 != null){
            World world;
            world =getWorld();
            world.removeObject(cebolla2);
        }
    }
    public void agarrarcebolla3(){
        //Actor jam;
        onion o = (onion) getOneIntersectingObject(onion.class);
        //jam= getOneObjectAtOffset(0,0,jam.class);
        if(o!= null){
            score+=20;
            getWorld().removeObject(o);
            Greenfoot.setWorld(new cartas());
            
        }
    }
    //zanahoria
    public void agarrarzanahoria1(){
        Actor zanahoria1;
        zanahoria1= getOneObjectAtOffset(0,0,zanahoria1.class);
        if (zanahoria1 != null){
            World world;
            world =getWorld();
            world.removeObject(zanahoria1);
        }
    }
    public void agarrarzanahoria2(){
        Actor zanahoria2;
        zanahoria2= getOneObjectAtOffset(0,0,zanahoria2.class);
        if (zanahoria2 != null){
            World world;
            world =getWorld();
            world.removeObject(zanahoria2);
        }
    }
    public void agarrarzanahoria3(){
        //Actor jam;
    carrot ca = (carrot) getOneIntersectingObject(carrot.class);
        //jam= getOneObjectAtOffset(0,0,jam.class);
        if(ca!= null){
            score+=20;
            getWorld().removeObject(ca);
            Greenfoot.setWorld(new cartas());
            
        }
    }
    //elote
    public void agarrarmaiz(){
        Actor maiz;
        maiz= getOneObjectAtOffset(0,0,maiz.class);
        if (maiz != null){
            World world;
            world =getWorld();
            world.removeObject(maiz);
        }
    }
    public void agarrarmaiz2(){
        Actor maiz2;
        maiz2= getOneObjectAtOffset(0,0,maiz2.class);
        if (maiz2 != null){
            World world;
            world =getWorld();
            world.removeObject(maiz2);
        }
    }
    public void agarrarmaiz3(){
        //Actor jam;
    elote elo = (elote) getOneIntersectingObject(elote.class);
        //jam= getOneObjectAtOffset(0,0,jam.class);
        if(elo!= null){
            score+=20;
            getWorld().removeObject(elo);
            Greenfoot.setWorld(new cartas());
            
        }
    }
    //carne
    public void agarrarvaca1(){
        Actor vaca1;
        vaca1= getOneObjectAtOffset(0,0,vaca1.class);
        if (vaca1 != null){
            World world;
            world =getWorld();
            world.removeObject(vaca1);
        }
    }
    public void agarrarvaca2(){
        Actor vaca2;
        vaca2= getOneObjectAtOffset(0,0,vaca2.class);
        if (vaca2 != null){
            World world;
            world =getWorld();
            world.removeObject(vaca2);
        }
    }
    public void agarrarvaca3(){
        //Actor jam;
        meat m = (meat) getOneIntersectingObject(meat.class);
        //jam= getOneObjectAtOffset(0,0,jam.class);
        if(m!= null){
            score+=30;
            getWorld().removeObject(m);
            Greenfoot.setWorld(new cartas());
            
        }
    }
    //cabra
    public void agarrarcabra1(){
        Actor cabra1;
        cabra1= getOneObjectAtOffset(0,0,cabra1.class);
        if (cabra1 != null){
            World world;
            world =getWorld();
            world.removeObject(cabra1);
        }
    }
    public void agarrarcabra2(){
        Actor cabra2;
        cabra2= getOneObjectAtOffset(0,0,cabra2.class);
        if (cabra2 != null){
            World world;
            world =getWorld();
            world.removeObject(cabra2);
        }
    }
    public void agarrarcabra3(){
        //Actor jam;
        milk mi = (milk) getOneIntersectingObject(milk.class);
        //jam= getOneObjectAtOffset(0,0,jam.class);
        if(mi!= null){
            score+=30;
            getWorld().removeObject(mi);
            Greenfoot.setWorld(new cartas());
            
        }
    }
    //pollo
    public void agarrarpollo1(){
        Actor pollo1;
        pollo1= getOneObjectAtOffset(0,0,pollo1.class);
        if (pollo1 != null){
            World world;
            world =getWorld();
            world.removeObject(pollo1);
        }
    }
    public void agarrarpollo2(){
        Actor pollo2;
        pollo2= getOneObjectAtOffset(0,0,pollo2.class);
        if (pollo2 != null){
            World world;
            world =getWorld();
            world.removeObject(pollo2);
        }
    }
    public void agarrarpollo3(){
        //Actor jam;
        chicken chi = (chicken) getOneIntersectingObject(chicken.class);
        //jam= getOneObjectAtOffset(0,0,jam.class);
        if(chi!= null){
            score+=30;
            getWorld().removeObject(chi);
            Greenfoot.setWorld(new cartas());
            
        }
    }
}

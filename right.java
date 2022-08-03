import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class right here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class right extends Actor
{
    
    SimpleTimer tiempo= new SimpleTimer();/**
     * Act - do whatever the right wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score=Granjero.score;
    public void act()
    {
        if (!getWorld().getObjects(cartafinal2.class).isEmpty()){
            Actor cfin = (Actor)getWorld().getObjects(cartafinal2.class).get(0);
            //cartaelote ce = (cartaelote)getWorld().getObjects(cartaelote.class).get(0);
            if((cfin.getX()==250)&&(cfin.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cfin);
                getWorld().addObject(new cartafresa(),250,250);
                tiempo.mark();
            }
            else if((cfin.getX()==250)&&(cfin.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cfin);
                
                getWorld().addObject(new cartacarne(),250,250); 
                
                tiempo.mark();
            }
            else if((cfin.getX()==250)&&(cfin.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new finalscene());
            }
            

        }
        else if (!getWorld().getObjects(cartafinal.class).isEmpty()){
            Actor cfin = (Actor)getWorld().getObjects(cartafinal.class).get(0);
            //cartaelote ce = (cartaelote)getWorld().getObjects(cartaelote.class).get(0);
            if((cfin.getX()==250)&&(cfin.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cfin);
                getWorld().addObject(new cartafresa(),250,250);
                tiempo.mark();
            }
            else if((cfin.getX()==250)&&(cfin.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cfin);
                if(score<89){
                    getWorld().addObject(new carnebloqueada(),250,250);
                }
                else {
                    getWorld().addObject(new cartacarne(),250,250); 
                }
                
                tiempo.mark();
            }
            
            

        }
        else if (!getWorld().getObjects(cartafresa.class).isEmpty()){
            Actor cf = (Actor)getWorld().getObjects(cartafresa.class).get(0);
            //cartaelote ce = (cartaelote)getWorld().getObjects(cartaelote.class).get(0);
            if((cf.getX()==250)&&(cf.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cf);
                getWorld().addObject(new cartamanzana(),250,250);
                tiempo.mark();
            }
            else if((cf.getX()==250)&&(cf.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cf);
                if(score<179){
                   getWorld().addObject(new cartafinal(),250,250); 
                }
                else{
                   getWorld().addObject(new cartafinal2(),250,250); 
                }
                tiempo.mark();
            }
            else if((cf.getX()==250)&&(cf.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new MyWorld());
            }
            

        }
        else if (!getWorld().getObjects(cartamanzana.class).isEmpty()){
            Actor cm = (Actor)getWorld().getObjects(cartamanzana.class).get(0);
            //cartaelote ce = (cartaelote)getWorld().getObjects(cartaelote.class).get(0);
            if((cm.getX()==250)&&(cm.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cm);
                getWorld().addObject(new cartapiña(),250,250);
                tiempo.mark();
            }
            else if ((cm.getX()==250)&&(cm.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cm);
                getWorld().addObject(new cartafresa(),250,250);
                tiempo.mark();
            }
            else if ((cm.getX()==250)&&(cm.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new Nivel12());
            }
            

        }
        else if (!getWorld().getObjects(cartapiña.class).isEmpty()){
            Actor cpi = (Actor)getWorld().getObjects(cartapiña.class).get(0);
            //cartaelote ce = (cartaelote)getWorld().getObjects(cartaelote.class).get(0);
            if((cpi.getX()==250)&&(cpi.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cpi);
                if(score<29){
                    getWorld().addObject(new elotebloqueado(),250,250);
                }
                else{
                   getWorld().addObject(new cartaelote(),250,250); 
                }
                
                tiempo.mark();
            }
            else if ((cpi.getX()==250)&&(cpi.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cpi);
                
                getWorld().addObject(new cartamanzana(),250,250);
                tiempo.mark();
            }
            else if((cpi.getX()==250)&&(cpi.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                
                Greenfoot.setWorld(new nivel22());
            }

        }
        else if (!getWorld().getObjects(elotebloqueado.class).isEmpty()){
            Actor elob = (Actor)getWorld().getObjects(elotebloqueado.class).get(0);
        
            if((elob.getX()==250)&&(elob.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(elob);
                getWorld().addObject(new cartapiña(),250,250);
                tiempo.mark();
            }
            else if ((elob.getX()==250)&&(elob.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(elob);
                getWorld().addObject(new zanahoriabloqueada(),250,250);
                tiempo.mark();
            }
            

        }else if (!getWorld().getObjects(zanahoriabloqueada.class).isEmpty()){
            Actor zab = (Actor)getWorld().getObjects(zanahoriabloqueada.class).get(0);
        
            if((zab.getX()==250)&&(zab.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(zab);
                getWorld().addObject(new elotebloqueado(),250,250);
                tiempo.mark();
            }
            else if ((zab.getX()==250)&&(zab.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(zab);
                getWorld().addObject(new cebollabloqueada(),250,250);
                tiempo.mark();
            }
            

        }else if (!getWorld().getObjects(cebollabloqueada.class).isEmpty()){
            Actor cebb = (Actor)getWorld().getObjects(cebollabloqueada.class).get(0);
        
            if((cebb.getX()==250)&&(cebb.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cebb);
                getWorld().addObject(new zanahoriabloqueada(),250,250);
                tiempo.mark();
            }
            else if ((cebb.getX()==250)&&(cebb.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cebb);
                getWorld().addObject(new pollobloqueado(),250,250);
                tiempo.mark();
            }
            

        }else if (!getWorld().getObjects(pollobloqueado.class).isEmpty()){
            Actor pob = (Actor)getWorld().getObjects(pollobloqueado.class).get(0);
        
            if((pob.getX()==250)&&(pob.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(pob);
                if(score<29){
                   getWorld().addObject(new cebollabloqueada(),250,250); 
                }
                else{
                   getWorld().addObject(new cartacebolla(),250,250);     
                }
                
                tiempo.mark();
            }
            else if ((pob.getX()==250)&&(pob.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(pob);
                getWorld().addObject(new cabrabloqueada(),250,250);
                tiempo.mark();
            }
            

        }else if (!getWorld().getObjects(cabrabloqueada.class).isEmpty()){
            Actor cabb = (Actor)getWorld().getObjects(cabrabloqueada.class).get(0);
        
            if((cabb.getX()==250)&&(cabb.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cabb);
                getWorld().addObject(new pollobloqueado(),250,250);
                tiempo.mark();
            }
            else if ((cabb.getX()==250)&&(cabb.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cabb);
                getWorld().addObject(new carnebloqueada(),250,250);
                tiempo.mark();
            }
            

        }else if (!getWorld().getObjects(carnebloqueada.class).isEmpty()){
            Actor carb = (Actor)getWorld().getObjects(carnebloqueada.class).get(0);
        
            if((carb.getX()==250)&&(carb.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(carb);
                getWorld().addObject(new cabrabloqueada(),250,250);
                tiempo.mark();
            }
            else if ((carb.getX()==250)&&(carb.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(carb);
                getWorld().addObject(new cartafinal(),250,250);
                tiempo.mark();
            }
            

        }
        else if (!getWorld().getObjects(cartaelote.class).isEmpty()){
            Actor ce = (Actor)getWorld().getObjects(cartaelote.class).get(0);
        
            if((ce.getX()==250)&&(ce.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(ce);
                getWorld().addObject(new cartapiña(),250,250);
                tiempo.mark();
            }
            else if ((ce.getX()==250)&&(ce.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(ce);
                getWorld().addObject(new cartazanahoria(),250,250);
                tiempo.mark();
            }
            else if((ce.getX()==250)&&(ce.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new nivel2());
            }

        }
        else if (!getWorld().getObjects(cartazanahoria.class).isEmpty()){
            Actor cz = (Actor)getWorld().getObjects(cartazanahoria.class).get(0);
        
            if((cz.getX()==250)&&(cz.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cz);
                getWorld().addObject(new cartaelote(),250,250);
                tiempo.mark();
            }
            else if((cz.getX()==250)&&(cz.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cz);
                getWorld().addObject(new cartacebolla(),250,250);
                tiempo.mark();
            }
            else if((cz.getX()==250)&&(cz.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new Nivel13());
            }            

        }
        else if (!getWorld().getObjects(cartacebolla.class).isEmpty()){
            Actor cc = (Actor)getWorld().getObjects(cartacebolla.class).get(0);
        
            if((cc.getX()==250)&&(cc.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cc);
                getWorld().addObject(new cartazanahoria(),250,250);
                tiempo.mark();
            }
            else if((cc.getX()==250)&&(cc.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cc);
                if(score<89){
                    getWorld().addObject(new pollobloqueado(),250,250);
                }
                else{
                    getWorld().addObject(new cartapollo(),250,250);
                }
                tiempo.mark();
            }
            else if((cc.getX()==250)&&(cc.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new nivel23());
            }

        }
        else if (!getWorld().getObjects(cartapollo.class).isEmpty()){
            Actor cpo = (Actor)getWorld().getObjects(cartapollo.class).get(0);
        
            if((cpo.getX()==250)&&(cpo.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cpo);
                getWorld().addObject(new cartacebolla(),250,250);
                tiempo.mark();
            }
            else if((cpo.getX()==250)&&(cpo.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cpo);
                getWorld().addObject(new cartacabra(),250,250);
                tiempo.mark();
            }
            else if((cpo.getX()==250)&&(cpo.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new nivel3());
            }

        }
        else if (!getWorld().getObjects(cartacabra.class).isEmpty()){
            Actor cca = (Actor)getWorld().getObjects(cartacabra.class).get(0);
        
            if((cca.getX()==250)&&(cca.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cca);
                getWorld().addObject(new cartapollo(),250,250);
                tiempo.mark();
            }
            else if((cca.getX()==250)&&(cca.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(cca);
                getWorld().addObject(new cartacarne(),250,250);
                tiempo.mark();
            }
            else if ((cca.getX()==250)&&(cca.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new nivel32());
            }

        }
        else if (!getWorld().getObjects(cartacarne.class).isEmpty()){
            Actor ccar = (Actor)getWorld().getObjects(cartacarne.class).get(0);
        
            if((ccar.getX()==250)&&(ccar.getY()==250)&&(Greenfoot.isKeyDown("left"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(ccar);
                getWorld().addObject(new cartacabra(),250,250);
                tiempo.mark();
            }
            else if((ccar.getX()==250)&&(ccar.getY()==250)&&(Greenfoot.isKeyDown("right"))&&(tiempo.millisElapsed()>500)){
                getWorld().removeObject(ccar);
                if(score<179){
                    getWorld().addObject(new cartafinal(),250,250);
                }
                else {
                    getWorld().addObject(new cartafinal2(),250,250);
                }
                
                tiempo.mark();
            }
            else if((ccar.getX()==250)&&(ccar.getY()==250)&&(Greenfoot.isKeyDown("enter"))){
                Greenfoot.setWorld(new nivel33());
            }

        }
        
        
        // Add your action code here.
    }
}

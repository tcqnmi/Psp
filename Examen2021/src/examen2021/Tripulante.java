
package examen2021;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tripulante extends Thread{
    
    Nave n1 = new Nave();
    boolean vivo = true;

    Tripulante( Nave nave) {
    
        this.n1 = nave;
    }

    @Override
    public void run(){
        
        while(this.vivo){
            //respirar();
            
            n1.respirar(this.getName());   
            
            sleep(1);
        }
            
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
        if(!this.vivo ){
            System.out.println("El tripulante "+getName()+" ha muerto");
        }
    }
    
    public void sleep(int tiempo){
        try {
            TimeUnit.SECONDS.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tripulante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}

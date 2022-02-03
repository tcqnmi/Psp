
package javaapplication23;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Manguera extends Thread{
    
    int numero;
    Incendio fire;

    public Manguera(int numero, Incendio fire) {
        this.numero = numero;
        this.fire = fire;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Incendio getFire() {
        return fire;
    }

    public void setFire(Incendio fire) {
        this.fire = fire;
    }
    
    @Override
    public void run(){
    
        while(fire.isEncendido()){
            sleep(1);
            fire.apagar(this.numero);
            //System.out.println("Manguera "+this.numero+" apaga 1 m2. Quedan "+fire.getExtension()+" metros");
        
        }
    
    }
    
    public void sleep(int tiempo){
        try {
            TimeUnit.SECONDS.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Incendio.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
}

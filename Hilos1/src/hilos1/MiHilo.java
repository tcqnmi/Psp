
package hilos1;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

//Para clases que por ejemplo ya heredan de algo pero queremos que sean hilo implementamos la clase Runnable
public class MiHilo implements Runnable {

    
    int number;
    
    public MiHilo(int number){
    
        this.number = number;
        System.out.println("Creado hilo "+this.number);
        
    }
    
    public void sleep(int tiempo){
        try {
            TimeUnit.SECONDS.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Esto se ejecuta en el hilo runable: "+this.number);
            sleep(1);
        }
    }
    
    
    
}

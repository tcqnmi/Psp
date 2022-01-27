
package prioridad1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Prioridad1 {

    
    public static void main(String[] args) {
        
        try {
            HijoDeThread hilo1 = new HijoDeThread();
            HijoDeThread hilo2 = new HijoDeThread();
            HijoDeThread hilo3 = new HijoDeThread();
            
            System.out.println("Hilos creados");
            
            hilo1.start();
            hilo2.start();
            hilo3.start();
            
            Thread.sleep(10000);
            
            hilo1.detener();
            hilo2.detener();
            hilo3.detener();
            
            System.out.println("Valor del hilo 1: "+hilo1.valor);
            System.out.println("Valor del hilo 2: "+hilo2.valor);
            System.out.println("Valor del hilo 3: "+hilo3.valor);
            
            
            System.out.println("Ahora reiniciamos los hilos y les damos prioridad 1, 5, 10 respectivamente");
            
            hilo1 = new HijoDeThread();
            hilo2 = new HijoDeThread();
            hilo3 = new HijoDeThread();
            
            hilo1.setPriority(1);
            hilo2.setPriority(5);
            hilo3.setPriority(10);

            hilo1.start();
            hilo2.start();
            hilo3.start();
            
            Thread.sleep(10000);
            
            hilo1.detener();
            hilo2.detener();
            hilo3.detener();
            
            System.out.println("Valor del hilo 1: "+hilo1.valor);
            System.out.println("Valor del hilo 2: "+hilo2.valor);
            System.out.println("Valor del hilo 3: "+hilo3.valor);
           
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Prioridad1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("FIN");
        
        
    }
    
}

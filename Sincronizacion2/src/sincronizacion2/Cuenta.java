
package sincronizacion2;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cuenta {
    
    int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
    public void retirarDinero(int cantidad, String nombre){
    
        if(cantidad <= saldo){
        
            System.out.println("Hay dinero en la cuenta, "+nombre+" procede a retirar");
            restar(cantidad);
        }else{
        
            System.out.println("No hay suficiente dinero en la cuenta "+nombre+" no puede retirar dinero");
        }
        
    }
    
    private synchronized void restar(int cantidad){
    
        try {
            
            this.saldo -= cantidad;
            System.out.println("Dinero extraído, saldo: "+this.saldo);
            Thread.sleep(1000);
            if(this.saldo < 0){
                System.out.println("\n \n Este mensaje nunca debería mostrarse \n \n");
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void sleep(int tiempo){
        try {
            TimeUnit.SECONDS.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
    
}


package javaapplication23;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Incendio {
    
    int extension;
    boolean encendido = true;

    public Incendio(int extension) {
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
    
    public synchronized void apagar(int numero){

        if(this.extension>0 && this.encendido){
            this.extension--;
            System.out.println("Manguera "+numero+" apaga 1 m2. Quedan "+this.extension+" metros");
        }else{
            System.out.println("Incendio apagado");
            this.encendido=false;
        }
        
        
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    
    
    
    
    
    
}

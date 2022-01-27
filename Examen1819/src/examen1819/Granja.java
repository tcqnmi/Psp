
package examen1819;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Granja extends Thread {
    
    String nombre;
    int expansion;
    Almacen almacen;
    boolean detener = false;

    public Granja(String nombre, int expansion, Almacen almacen) {
        this.nombre = nombre;
        this.expansion = expansion;
        this.almacen = almacen;
    }

    public void setDetener(boolean detener) {
        this.detener = detener;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExpansion() {
        return expansion;
    }

    public void setExpansion(int expansion) {
        this.expansion = expansion;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
    public synchronized void run(){
    
        while(!detener){
            sleep(1);
            almacen.llenar(expansion);
        }
        
    
    }
    public void sleep(int tiempo){
        try {
            TimeUnit.SECONDS.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Granja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

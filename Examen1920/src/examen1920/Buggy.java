
package examen1920;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tamar
 */
class Buggy extends Thread{
    
    Random rnd = new Random();
    
    String nombre;
    int velocidad;
    int distanciaRecorrida = 0;
    boolean meta = false;
    int distanciaCarrera;
    boolean obstaculo = false;
    boolean explotado = false;
    

    public Buggy(String nombre, int velocidad, int distancia, boolean obstaculo) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.distanciaCarrera = distancia;
        this.obstaculo = obstaculo;
                
    }
    
    @Override
    public synchronized void run(){
        
        while(distanciaRecorrida<distanciaCarrera && !explotado){
            sleep(1);
            this.distanciaRecorrida +=velocidad;
            System.out.println(this.nombre+" ha recorrido: "+this.distanciaRecorrida);
            if(obstaculo){
                int aleatorio = rnd.nextInt(100);
                if(aleatorio<=5){
                    explotado= true;
                }
            }
        
        }
        if(explotado){
            System.out.println(this.nombre+" ha explotado y por ende ha sido eliminado");
        }else{
            System.out.println(this.nombre+" ha terminado la carrera a la velocidad de: "+this.velocidad);
        }
        
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isMeta() {
        return meta;
    }

    public void setMeta(boolean meta) {
        this.meta = meta;
    }
    public void sleep(int tiempo){
        try {
            TimeUnit.SECONDS.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Buggy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

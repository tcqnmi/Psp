
package hilos2;


public class Hilos2 {

    public static void main(String[] args) {
        
        HijoDeThread hilo1 = new HijoDeThread("hilito",1);
        HijoDeThread hilo2 = new HijoDeThread("hiloNormal",5);
        HijoDeThread hilo3 = new HijoDeThread("superHilo",10);
              
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}

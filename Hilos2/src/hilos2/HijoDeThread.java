
package hilos2;


public class HijoDeThread extends Thread {
    
   

    public HijoDeThread(String nombre, int prioridad) {
        setName(nombre);
        setPriority(prioridad);
    }
    
    @Override
    public void run(){

        System.out.println("Hilo: "+getName()+"| id: "+getId()+" | prioridad: "+getPriority() );

    }
    
    
}

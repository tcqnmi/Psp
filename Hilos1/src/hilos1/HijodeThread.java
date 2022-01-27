
package hilos1;


public class HijodeThread extends Thread {
    
    private int number;
    
    
    //Creamos el hilo
    public HijodeThread(int number){
        this.number = number;
        System.out.println("Creado hilo "+this.number);
    }
    
    //Sobreescribimos el método run de la clase Thread.
        
    @Override
    public void run(){
        
        for (int i = 0; i < 200; i++) {
            System.out.println("Ejecución en el hilo número "+this.number+". Iteración: "+i);
        }
    
    }
    
}

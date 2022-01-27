
package examen2021;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HiloAsesino extends Thread{
    
    
    
    Nave n1;
    ArrayList<Tripulante> listaTripulantes;
    boolean menosde30 = false;

    public HiloAsesino(Nave n1, ArrayList<Tripulante> listaTripulantes) {
        this.n1 = n1;
        this.listaTripulantes = listaTripulantes;
    }
    
    @Override
    public void run(){
        
        while(true){
            analisis();
        }
        
    }
    
    public synchronized void analisis(){
        Random rnd = new Random();
        sleep(1);
        if(n1.getOxigeno()<=30){
            System.out.println("Oxígeno por debajo de 30");
            if(!menosde30){
                menosde30 = true;
            }else{
                int tripulantefallecido = rnd.nextInt(this.listaTripulantes.size());
                listaTripulantes.get(tripulantefallecido).setVivo(false);
            }    
            
            }
    
    }
    
    public void sleep(int tiempo){
        try {
            TimeUnit.SECONDS.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tripulante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}


package hilos1;


public class Hilos1 {

    
    public static void main(String[] args) {
        
        
        for (int i = 0; i < 10; i++) {
            
            MiHilo hilito = new MiHilo(i);
            Thread ejecutor = new Thread(hilito);
            ejecutor.start();
            
            HijodeThread miHilo = new HijodeThread(i);
            miHilo.start();
            
           
        }
        /*HijodeThread miHilo1 = new HijodeThread(1);
        miHilo1.start();
        HijodeThread miHilo2 = new HijodeThread(2);
        miHilo2.start();     
        
        //Debemos crear un objeto Thread que permita llamar a su vez al star de la clase MiHilo
        
        MiHilo hilito = new MiHilo(1);
        Thread ejecutor = new Thread(hilito);
        ejecutor.start();
        
        MiHilo hilito2 = new MiHilo(2);
        Thread ejecutor2 = new Thread(hilito2);
        ejecutor2.start();*/
    } 
    
}


package sincronizacion;

public class Sincronizacion {

    public static void main(String[] args) {
        
        Contador c1 = new Contador(100);
        
        HijoDeThread1 hiloA = new HijoDeThread1(c1);
        HijoDeThread2 hiloB = new HijoDeThread2(c1);
        
        hiloA.start();
        hiloB.start();
        
    }     
    
}

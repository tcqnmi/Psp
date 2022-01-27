
package sincronizacion2;

public class Sincronizacion2 {

    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta(70);
        
        HijoDeThread h1 = new HijoDeThread(c1, 20,"h1");
        HijoDeThread h2 = new HijoDeThread(c1, 10,"h2");
               
        h1.start();
        h2.start();
        
    }
    
}


package claseurl1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClaseURL1 {

    
    public static void main(String[] args) {
        
        URL direccion = null;
        
        try {
            
            direccion = new URL("https://lafrikileria.com:80/hola.php");        
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClaseURL1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        visualizar(direccion);
        
        
    }
    
    static void visualizar(URL direccion){
    
        System.out.println(direccion.getHost());
        System.out.println(direccion.getPort());
        System.out.println(direccion.getFile());
        System.out.println(direccion.getPath());
    
    }
    
}

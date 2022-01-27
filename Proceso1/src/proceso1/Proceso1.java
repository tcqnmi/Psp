
package proceso1;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Proceso1 {

    public static void main(String[] args) {
        
        //Llamamos al proceso notepad para abrir el bloc de notas, valido con cualquier comando de terminal
        
        try{
            Runtime runtime = Runtime.getRuntime();
            //Process process = runtime.exec("NOTEPAD");
            
            Process process = runtime.exec("CMD /C DIR");
            
            int texto = process.getInputStream().read() ;
            
            while(texto !=-1){
                
                System.out.print((char)texto);
                texto =process.getInputStream().read();
                
            }
            
           

        } catch (IOException ex) {
            Logger.getLogger(Proceso1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}

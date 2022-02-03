
package claseurl2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClaseURL2 {

    
    public static void main(String[] args) {
        
        try {
            //Creamos la URL
            URL direccion = new URL("https://lafrikileria.com/es/");
            
            //Creamos la conexion
            URLConnection conexion = direccion.openConnection();
            
            //Creamos un inputStream sobre la conexion
            InputStream is = conexion.getInputStream();
            
            //Creamos un inputStreamReader
            InputStreamReader reader = new InputStreamReader(is);
            
            //Creamos el buffered reader
            BufferedReader bf = new BufferedReader(reader);
            
            while(bf.read()>0){
            
                System.out.println(bf.readLine());
            
            
            }
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClaseURL2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClaseURL2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}


package javaapplication23;

import java.util.ArrayList;
import java.util.Scanner;


public class Examen1617 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Extensión del incendio: ");
        int ext = Integer.parseInt(teclado.nextLine());
        
        
        Incendio fire = new Incendio(ext);
        
        System.out.println("Número de mangueras: ");
        int numMangueras = Integer.parseInt(teclado.nextLine());
        
        ArrayList<Manguera> listaMangueras = new ArrayList<>();
        
        for (int i = 0; i < numMangueras; i++) {
            Manguera m1 = new Manguera(i,fire);
            listaMangueras.add(m1);
            m1.start();
        }
        
        
    }
    
}


package examen1920;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Examen1920 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("¿Cuántos kilómetros tiene la pista?");
        int km = Integer.parseInt(teclado.nextLine());
        
        while(km>1000 || km<500){
            System.out.println("Valor no comprendido entre 500 y 1000");
            System.out.println("¿Cuántos kilómetros tiene la pista?");
            km = Integer.parseInt(teclado.nextLine()); 
        }
        
        Pista p1 = new Pista(km);
        
        ArrayList<Buggy> listaBuggies = new ArrayList<>();
        
        System.out.println("¿Cuantos buggies desea crear?");
        int numBuggies = Integer.parseInt(teclado.nextLine());
        
        System.out.println("¿Carrera con obstáculos ? S/N");
        char resp = teclado.nextLine().trim().charAt(0);
        boolean explotado = false;
        if(resp == 's'){
            explotado = true;
        }
        
        for (int i = 0; i < numBuggies; i++) {
            String nombre = String.format("Buggy %d", i);
            int velocidad = rnd.nextInt(50)+50;
            
            
            Buggy b1 = new Buggy(nombre, velocidad, km, explotado);
            listaBuggies.add(b1);
        }
        
        p1.setListaBuggies(listaBuggies);
        
        
        
        
        p1.iniciarCarrera();
        
        
        
    }
    
}

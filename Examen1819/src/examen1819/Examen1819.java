
package examen1819;

import java.util.ArrayList;
import java.util.Scanner;


public class Examen1819 {

 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Capacidad del almacén?");
        int capacidad = Integer.parseInt(teclado.nextLine());
        Almacen a1 = new Almacen(capacidad);
        
       
        
        ArrayList<Granja> listaGranjas = new ArrayList<>();
        
        
        int opcion = 0;
        
        while(opcion<4){
            
            System.out.println("Menú: ");
            System.out.println("1.- Añadir granja");
            System.out.println("2.- Sacar comida del almacén");
            System.out.println("3.- Detener programa");
            opcion = Integer.parseInt(teclado.nextLine());
            
            switch(opcion){
                case 1:

                    System.out.println("Nombre de la granja: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Expansión de la granja: ");
                    int expansion = Integer.parseInt(teclado.nextLine());

                    Granja g1 =  new Granja(nombre, expansion, a1);
                    listaGranjas.add(g1);
                    
                    g1.start();

                    break;
                
                case 2:
                    
                    System.out.println("¿Cuánto desea sacar del almacén?");
                    int restar = Integer.parseInt(teclado.nextLine());
                    a1.vaciar(restar);
                    
                    break;
                    
                case 3:    
                    
                    for (int i = 0; i < listaGranjas.size(); i++) {
                        listaGranjas.get(i).setDetener(true);
                    }
                    opcion++;
                    
                    break;
            }
        }
        
       
        
        
    }
    
}


package examen2021;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Examen2021 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random rnd = new Random();
        
        Nave nave = new Nave();
        DepositoAuxiliar aux = new DepositoAuxiliar();
        
        nave.setAux(aux);
        
        System.out.println("Número inicial de tripulantes: ");
        int tripulantes = Integer.parseInt(teclado.nextLine());
       
        ArrayList<Tripulante> listaTripulantes = new ArrayList<>();
        
        
        for (int i = 0; i < tripulantes; i++) {
            String nombre = ""+i;
            Tripulante t1 = new Tripulante(nave);
            t1.setName(nombre);
            listaTripulantes.add(t1);
            
            t1.start();
        }
        
        HiloAsesino ha = new HiloAsesino(nave, listaTripulantes);
        ha.start();
        
        while(true){
        
            char c = teclado.nextLine().toLowerCase().trim().charAt(0);
            if(c == 'a'){
                nave.sacarDelDeposito();
                System.out.printf("Se ha introducido Oxıgeno auxiliar. Tanque auxiliar %d/100, "
                        + "Oxıgeno restante en atmosfera %d. CO2 presente, %d.",aux.getOxigeno(), nave.getOxigeno(), nave.getCo2());

            }
        }
        
        
    }
   
    
}

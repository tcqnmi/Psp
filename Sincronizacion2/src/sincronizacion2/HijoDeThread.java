
package sincronizacion2;


public class HijoDeThread  extends Thread{
    
    Cuenta c1;
    int cantidad;
    String nombre;

    public HijoDeThread(Cuenta c1, int cantidad, String nombre) {
        this.c1 = c1;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < 6; i++) {
             c1.retirarDinero(cantidad, nombre);
    
        }
       
    }
    
    
    
}


package examen1819;

public class Almacen {
    
    int capacidad;
    int cantidad = 0;

    public Almacen(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void llenar(int añadir){
        
        if(cantidad + añadir <= capacidad){
            this.cantidad +=añadir;
            System.out.println("Se han añadido "+añadir+" al almacén, ahora cuenta con: "+cantidad);
        }else{
            System.out.println("El almacén está lleno"); 
        }
            
    }
    
     public void vaciar(int restar){
        
        if(cantidad - restar <= capacidad){
            this.cantidad =0;
            System.out.println("El almacén está vacío"); 
        }else{
            this.cantidad -= restar;
            System.out.println("Se han restado "+restar+" al almacén, ahora cuenta con: "+cantidad);
        }
            
    }
        
    
}

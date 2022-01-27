
package sincronizacion;


public class Contador {
    
    int valor=0;

    public Contador(int valor) {
        this.valor = valor;
    }
    
    public void decrementa(){
    
        this.valor-- ;
    }
    
    public void incrementa(){
    
        this.valor++;
       
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}


package prioridad1;


public class HijoDeThread extends Thread {
    
    boolean detenido = false;
    long valor = 0;

    public HijoDeThread() {
    }
    
    @Override
    public void run(){
        
        while(!detenido){
            this.valor++;
        }
        
    }
    
    public void detener(){
    
        this.detenido = true;
    }
    
    public void setValor(int i){
        this.valor = i;
    }
    
    public void setDetenido(){
        this.detenido=true;
    }
    
    
    
}

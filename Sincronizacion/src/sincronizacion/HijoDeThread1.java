
package sincronizacion;

public class HijoDeThread1 extends Thread{
    
    
    Contador c1;

    public HijoDeThread1(Contador c1) {
        this.c1 = c1;
    }
    
    @Override
    public void run(){
        
        synchronized(this.c1){
        
            for (int i = 0; i < 3000; i++) {
                c1.decrementa();
            }
        }
        
        
        System.out.println("Valor: "+c1.getValor());
    }
    
}


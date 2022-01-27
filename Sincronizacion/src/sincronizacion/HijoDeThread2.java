
package sincronizacion;


public class HijoDeThread2 extends Thread{
    
    
    Contador c1;

    public HijoDeThread2(Contador c1) {
        this.c1 = c1;
    }
    
    @Override
    public void run(){
        
        synchronized(this.c1){
        
            for (int i = 0; i < 3000; i++) {
                c1.incrementa();
            }
        }
        System.out.println("Valor: "+this.c1.getValor());
    
    }
     
}

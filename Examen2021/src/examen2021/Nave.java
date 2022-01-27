
package examen2021;


public class Nave {
    
    int oxigeno = 100;
    int co2 = 0;
    DepositoAuxiliar aux;

    public DepositoAuxiliar getAux() {
        return aux;
    }

    public void setAux(DepositoAuxiliar aux) {
        this.aux = aux;
    }

    public Nave() {
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }
    
    public void sacarDelDeposito(){
    
      
        this.oxigeno +=10;
        this.co2 -=10;
        aux.restarOxigeno();
    
    }
    
    public synchronized void respirar(String nombre){
        
        if(this.oxigeno >0){
            this.oxigeno--;
            this.co2++;
            System.out.println("El tripulante "+nombre+" respira. Oxıgeno restante "+this.oxigeno+", CO2 presente "+this.co2);

        }else{
            System.out.println("Fin del oxígeno en la atmósfera");
        }
    
    }
    
}

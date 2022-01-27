
package examen2021;


public class DepositoAuxiliar {
    
    int oxigeno = 100;
    int co2= 0;

    public DepositoAuxiliar() {
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
    
    public void restarOxigeno(){
    
        if(this.oxigeno>0){
            this.oxigeno -= 10; 
            this.co2 += 10;
        }else{
            System.out.println("Deposito auxiliar vacío");
        }
        
    }
    
}

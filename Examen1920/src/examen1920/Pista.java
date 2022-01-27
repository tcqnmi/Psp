
package examen1920;

import java.util.ArrayList;


public class Pista {
    
    int km;
    public ArrayList <Buggy> listaBuggies = new ArrayList<>();
   
    
    public Pista(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public ArrayList<Buggy> getListaBuggies() {
        return listaBuggies;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setListaBuggies(ArrayList<Buggy> listaBuggies) {
        this.listaBuggies = listaBuggies;
    }
    
    public void iniciarCarrera(){
    
        for (int i = 0; i < this.listaBuggies.size(); i++) {
            listaBuggies.get(i).start();
            
        }
    }
    
    
    
}

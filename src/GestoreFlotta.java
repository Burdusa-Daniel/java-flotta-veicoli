
import java.util.ArrayList;


public class GestoreFlotta  {
    private ArrayList<Veicolo>veicoli;
    public GestoreFlotta(){
        veicoli= new ArrayList<>();
    }
   public void addVeicolo( Veicolo veicolo){
      veicoli.add(veicolo);
   }

   public int numberAutomobili(){
        int contatore =0;
        for(Veicolo veicolo : veicoli ){
            if (veicolo instanceof Automobile){
                contatore++;
            }
        }
       return contatore;
   }
    public int numberMotocicletta(){
        int contatore =0;
        for(Veicolo veicolo : veicoli ){
            if (veicolo instanceof Motocicletta){
                contatore++;
            }
        }
        return contatore;
    }
   public Veicolo findTarga( String targa){
       for(Veicolo veicolo : veicoli){
           if( veicolo.getTarga().equalsIgnoreCase(targa)){
               return veicolo;
           }
       }
       return null;
   }
}

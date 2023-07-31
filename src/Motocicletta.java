import java.time.LocalDate;

public class Motocicletta extends Veicolo{
    private boolean isCavallettoMoto;
    public Motocicletta(String targa, int annoImmatricolazione, boolean isCavallettoMoto) {
        super(targa, annoImmatricolazione);
        this.isCavallettoMoto=isCavallettoMoto;
    }
    public boolean isCavallettoMoto(){
        return isCavallettoMoto;
    }

    @Override
    public String toString() {
        return "Motocicletta{" +
                "isCavallettoMoto=" + isCavallettoMoto +
                '}';
    }
}

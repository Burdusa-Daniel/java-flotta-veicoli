import java.time.LocalDate;
public class Automobile extends Veicolo{
    private int numeroPorte;
    public Automobile(String targa, int annoImmatricolazione, int numeroPorte) {
        super(targa, annoImmatricolazione);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "numeroPorte=" + numeroPorte +
                '}';
    }
}

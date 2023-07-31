import java.time.LocalDate;

public class Veicolo {
    private String targa ;
    private int annoImmatricolazione;

    public Veicolo(String targa, int annoImmatricolazione) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getTarga() {
        return targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", annoImmatricolazione=" + annoImmatricolazione +
                '}';
    }
}

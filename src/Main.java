import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GestoreFlotta gestoreFlotta = new GestoreFlotta();
        boolean exit = true;

        while (exit) {
            System.out.println("Vuoi aggiungere un veicolo? 1 si / 2 no");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Inserisci il tipo di veicolo (automobile o motocicletta):");
                    String tipoVeicolo = input.nextLine();

                    System.out.println("Inserisci la targa:");
                    String targa = input.nextLine();

                    System.out.println("Inserisci l'anno di immatricolazione:");
                    int annoImmatricolazione = input.nextInt();
                    input.nextLine();

                    if (tipoVeicolo.equalsIgnoreCase("automobile")) {
                        System.out.println("Inserisci il numero di porte:");
                        int numeroPorte = input.nextInt();
                        input.nextLine();

                        gestoreFlotta.addVeicolo(new Automobile(targa, annoImmatricolazione, numeroPorte));
                    } else if (tipoVeicolo.equalsIgnoreCase("motocicletta")) {
                        System.out.println("Motocicletta con cavalletto? (true o false):");
                        boolean cavalletto = input.nextBoolean();
                        input.nextLine();

                        gestoreFlotta.addVeicolo(new Motocicletta(targa, annoImmatricolazione, cavalletto));
                    } else {
                        System.out.println("Tipo di veicolo non valido.");
                    }
                    break;

                case 2:
                    exit = false;
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }
        System.out.println("Numero di Automobili nella flotta: " + gestoreFlotta.numberAutomobili());
        System.out.println("Numero di Motociclette nella flotta: " + gestoreFlotta.numberMotocicletta());
        System.out.println("Inserisci la targa del veicolo da cercare:");
        String targaCercata = input.nextLine();
        Veicolo veicoloTrovato = gestoreFlotta.findTarga(targaCercata);
        if (veicoloTrovato != null) {
            System.out.println("Veicolo trovato: " + veicoloTrovato);
        } else {
            System.out.println("Veicolo non trovato.");
        }
    }
}

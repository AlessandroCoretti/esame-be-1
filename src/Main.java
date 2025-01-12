import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        // Creazione multimediali
        for (int i = 0; i < 5; i++) {
            System.out.println("Crea un elemento multimediale:");
            System.out.println("1. Audio\n2. Video\n3. Immagine");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (scelta) {
                case 1 -> {
                    System.out.print("Durata (in secondi): ");
                    int durata = scanner.nextInt();
                    System.out.print("Volume iniziale: ");
                    int volume = scanner.nextInt();
                    elementi[i] = new Audio(titolo, durata, volume);
                }
                case 2 -> {
                    System.out.print("Durata (in secondi): ");
                    int durata = scanner.nextInt();
                    System.out.print("Volume iniziale: ");
                    int volume = scanner.nextInt();
                    System.out.print("Luminosità iniziale: ");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Video(titolo, durata, volume, luminosita);
                }
                case 3 -> {
                    System.out.print("Luminosità iniziale: ");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosita);
                }
                default -> {
                    System.out.println("Scelta non valida, riprova.");
                    i--; // Riprova l'iterazione
                }
            }
        }

        // Esecuzione elementi
        int scelta;
        do {
            System.out.println("\nScegli un elemento da eseguire (1-5) oppure 0 per uscire:");
            while (!scanner.hasNextInt()) { // Verifica input numerico
                System.out.println("Input non valido. Inserisci un numero tra 0 e 5.");
                scanner.next(); 
            }
            scelta = scanner.nextInt();

            if (scelta > 0 && scelta <= 5) {
                System.out.println("\nEseguo l'elemento " + scelta + ":");
                elementi[scelta - 1].play();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);

        System.out.println("Lettore multimediale terminato.");
        scanner.close();
    }
}
import java.util.Scanner;

public class LettoreMedia {
    public static void main(String[] args) {
        LettoreMedia lettore = new LettoreMedia();
        lettore.creaElementi();
        lettore.esegui();
    }
    private final Media[] elementi;

    public LettoreMedia() {
        elementi = new Media[2];
    }

    public  void creaElementi(){
        Scanner scanner = new Scanner(System.in);


    for (int i = 0; i < elementi.length; i++){
        System.out.println("Inserisci il titolo: ");
        String titolo = scanner.nextLine();
        System.out.println("Tipo di elemento (1 = Video, 2 = Immagine): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        if (tipo == 1) {
            System.out.println("Inserisci il volume:");
            int volume = scanner.nextInt();
            System.out.println("Inserisci la luminosità:");
            int luminosita = scanner.nextInt();
            System.out.println("Inserisci la durata:");
            int durata = scanner.nextInt();
            scanner.nextLine();
            elementi[i] = new Video(titolo, volume, luminosita, durata);
        } else if (tipo == 2) {
            System.out.println("Inserisci la luminosità:");
            int luminosita = scanner.nextInt();
            scanner.nextLine();
            elementi[i] = new Immagine(titolo, luminosita);
        }
    }
    }

    public void esegui() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quale elemento vuoi eseguire? (1-2, 0 per finire)");
            int scelta = scanner.nextInt();
            if (scelta == 0)

                break;

            if (scelta >= 1 && scelta <= 2) {
               Media  elemento = elementi[scelta - 1];
                if (elemento instanceof Video) {
                    System.out.println("Avete scelto il video. Ecco, buona visione! Grazie.");
                    ((Video) elemento).play();
                } else if (elemento instanceof Immagine) {
                    System.out.println("Avete scelto l'immagine. Eccola! Troppo bella, vero? ");
                    ((Immagine) elemento).show();
                }
            }

        }
        System.out.println("Grazie mille! Alla prossima!");
    }

}
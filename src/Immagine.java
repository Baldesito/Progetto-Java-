public class Immagine extends Media{
    private final int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println(titolo + "*".repeat(luminosita));
    }

}

public class Video extends Media implements Riprodurre {
    private int volume;
    private int luminosita;
    private final int durata;

    public Video(String titolo,int volume, int luminosita, int durata){
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
        this.durata = durata;

    }

    @Override
    public void play(){
        for (int i = 0; i < durata; i++){
            System.out.println(titolo + "!" .repeat(volume) + "*".repeat(luminosita));
        }
    }
    @Override
    public void volumeAlto(){
        volume++;
    }
    public void volumeBasso() {
        volume--;
    }
    public void luminositaAlta() {
        luminosita++;

    }
    public void luminositaBassa(){
        luminosita--;
    }
}

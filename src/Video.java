public class Video extends Media implements Riprodure {
    private int volume;
    private int luminosita;
    private int durata;

    public Video(String titolo,int volume, int luminosita, int duratra){
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;

    }

    @Override
    public void play(){
        for (int i = 0; i < durata; i++){
            System.out.println(titolo + "v" .repeat(volume) + "l".repeat(luminosita));
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

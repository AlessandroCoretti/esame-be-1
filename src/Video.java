public class Video extends ElementoMultimediale{
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita){
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void abbassaVolume(){
        if (volume > 0){
            volume--;
        }
    }

    public void alzaVolume(){
        volume++;
    }

    public void diminuisciLuminosita(){
        if (luminosita > 0){
           luminosita--;
        }
    }

    public void aumentaLuminosita(){
        luminosita++;
    }

    public void play(){
        for (int i = 0; i < durata; i++){
            StringBuilder str = new StringBuilder(titolo);
            for(int j = 0; j < volume; j++){
                str.append("!");
            }
            for(int k = 0; k < luminosita; k++){
                str.append("*");
            }

            System.out.println(str.toString());
        }
    }
}

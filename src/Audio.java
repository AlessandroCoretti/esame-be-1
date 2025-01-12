public class Audio extends ElementoMultimediale implements Eseguibile{
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void abbassaVolume(){
        if (volume > 0){
            volume--;
        }
    }

    public void alzaVolume(){
        volume++;
    }

    public void play(){
        for (int i = 0; i < durata; i++){
            StringBuilder str = new StringBuilder(titolo);
            for (int j = 0; j < volume; j++){
                str.append("!");
            }
            System.out.println(str.toString());
        }
    }

    public void esegui(){
        play();
    }
}

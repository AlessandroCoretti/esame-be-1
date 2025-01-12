public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita){
        super(titolo);// immagine non ha durata
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void diminuisciLuminosita(){
        if (luminosita > 0){
            luminosita--;
        }
    }

    public void aumentaLuminosita(){
        luminosita++;
    }

    public void show(){
        StringBuilder str = new StringBuilder(titolo);
        for (int i = 0; i < luminosita; i++){
            str.append("*");
        }
        System.out.println(str.toString());
    }

    @Override
    public void play() {
        System.out.println("Un'immagine non è riproducibile");
    }
}

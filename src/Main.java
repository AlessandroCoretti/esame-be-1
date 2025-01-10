//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Audio registrazione1 = new Audio("Audio1", 5, 3);
        Video video1 = new Video("Video1", 3, 5, 4);
        System.out.println("Audio");
        registrazione1.abbassaVolume();
        registrazione1.play();


        registrazione1.alzaVolume();
        registrazione1.play();
        System.out.println("\nVideo");
        video1.play();

        video1.abbassaVolume();
        video1.aumentaLuminosita();

        video1.play();
    }
}
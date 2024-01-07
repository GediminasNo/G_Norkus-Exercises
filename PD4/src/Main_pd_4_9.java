import java.util.Scanner;

public class Main_pd_4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite puodelių skaičių, kurį reikia supakuoti: ");
        int puodeliuSk = scanner.nextInt();


        int pilnuDezuciuSk = puodeliuSk / 3;
        int likusiuPuodeliuSk = puodeliuSk % 3;


        System.out.println("Pilnų dėžučių skaičius: " + pilnuDezuciuSk);
        System.out.println("Nesupakuotų puodelių skaičius: " + likusiuPuodeliuSk);

        scanner.close();
    }
}

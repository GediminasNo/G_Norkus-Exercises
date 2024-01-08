import java.util.Scanner;

public class Main_pd_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int egluciuKiekis ;
        int pirmaEglute ;
        int antraEglute;
        int treciaEglute;
        int ketvirtaEglute;
        int penktaEglute;
        int sestaEglute;
        int egluciuSuma = 0;

        System.out.println("Kiek egluciu atvezta?");
        egluciuKiekis = scanner.nextInt();

        System.out.println("Iveskite pirmos eglutes auksti");
        pirmaEglute = scanner.nextInt();
        egluciuSuma+=pirmaEglute;
        System.out.println("Iveskite antros eglutes auksti");
        antraEglute = scanner.nextInt();
        egluciuSuma+=antraEglute;
        System.out.println("Iveskite trecia eglutes auksti");
        treciaEglute = scanner.nextInt();
        egluciuSuma+=treciaEglute;
        System.out.println("Iveskite ketvirtos eglutes auksti");
        ketvirtaEglute = scanner.nextInt();
        egluciuSuma+=ketvirtaEglute;
        System.out.println("Iveskite penkta eglutes auksti");
        penktaEglute = scanner.nextInt();
        egluciuSuma+=penktaEglute;
        System.out.println("Iveskite sestos eglutes auksti");
        sestaEglute = scanner.nextInt();
        egluciuSuma+=sestaEglute;


        System.out.println("Eglutes aukscio vidurkis" + (egluciuSuma/egluciuKiekis + "cm"));





    }
}

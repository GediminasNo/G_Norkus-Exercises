import java.util.Scanner;

public class Main_pd_4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Koks automobilio greitis km/h?: ");
        double greitisKmh = scanner.nextDouble();


        double greitisMs = greitisKmh * 1000 / 3600;


        double tunelioTrukme = 264 / greitisMs;


        System.out.printf("Automobilis tunelį pravažiuos per %.2f s\n", tunelioTrukme);

        scanner.close();
    }
}

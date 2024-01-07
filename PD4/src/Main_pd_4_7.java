import java.sql.SQLOutput;
import java.util.Scanner;

public class Main_pd_4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kiek paskaitu yra pirmadieni?");
        int pirmadienis = scanner.nextInt();

        System.out.println("Kiek paskaitu yra antradieni?");
        int antradienis = scanner.nextInt();

        System.out.println("Kiek paskaitu yra treciadieni?");
        int treciadienis = scanner.nextInt();

        System.out.println("Kiek paskaitu yra ketvirtadieni?");
        int ketvirtadienis = scanner.nextInt();

        System.out.println("Kiek paskaitu yra penktadieni?");
        int penktadienis = scanner.nextInt();

        int resultPaskaitos = pirmadienis+antradienis+treciadienis+ketvirtadienis+penktadienis;
        int resultMinutes = resultPaskaitos*45;

        System.out.println("tiek paskaitu turi per savaite\t"+ resultPaskaitos);
        System.out.println("Tiek minuciu paskaitu turi\t"+ resultMinutes);

    }
}

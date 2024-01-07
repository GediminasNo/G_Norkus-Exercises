import java.util.Scanner;

public class Main_pd_4_1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Iveskite  pirma skaiciu");
        int pirmasSkaicius = scaner.nextInt();

        System.out.println("Iveskite  pirma skaiciu");
        int antrasSkaicius = scaner.nextInt();

        int resultSudetis = pirmasSkaicius+antrasSkaicius;
        System.out.println("Sudetis" + resultSudetis);

        int resultAtimtis = pirmasSkaicius-antrasSkaicius;
        System.out.println("Atimtis"+ resultAtimtis);

        int resultDaugyba = pirmasSkaicius*antrasSkaicius;
        System.out.println("Daugyba" + resultDaugyba);

        int resultdalyba = pirmasSkaicius/antrasSkaicius;
        System.out.println("dalyba" + resultdalyba);

        int resultSuliekana = pirmasSkaicius%antrasSkaicius;
        System.out.println("Liekana" + resultSuliekana);


    }
}

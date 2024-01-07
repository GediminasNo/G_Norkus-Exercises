import java.util.Scanner;

public class Main_pd_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite pirma skaiciu");
        double pirmasSkaicius = scanner.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double antrasSkaicius = scanner.nextDouble();

        System.out.println("Ar skaicius\t"+pirmasSkaicius +">"+"nei skaicius "+antrasSkaicius+" "+ (pirmasSkaicius>antrasSkaicius));
        System.out.println("Ar skaicius\t"+pirmasSkaicius +"<"+"nei skaicius "+antrasSkaicius+" "+ (pirmasSkaicius<antrasSkaicius));
        System.out.println("Ar skaicius\t"+pirmasSkaicius +"=="+"nei skaicius "+antrasSkaicius+" "+ (pirmasSkaicius==antrasSkaicius));
        System.out.println("Ar skaicius\t"+pirmasSkaicius +"!="+"nei skaicius "+antrasSkaicius+" "+ (pirmasSkaicius!=antrasSkaicius));
        System.out.println("Ar skaicius\t"+pirmasSkaicius +">="+"nei skaicius "+antrasSkaicius+" "+ (pirmasSkaicius>=antrasSkaicius));
        System.out.println("Ar skaicius\t"+pirmasSkaicius +"<="+"nei skaicius "+antrasSkaicius+" "+ (pirmasSkaicius<=antrasSkaicius));
    }
}

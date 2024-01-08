import java.util.Scanner;

public class Main_pd_5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int skaicius ;
        int suma =0;

        do {
            System.out.println("Iveskite skaiciu");
            skaicius = scanner.nextInt();
            suma += skaicius;
        }while(skaicius!=0);

        System.out.println("visu ivestu skaiciu suma\t" + suma);

        scanner.close();



            }

            }




package lt.techin;

import java.util.Scanner;

public class Main_pd_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite savo varda\n");
        String vardas = scanner.nextLine();

        System.out.println("Sveiki , "+" " +  vardas +"!");
        scanner.close();

    }
}

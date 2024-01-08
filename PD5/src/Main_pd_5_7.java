import java.util.Scanner;

public class Main_pd_5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek dalyvavo? begiku?");
        int dalyvavo = scanner.nextInt();

        int[] laikai = new int [dalyvavo];
        int suma = 0;
        int greiciausias = Integer.MAX_VALUE;

        for(int i =0;i<dalyvavo;i++){
            System.out.println("Iveskite laikus"+(i+1)+"begiku");
            laikai[i] = scanner.nextInt();
            suma+=laikai[i];
            if(laikai[i]<greiciausias){
                greiciausias = laikai[i];
            }
        }int vidurkis = suma/dalyvavo;
        System.out.println("Begiku vidurkis"+ vidurkis);
        System.out.println("Begiku geriausias laikas yra " + greiciausias);

    }
}

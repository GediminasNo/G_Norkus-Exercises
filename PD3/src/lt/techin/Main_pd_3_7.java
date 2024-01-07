package lt.techin;

public class Main_pd_3_7 {
    public static void main(String[] args) {
        String pirmasTekstas = "Sveikas";
        String antrasTekstas = "Pasauli";

        String sujungtasTekstas = pirmasTekstas+antrasTekstas;

        System.out.println(sujungtasTekstas);

        String papildomasTekstas = "SveikasPasauli";

        boolean arTiesa = sujungtasTekstas.equals(papildomasTekstas);

        System.out.println("ar lygus tekstai\t - " + arTiesa+ "\n");

        String dalisTeksto = sujungtasTekstas.substring(3,10);

        System.out.println(dalisTeksto + "dalis teksto ");

        int ilgisTeksto = sujungtasTekstas.length();

        System.out.println("Ilgis teksto\t" + ilgisTeksto );

    }
}

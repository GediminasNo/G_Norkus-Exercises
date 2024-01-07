public class Main_pd_4_8 {
    public static void main(String[] args) {
        int sienosIlgismm = 4000;
        int sienosAukstismm = 3000;

        int plytosIlgismm =200;
        int plytosAukstismm = 100;
        float plytosKainaEur = 0.5F;

        int plytuKiekisIlgyje = sienosIlgismm/plytosIlgismm;
        int plytKiekisAukstyje = sienosAukstismm/plytosAukstismm;
        int plytuKiekisBendras = plytuKiekisIlgyje*plytKiekisAukstyje;
        float plytuKainaBendra = plytuKiekisBendras*plytosKainaEur;

        System.out.println("Reikalingas plytu kiekis " + plytuKiekisBendras);
        System.out.println("Plytu kaina " + plytuKainaBendra + " Eur");


    }
}

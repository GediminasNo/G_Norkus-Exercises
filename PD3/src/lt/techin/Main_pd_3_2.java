package lt.techin;

public class Main_pd_3_2 {
    public static void main(String[] args) {
        byte pimrasByte = 10;
        short pirmasShort = 20;

        int suma = pimrasByte+pirmasShort;
        int skirtumas = pimrasByte -pirmasShort;

        System.out.println(suma);
        System.out.println(skirtumas);

        byte sumaByte = (byte) suma;
        short sumaShort = (short) skirtumas;

        System.out.println(sumaByte);
        System.out.println(sumaShort);

    }
}

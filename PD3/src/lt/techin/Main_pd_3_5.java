package lt.techin;

public class Main_pd_3_5 {
    public static void main(String[] args) {
        int intSkaicius = 1000;
        double doubleSkaicius = 32.14;
        long longSkaicius = 10000000000L;

        double fromIntSkaicius = (double) intSkaicius;

        int fromDoubleSkaicius = (int) doubleSkaicius;
        int fromLongSkaicius = (int) longSkaicius;

        System.out.println(fromIntSkaicius+ "skaicius is int i double");
        System.out.println(fromDoubleSkaicius+ " skaicius is double i int");
        System.out.println(fromLongSkaicius+ "skaicius is long i int ");

    }
}

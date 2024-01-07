package lt.techin;

public class Main_pd_3_4 {
    public static void main(String[] args) {
        boolean tiesa = true;
        boolean netiesa = false;

        boolean rezultAnd = tiesa && netiesa;
        boolean rezultOr = tiesa || netiesa;
        boolean rezultnot = !tiesa;

        System.out.println(rezultAnd);
        System.out.println(rezultOr);
        System.out.println(rezultnot);
    }
}

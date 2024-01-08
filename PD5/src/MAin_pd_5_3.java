public class MAin_pd_5_3 {
    public static void main(String[] args) {
        int n = 50;

        System.out.println("Pirminiai skaičiai naudojant for ciklą:");
        for (int i = 2; i <= n; i++) {
            boolean pirminis = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    pirminis = false;
                    break;
                }
            }

            if (pirminis) {
                System.out.print(i + " ");
            }
        }
    }
}

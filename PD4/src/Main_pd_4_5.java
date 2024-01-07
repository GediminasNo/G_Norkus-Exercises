public class Main_pd_4_5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 3;

        int result1 = x + y * z;
        System.out.println("x + y * z = " + result1);

        int result2 = (x + y) * z;
        System.out.println("(x + y) * z = " + result2);

        int result3 = x / y + z;
        System.out.println("x / y + z = " + result3);

        int result4 = x / (y + z);
        System.out.println("x / (y + z) = " + result4);

        int result5 = x % y + z * z;
        System.out.println("x % y + z * z = " + result5);
    }
}

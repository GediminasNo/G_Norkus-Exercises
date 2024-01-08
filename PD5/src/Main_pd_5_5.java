public class Main_pd_5_5 {
    public static void main(String[] args) {
        for(int i = 1; i<=100;i++){
            if(i%5==0) {
                continue;
            }
            System.out.println(i);
            if(i/88==0){
                System.out.println("ciklas yra nutrauktas dalinasi is 88");
                break;

        }

            }
    }
}

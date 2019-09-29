import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int a, b;
        int luwi=0;
        int kenti=0;
        int luwebis_jami=0;
        int kentebis_jami=0;



        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        if (a > b) {
            int x = a;
            a=b;
            x=b;
        }
        Random rand = new Random();
        for (int i=0;i<40;i++){
            int random = rand.nextInt(b-a+1) + a;
            System.out.println(random);
            if (random % 2==0){
                luwi+=1;
                luwebis_jami+=random;
            }
            else{
                kenti+=1;
                kentebis_jami+=random;
            }


        }
        System.out.println("ლუწების რაოდენობაა"+" "+luwi);
        System.out.println("კენტების რაოდენობაა"+" "+kenti);
        System.out.println("ლუწების ჯამია"+" "+luwebis_jami);
        System.out.println("კენტების ჯამია"+" "+kentebis_jami);
        if(luwebis_jami>kentebis_jami){
            kentebis_jami=luwebis_jami;
            luwebis_jami=kentebis_jami;
        }
        for (int j =0;j<5;j++){

            System.out.print(rand.nextInt(kentebis_jami-luwebis_jami+1) + luwebis_jami+"\n");
        }
    }


}
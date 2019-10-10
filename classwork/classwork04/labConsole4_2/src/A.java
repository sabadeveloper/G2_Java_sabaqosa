import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class A implements MyMethodsA{

     public int a;
     public int b;
     public int m[] = new int[12];

     @Override
    public void Method1(){ ;
            this.a= ThreadLocalRandom.current().nextInt(10, 25);
            this.b= ThreadLocalRandom.current().nextInt(10, 25);
            System.out.println(a);
            System.out.println(b);
    }
@Override

    public int[] Method2(){
        int[] mk = new int[]{a,b};
        return mk;

    }

    @Override
    public void Method4(){

        for (int i=0; i<m.length;i++) {
            this.m[i] = ThreadLocalRandom.current().nextInt(-10, 60);

        }
        System.out.println(Arrays.toString(m));

    }

    @Override
    public void Method5(){
        int result[] = new int[12];
        for (int i=0; i<m.length;i++){

            if(m[i]%2 == 0){

            result[i]=m[i];
            }

        }
        System.out.println(Arrays.toString(result));
    }

    @Override
    public void Method6(){
        int sum = 0;
        for (int i=0; i<m.length;i++){
            if(m[i]>0){
                sum+=m[i];
            }
        }
        System.out.println("Sum="+sum);
    }

    @Override
    public void Method7(){
        int[] result = new int[12];
        int min = m[0];
        for (int i=1; i<m.length;i++){
            if (min>m[i]  || min<=0 && m[i]>0 ){
                min = m[i];
            }

        }

        System.out.println(min);

    }
}

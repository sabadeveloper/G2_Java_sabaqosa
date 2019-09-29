import java.util.Scanner;

public class C {
    int a,b,c;

    public void Method1(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }

    public int Method2(){
        return (a%10);
    }

    public int Method3(){

        while (b >= 10){b /= 10;}
        return b;

    }

     public int Method4(){
        int i=0;
        do {
            i+= c % 10;
            c/=10;

        }
        while (c>0);
        return i;

    }

    public void Method5(){

        System.out.println(Method2()*Method3());


    }
    public int Method5_5(){
        return  Method2() * Method3();
    }



    public void Method6(){
        int x = Method3();
        int y = Method5_5();
        int z= x+y;

        System.out.println(z);
    }


}

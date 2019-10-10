import java.util.Scanner;

public class C implements MyMethodsOfC{

    int a=10;
    int b=9;
    char s='#';
    char h='@';

    @Override
    public void Method1c(){
        System.out.println(a);
        System.out.println(b);

    }

    @Override
    public void Method2c(){
        System.out.println(s);
        System.out.println(h);
    }

    @Override
    public void Method3c() {
        int sum = a+b;
        int procuct = a*b;
        int minus = a-b;
        int balance = a%b;
        System.out.println("a+b="+sum+"\n"+"a*b="+procuct+"\n"+"a-b="+minus+"\n"+"a%b="+balance);
    }

    @Override
    public void Method4c(){
        Scanner myObj = new Scanner(System.in);
        int a =myObj.nextInt();

    }

    @Override
    public void Method5c(){
        Scanner myObj = new Scanner(System.in);
        int b =myObj.nextInt();

    }

    @Override
    public void Method6c(){
        Scanner myObj = new Scanner(System.in);
        String s =myObj.nextLine();
        String h =myObj.nextLine();

    }






    }


import java.util.Scanner;

public class B implements MyMethodsOfB {
    int a = 33;
    double b =9.7;
    char s='#';

    @Override
    public void Method1b(){
        System.out.println(s);
    }

    @Override
    public void Method2b(){
        System.out.println(a);
    }

    @Override
    public void Method3b(){
        System.out.println(b);
    }

    @Override
    public void Method4b(){
        System.out.println(a-b);
    }

    @Override
    public double Method5b(){
       double result = a/b;
       return result;

    }

    @Override
    public void Method6b(){
        Scanner myObj= new Scanner(System.in);
        double a = myObj.nextDouble();
        String b = myObj.nextLine();
        int  s = myObj.nextInt();
        System.out.println(s);

    }

    @Override
    public void Method7b(){
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        System.out.println(a);
    }

    @Override
    public void Method8b(){
        System.out.println(b+10);
    }
}

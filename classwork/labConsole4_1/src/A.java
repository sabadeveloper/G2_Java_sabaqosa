import java.net.SocketOption;

public class A implements MyMethods {
    int a=10;
    int b=29;
    @Override
    public  void Method1a(){
        System.out.println("Hello OOP");
    }

    @Override

    public void Method2a(){
        System.out.println(a);
    }
    @Override
    public void Method3a(){
        System.out.println(b);
    }

    @Override
    public void Method4a(){
        System.out.println(a+b);
    }

    @Override
    public int Method5a(){
        return a+b;
    }

    @Override
    public int Method6a(){
        return a*b;
    }

    @Override

    public void  Method7a() {
        int a=5;
        int b=6;



    }

}

import java.util.Scanner;

public class A {

    int x;

    public A(){
        System.out.println("Hello");
    }

    public void Method1(){
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
    }

    public void  Method2(){
        System.out.println(x+12);
    }

    public void Method3(){
        if(x%2==0){
            System.out.println("x aris Luwi");
        }
        else {
            System.out.println("x aris kenti");
        }
    }
}

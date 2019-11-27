package Numbers;

import java.util.Random;

public class ClassWork07 extends Printdata {
    String name="saba";
    protected void method1() {
        int a=0;
        int b=99;
        int count=0;
        int[] m = new int [100] ;
        Random rand = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i]=rand.nextInt(b-a+1)+a;
            if(m[i]>i)count++;
        }
        System.out.println(count);

    }

    public void setData(String name){
        this.name = name;
    }

    protected void printName(){
        System.out.println(name);
    }
    protected void PrintName2(){
        System.out.println(name);
    }
}

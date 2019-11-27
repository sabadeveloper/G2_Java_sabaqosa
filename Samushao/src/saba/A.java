package saba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*განსაზღვრეთ 100 ელემენტიანი მთელი ტიპის მასივი. ელემენტებს მიანიჭეთ შემთხვევითი მნიშვნელობები
[0; 99]-შუალედიდან. დათვალეთ რამდენი ელემენტია მის ინდექსზე მეტი.
 */
public class A extends Abstract1{
    String name="saba";
    int a=0;
    int b=99;
    int count=0;
    int[] m = new int [100] ;
    Random rand = new Random();
    protected void method1() {
        for (int i = 0; i < m.length; i++) {
            m[i]=rand.nextInt(b-a+1)+a;
            if(m[i]>i)count++;
        }
        System.out.println(count);

    }
    public void method2(String name){
        this.name = name;
        System.out.println(this.name);

    }

    public void printtxt(){
        try {
            BufferedWriter file  =new  BufferedWriter(new FileWriter("index.txt",false));
            for (int i=0; i<50; i++){
                if(i%2==0){
                    file.write(String.valueOf(i+"\n"));
                }

            }
            file.close();
            BufferedReader file1  =new BufferedReader(new FileReader("index.txt"));
            String s;
            while ((s=file1.readLine()) !=null){
                int x =Integer.parseInt(s);
                if(x%4==0){
                    System.out.println(x);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void random(){
        ArrayList<Integer> array= new ArrayList<>();
        for(int i =1;i<=100;i++){
            array.add(i);
        }
        //System.out.println(array);
       for(int i : array){
           if(i%10==0){
               System.out.println(i);
           }
       }
        }
    }




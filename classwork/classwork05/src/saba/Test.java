package saba;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public  class Test {
    /*მთელი 24, 39, -90 რიცხვები ჩაწერეთ data.txt ფაილში, ფაილი შექმენით myfolder
    საქაღალდეში.*/
    public void method1(){
        int a=12;
        int b=39;
        int c=90;
        try {
            //new File("myfolder").mkdir();
            FileWriter file  = new FileWriter("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder/data.txt",false);
            file.write(String.valueOf(a+"\n"+b+"\n"+c));
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*0-დან 100-მდე მთელი რიცხვები ჩაწერეთ data1.txt ფაილში. myfolder საქაღალდეში.*/
    public void method2(){
        try {
            FileWriter file1 = new FileWriter("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder/data1.txt",false);
            for(int i=0;i<100;i++){
                file1.write(String.valueOf(i+"\n"));
            }
            file1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*myfolder საქაღალდეში საქაღალდეში შექმენით 30 ფაილი, ფაილებში ჩაწერეთ სიტყვა
„Programmer“..*/
    public void method3(){
        new File("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder1").mkdir();
        try {

            for(int i=1;i<=30;i++) {
                FileWriter write = new FileWriter("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder1/file" + i + ".txt");
                write.write("Programmer");
                write.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*myfolder2 საქაღალდეში საქაღალდეში შექმენით 30 ფაილი, ფაილებში ჩაწერეთ სიტყვა
„Programmer“..*/
    public void method4(){
        new File("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder2").mkdir();
        try {

            for(int i=1;i<=30;i++) {
                FileWriter write = new FileWriter("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder2/file" + i + ".txt");
                write.write("Programmer"+i);
                write.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*კლავიატურიდან გადაცემული [a, b] შუალედიდან ჩაწერეთ data2.txt ფაილში 100
    შემთხვევითი მთელი რიცხვი. ფაილი შექმენით myfolder საქაღალდეში.*/
    public void method5(){
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        if (a > b) {
            int x = a;
            a=b;
            x=b;
        }

        Random rand = new Random();

        try {
            FileWriter file  = new FileWriter("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder/data2.txt");
            for(int i=0;i<100;i++){
            file.write(String.valueOf(rand.nextInt(b-a+1)+a)+"\n");
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 /*კლავიატურიდან გადაცემული [a, b] შუალედიდან დაამატეთ data3.txt ფაილში 50
შემთხვევითი ნამდვილი რიცხვი. დამატებული რიცხვები გამოყავით მასში არსებული
რიცხვებიდან. myfolder საქაღალდეში.*/

    public void method6(){
        int  a;
        int  b;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        if (a > b) {
            int x = a;
            a=b;
            x=b;
        }

        Random rand = new Random();

        try {
            FileWriter file  = new FileWriter("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder/data3.txt");
            for(int i=0;i<50;i++){
                double randomDouble = a + (b - a) * rand.nextDouble();
                file.write(String.format("%.2f\n",randomDouble));
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*დაწერეთ პროგრამა, რომელიც y = x^3 + e^x ფუნქციის მნიშვნელობებს დაითვლის [0; 2 ]
    შუალედში მეასედების სიზუსტით და შესაბამის მნიშვნელობებს ჩაწერს function.txt
    ფაილში myfolder საქაღალდეში.*/
    public void method7(){
        int x;
        int y;
        double e=2.718;
        try {
            FileWriter file = new FileWriter("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder/function.txt");
            for(double i=0.00;i<=2.0;i+=0.01){
                double result1=Math.pow(i,3.0);
                double result2=Math.pow(e,i);
                double sum = result1+result2;
                file.write(String.format("%.2f\n",sum));
            }
            file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    /* დაწერეთ ფუნქცია, რომელიც ჩაწერს 5-ს ‘.txt’ გაფართოების ფაილს myFiles
საქაღალდეში, ფაილებში ჩაწერს 1-დან 5-მდე რიცხვებს და შესაბამისად ფაილის
სახელი იქნება ის რიცხვი რაც ჩაწერილია შესაბამის ფაილში. მაგ(თუ ფაილში ჩაწერილია
რიცხვი 12 მაშინ ამ ფაილის სახელი იქნება 12.txt).*/
     public void method9(){
         try {
             for(int i=1;i<5;i++) {
                 FileWriter file = new FileWriter("S:/G2_JAVA/G2_Java_sabaqosa/classwork/classwork05/myfolder/"+i+".txt");
                 file.write(String.valueOf(i));
                 file.close();
             }

         } catch (IOException e) {
             e.printStackTrace();
         }
     }
    /*დაწერეთ პროგრამა, რომელიც ათობით რიცხვს გადაიყვანს ორობითში.*/
    public void method10(){
        int decimal;
        Scanner input = new Scanner(System.in);
        decimal=input.nextInt();
        int binary[] = new int[40];
        int index = 0;
        while(decimal >0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }

    /*დაწერეთ პროგრამა რომელსაც რიცხვი დაგაჰყავს ორობითიდან ათობითში"*/
    public void method11(){
        int binary;
        Scanner input = new Scanner(System.in);
        binary = input.nextInt();
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        System.out.println(decimal);
    }
}


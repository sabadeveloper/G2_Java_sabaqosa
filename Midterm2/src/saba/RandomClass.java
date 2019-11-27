package saba;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomClass implements Interfaceofrand {


    /*   public void method11() {
           System.out.println("Plese enter your number:");

           int n;
           Scanner input = new Scanner(System.in);
           n = input.nextInt();
           while(n<=10) {
               System.out.println("გთხოვ შეიყვანო 10-ზე მეტი რიცხვი:");
               n=input.nextInt();
           }
           if(n>10){
               int number_1 = -48;
               int number_2 = 12;
               try {
                   FileWriter file = new FileWriter("numbers.txt", false);
                   Random rand = new Random();
                   for (int i = 0; i < n; i++) {
                       int random = rand.nextInt(number_2 - number_1 + 1) + number_1;
                       file.write(String.valueOf(random + "\n"));
                   }
                   file.close();

               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }



       public void method22 () throws IOException {

                   BufferedReader file2 = new BufferedReader(new FileReader("numbers.txt"));
                   String s = null;
                   long sum = 1;
                   while ((s = file2.readLine()) != null) {
                       int x = Integer.parseInt(s);
                       if (x < 0) {
                           sum *= x;
                       }

                   }
                   System.out.println(sum);
                   file2.close();

           }

     */
    int a;
    int b;
    int min_number = -10;
    int max_number = 10;
    int[] m = new int[12];
    Random rand = new Random();

    @Override
    public void method1() {
        this.a = rand.nextInt(max_number - min_number + 1) + min_number;
        this.b = rand.nextInt(max_number - min_number + 1) + min_number;
        System.out.println("Random number of A:" + a + "\n" + "Random number of B:" + b);
    }

    public void method2() {
        for (int i = 0; i < m.length; i++) {
            m[i] = rand.nextInt(max_number - min_number + 1) + min_number;
        }
        System.out.println(Arrays.toString(m));
    }

    public void method3() {
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        //int last_number=0 ;
        for (int i = 0; i < m.length; i++) {
            if (m[i] >= 0) {
                //last_number = m[i];
                System.out.println(m[i-1]);
                break;

            }
        }

    }

    public void method4() {
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i] + " ---->" + i);
        }
    }

    public void method5() {

        for (int i = 0; i < m.length; i++) {

            String str = Integer.toString(m[i]);
            int size = str.length();
            if (m[i] < 0) System.out.println("რიცხვი:" + m[i] + "   " + "ციფრთა რაოდენობა:  " + (size - 1));
            else System.out.println("რიცხვი:" + m[i] + "   " + "ციფრთა რაოდენობა:  " + size);

        }
    }

    public void method6() {
        int zero = 1;


        for (int i = 0; i < m.length; i++) {
            int count = 0;
                int saba= m[i];
            if(m[i]==0)count=zero;
                while (m[i] != 0) {
                    m[i] /= 10;
                    count++;


            }

            System.out.println("\n" + saba + "--->" + count);
        }


    }
}

package saba;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A {
    int a;
    int b;
    int[][] m = new int[5][5];
    Random rand = new Random();
    int max = 100;
    int min = -100;
    ArrayList<Integer> negative = new ArrayList<>();


    public void method1() {

        a = rand.nextInt(max - min + 1) + min;
        b = rand.nextInt(max - min + 1) + min;
    }

    public void method2() {
        int maximum = Math.max(a, b);
        int minimum = Math.min(a, b);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rand.nextInt(maximum - minimum + 1) + minimum;


            }
        }
        System.out.println(Arrays.deepToString(m));
    }

    public void method3() {
        int last = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                Arrays.sort(m[j]);
                if (m[i][j] < 0) {
                    last = m[i][j];
                }

            }
            negative.add(last);

        }
        System.out.println(negative);

    }

    public void method4() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Index:" + "   " + "[" + i + "]" + "[" + j + "]" + "Value:" + "    " + m[i][j]);
            }
        }

    }

    public void method5() {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

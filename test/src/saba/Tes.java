package saba;

import java.util.Arrays;

public class Tes {
    int a[] = new int[6];

    public void Method1(){
        a = new int[]{1, 2, 3, 4, 5};
        for (int i :a){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(a));
    }


}

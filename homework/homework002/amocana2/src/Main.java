import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.HashSet;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        String m[] = new String[100];
        HashSet<String> set = new HashSet<String>();


        try{
            BufferedReader rd= new BufferedReader(new FileReader("S:\\function.txt"));

            String line = null;
            while ((line=rd.readLine())!=null){
                set.add(line);


            }

            rd.close();
            m = set.toArray(m);

            int size = m.length;
            double [] arr = new double [size];
            for(int i=0; i<size; i++) {
                arr[i] = Double.parseDouble(m[i]);
            }
            Arrays.sort(arr);

            System.out.println("Max Value is"+" " +arr[1]);
            System.out.println("Min Value is"+" "+arr[99]);

        }catch(Exception e){
            System.out.println(e);
        }





    }

}

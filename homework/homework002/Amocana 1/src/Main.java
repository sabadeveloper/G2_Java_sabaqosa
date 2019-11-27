import java.io.FileWriter;
import java.text.*;

public class Main {
    public static void main(String[] args){
        double x;
        double y;
        for (x=1.0; x<2.01;x+=0.01){
            double z=x*x+2*x+3;
           ;


            try{
                //DecimalFormat num = new DecimalFormat("#.##");
                //num.format(z);
                FileWriter fw=new FileWriter("S:\\function.txt",true);
                fw.write(String.format("%.2f",z)+"\n");
                fw.close();
            }catch(Exception e){System.out.println(e);}


        }


    }

}

package saba;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FamilyBudget {
    private int money=0;

    public void setbudget(){
        Scanner input = new Scanner(System.in);
        System.out.println("მიანიჭე ხელფასი:");
        money = input.nextInt();
        Bugetcondition();

    }

    public void changebudget(int amount){
        money += amount;
        Bugetcondition();


    }

    public int getbudget(){
        Bugetcondition();
        return money;

    }
     public String Bugetcondition() {
             if (money >= 40000) return "მდიდარი ხარ შვილო";
             else if (money >= 10000 && money <= 40000) return "საშუალო ფენის ხარ";
             else {
                 return "ღარიბი ხარ";
             }

     }

        public void saveBudget(){
             try {
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("budget.txt", false));

                 bufferedWriter.write("შენი ფული შეადგენს: "+getbudget()+"\n"+"სტატუსი კი: "+Bugetcondition());

                 bufferedWriter.close();
             } catch (IOException error) {
                 error.printStackTrace();
             }
         }

     }



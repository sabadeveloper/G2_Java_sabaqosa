package saba;

import java.io.FileWriter;

public class FamilyMember {
    private String name, lastName, status;
    private int age;

    public  FamilyMember(String name, String lastName, int age, String status) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
    }

    public void WriteinFile(){

        try {
            FileWriter file = new FileWriter("family.txt",false);
            file.write("name= "+name+"\n"+"lastname= "+lastName+"\n"+"age= "+age+"\n"+"status"+status);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int  getmoneyfromBudget(FamilyBudget familyBudget,int request){
        if(request< familyBudget.getbudget())return  familyBudget.getbudget();
       else return request;


    }
}

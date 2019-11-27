package saba;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FamilyBudget familyBudget = new FamilyBudget();
        FamilyMember familyMember = new FamilyMember("საბაs","ქოსაშვილი",20,"დასაოჯახებელი");
        //familyBudget.setbudget();

        //familyBudget.changebudget(20000);
       // familyBudget.changebudget(-5000);

        familyBudget.saveBudget();

        familyMember.WriteinFile();

    }
}

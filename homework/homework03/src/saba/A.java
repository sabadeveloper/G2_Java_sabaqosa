package saba;

import java.util.*;

public class A {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    /*1. ჩაწერეთ კოლექციაში თორმეტი შემთხვევითი მთელი რიცხვი. წაშალეთ ლუწ
    ინდექსიანი ელემენტები. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია
    ზრდადობით.*/
    public void method1() {
        ArrayList array = new ArrayList();
        ArrayList array_two = new ArrayList();

        System.out.println("Please input first number: ");
        int a = input.nextInt();
        System.out.println("Please input second number: ");
        int b = input.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
      /*აქ გადავწყვიტე, რომ ასე მარტივად მემოქმედა: რადგან გვინდოდა ლუწ ინდექსიანები ამოგვეგდო, ვხვდებოდი პრობლემას როცა ინდექსები ირეოდა,
	ამიტომ კენტ ინდექსიანები ცალკე ერეილისტში ჩავყარე და ამოცანაც შესრულდა */
        for (int i = 0; i < 12; i++) {
            int random_number = rand.nextInt(max - min + 1) + min;
            array.add(random_number);
            if (i % 2 != 0) array_two.add(array.get(i));


        }
        System.out.println("Initial Colletion: " + array);
        System.out.println("Received Collection: " + array_two);
        Collections.sort(array);
        System.out.println("Initial Collection(sorted): " + array);
        Collections.sort(array_two);
        System.out.println("Received Collection(sorted): " + array_two);

    }

    /*2. ჩაწერეთ კოლექციაში თორმეტი შემთხვევითი მთელი რიცხვი [5, 10] შუალე-
      დიდან. დაამატეთ ასევე შემთხვევითი რიცხვები ყოველი სამის ჯერადი ინდექსის
      შემდეგ [20, 25] შუალედიდან. დაბეჭდეთ თავდაპირველი და მიღებული კოლექ-
      ცია.*/

    public void method2() {
        ArrayList array = new ArrayList();
        for (int i = 0; i < 12; i++) {
            int random_number = rand.nextInt(10 - 5 + 1) + 5;
            array.add(random_number);

        }
        System.out.println("Initial Collection: "+array);
    /*გადავწყვიტე ლინკდ ლისტი ამეღო, რადგან უფრო ოპტიმალური აღმოჩნდა ამ დავალებისთვის. რატომ? იმიტომ, რომ იგი რაიმე ცვლილების დროს
	არ ქმნის ახალ "ლისტს".*/
        LinkedList array_two = new LinkedList(array);
        for (int i =0; i <=array.size(); i+=4) {
            int random_number = rand.nextInt(25 - 20 + 1) + 20;
            array_two.add(i+1,random_number);
        }
        System.out.println("Received Collection: "+array_two);


    }


}


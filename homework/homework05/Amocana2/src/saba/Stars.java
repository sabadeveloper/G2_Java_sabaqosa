package saba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stars {

    Scanner scanner = new Scanner(System.in);

    ArrayList array = new ArrayList();

    public void createStar() throws IOException {
        /*თავიდან მომხმარებელს ვეკითხებით ყველაფრის შესახებ შეიტანოს ინფორმაცია, ვარსკვლავის სახელი კი დაერქმევა ფაილს */
        System.out.print("შექმენი ვარსკვლავი(სახელი): ");
        String starName = scanner.next();
        System.out.print("დიამეტრი :  ");
        String diameter = scanner.next();
        System.out.print("ტემპერატურა :  ");
        String temperature = scanner.next();
        System.out.print("შექმენი პლანეტა : ");
        String planeta = scanner.next();
        System.out.print("დაასახელე ვარსკვლავი რომლის გარშემოც მოძრაობს : ");
        String varskvlavi = scanner.next();
        System.out.print("რა მანძლითაა დაშორებული ვარსკვლავისგან : ");
        String mandzili = scanner.next();
        System.out.print("რა სიჩქარით გადაადგილდება სივრეცეში : ");
        String sichqare = scanner.next();


        FileWriter fileWriter = new FileWriter(starName + ".txt", false);
        fileWriter.write("ვარსკვლავის სახელი: " + starName + "\n");
        fileWriter.write("ვასრკვლავის დიამეტრი: " + diameter + "\n");
        fileWriter.write("ვარსკვლავის ტემპერატურა(ცელსიუსი): " + temperature + "\n");
        fileWriter.write("პლანეტის სახელი: " + planeta + "\n");
        fileWriter.write("ვარსკვლავის სახელი რომლის გარშემოც პლანეტა მოძრაობს: " + varskvlavi + "\n");
        fileWriter.write("მანძილი რომლითაც დაშორებულია პლანეტაა ვარსკვლავისგან(კმ): " + mandzili + "\n");
        fileWriter.write("სიჩქარე რომლითაც პლანეტა გადაადგილდება სივრცეში(კმ/სთ):  " + sichqare + "\n");
        fileWriter.close();


        /*ყოველუ ვარსკვლავის სახელი ვარდება ახალ ფაილში რათა შემდეგ მომხმარებელს შესთავაზოს ვარიანტები, თუ რომელი ვარსკვლავის
        შესახებ აინტერესებს ინფორმაცია, თუ ასეთი ვარსკვლავი არ არსებობს მაშინ თავიდან მოგვიწევს ვარსკვლავის სახელის შეყვანა
         */
        FileWriter file = new FileWriter("Starnames.txt", true);
        file.write(starName+"\n");
        file.close();

        BufferedReader read = new BufferedReader(new FileReader("Starnames.txt"));
        String star;
        System.out.println("----- ბაზაში არსებული ვარკვლავების სახელები ----");
        while ((star = read.readLine()) != null) {
            System.out.println(star+"\n");
            array.add(star);

        }

        System.out.println("*-----*-----*-----*-----*-----*-----*");

        System.out.print("დაასახელე რომელი ვარსკვლავის მონაცემები წამოვიღო : ");
        String output = scanner.next();

        while(!array.contains(output)){
            System.out.println("ასეთი მონაცემი არ არსებობს");
            output = scanner.next();
        }





    /*გამოდის ინფორმაცია იმ ვარსკვლავების შესახებ რომელიც აინტერესებს მომხმარებელს */
        try {
            BufferedReader reader = new BufferedReader(new FileReader(output + ".txt"));
            String data;
            while ((data = reader.readLine()) != null) {

                System.out.println(data);

            }
        } catch (IOException e) {
           // e.printStackTrace();
        }
    }
}






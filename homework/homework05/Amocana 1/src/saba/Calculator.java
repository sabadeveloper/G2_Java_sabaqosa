package saba;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
/*სიმართლე გითხრათ მთელი 2 დღე შევალიე ამ დავალებას თუმცა ვფიქრობ ამჯერად ჩემი შროა ამაო იყო, სამწუხაროდ, ჩემდა სამწუხაროდ
ლოგიკა ვერ ჩავსვი ისე როგორსაც დავალება ითხოვდა. გავაკეთე ისე რომ მხოლოდ ერთ ოპერატორზე მუშაობს ანუ მომხმარებელმა უნდა შეოივანოს ან + ან - ან * ან /
ყველასთვის ცალ ცალკე არღარ ჩამოვწერ იმიტომ რომ split მეთოდში იცვლება მხოლოდ regex პარამეტრი ოპერატორებით.
პირველი მეთოდის შემდეგ დავწერე რამდენიმე მეთოდი Plus და Minus. თიტქოს ვცდილობდი რომ სათითაოდ დამეშალა სტრიქონი, ჯერ პლიუსებისგან დამესპლიტა შემდეგ მინუსებით
და ასე ჩავსულიყავი ბოლოს მხოლოდ რიცხვებზე მაგრამ ლოგიკას ვერ გავწვდი, როგორ დამეკავშირებინა ვერ  მივხვდი. ფაილში ჩაწერა დროსთან  ერთად იდეალურად მუშაობს.
ინტერნეტი ბევრს ჰქონდა ამოხსნილი, თუმცა ძალიან რთული მეთოდებით რაც ვერ გავიგე, ლოგიკაც კი რთული იყო. მირჩევნია ცოტა იყოს და ჩემი გაკეთებული ერქვას და ვიგებდე რასაც ვწერდე
ვიდრე სხვისი და არაფერი მესმოდეს. ამიტომაც დაუსრულებელი გამოვიდა, სამწუხაროდ ვერ შევძელი. */

public class Calculator  {
    Scanner scanner=new Scanner(System.in);
    String input = scanner.next();
    //String s;
    ArrayList numbers = new ArrayList();
    ArrayList numbers2 = new ArrayList();

    public void method1() {

        int result=0;

        String[] par_plus = input.split("\\+");/* მხოლოდ აქ იცვლება ოპერატორები */
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        //System.out.println(formatter.format(date));

        try {
            for(String item : par_plus){
                numbers.add(Integer.parseInt(item));
                result+=Integer.parseInt(item);
            }
        } catch (NumberFormatException e) {
           // e.printStackTrace();
        }
       System.out.println(numbers);
        System.out.println("Result = "+result);

        try {
            FileWriter file = new FileWriter("result.txt",false);
            file.write("Result = " +result+"   Current Time : "+formatter.format(date));
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Plus(){
        String[] par_plus = input.split("\\+");

            for(String item : par_plus){
                numbers.add(item);
            }
            System.out.println(numbers);
    }

    public void Minus(){
        //String[] par_minus = input.split("\\-");
        for(Object item : numbers){
            String itemtoString = item.toString();
            String s = String.valueOf(itemtoString);
            numbers2.add(s.split("\\-"));



        }
        System.out.println(numbers2);

    }



}

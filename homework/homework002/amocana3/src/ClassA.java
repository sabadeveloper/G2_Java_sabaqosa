import java.util.Scanner;
import java.util.Arrays;

public class ClassA implements AInterfaces {
    //აღვწერე long-ით რათა შემდეგ ბოლო მეთოდში გამოვიყენო ან თუნდაც იმისთვის რომ დიდი რიცხვებისთვის
    // იმუშაოს პროგრამამ
    long  a;
    long  b;

    public void Method1(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        //for-ში დაგვჭირდა რომ i ცვლადიც აღგვეწერა long-ით რათა შემდეგ მას ვუტოლებ a და b ცვლადს რაც თავის მხრივ არის long ტიპის
        if (a > b) {
            for(long i=b;b<a-1;b++) {
                System.out.println(b+1);
            }

        }
        else{
            for(long i=a;a<b-1;a++) {
                System.out.println(a+1);
            }
        }

    }

    public void Method2(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }

    }

    public void Method3(){
        Scanner input = new Scanner(System.in);
        b= input.nextLong();
        int sum=0;
        for (int i=1;i<=b;i++){
            if(b%i==0 && isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public  boolean isPrime(int x){
        // ამ მეთდით ვიგებთ შემდეგ რამეს:თუ მარტივი აღმოჩნდება ის რიცხვი რასაც Method3 გადმოგვცემს, მაშინ აღმოჩნდება
        //TRUE-ს და შემდეგ ვაკეთებთ შემდეგ ციკლებს, რაც ქვემოთაა
        //ანუ ამ if-ში ვთვლით და პრინციპში წინასწარ ვიცით რომ 2 და 3 მარტივი რიცხვებია და მაგას პირაპირ ვაბრუნებთ რომ არის false

        if (x<=1){
            return false;
        }

        if (x<=3){
            return true;
        }


        //ამ if-ში მარტივად ჩანს შემდეგი: თუ რიცხვი იყოფა 2 ან 3-ზე უნაშთოდ შესაბამისაც არის შედგენილი და ეგ არ გვაწყობს
        if (x%2==0 || x%3==0){ 
            return false;

        }
    //ამ if-ში მოკლედ რომ დავწეროთ ხდება ის რომ 3-ის მერე ამოწმებს მარტივ რიცხვებს. ანუ 3-ის შემდეგ პირველი მარტივი
        //რიცხვია 5 და ათვლას მანდედან ვიწყებთ და ყველი მეორე და მეექვსე რიცხვი არის მარტივი ანუ 5+2=7 და 5+6=11(აქ უკვე ი=11-ის)
        //და ასე მიყვება და if-ში ამოწმებს თუ უნაშთოდ იყოფა არ გვაწყობს აბრუნებს false-ს და თუ არადა ესე იგი მარტივი გამოდის.
        for(int i=5;i*i<x;i=i+6){
            if (x%i==0 || x%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public void Method4(){
        Scanner input = new Scanner(System.in);
        b = input.nextLong();
        String str = String.valueOf(b);
        //აქ გადავწყვიტე, რომ შემოტანილი რიცხვი დამეყო char-ად და ისე ამომეღო სათითაო ციფრი და ჩამეყარა მასივში

        char arr[] = str.toCharArray();
        int[] D = new int[256];
        int size = arr.length;
        //System.out.println(Arrays.toString(arr));
        //ეს ციკლი ისეა მოწყობილი რომ მთლიანად დაუვლის მასივს და დაბეჭდვის დროს, თუ აღმოჩნდება, რომ რიცხვში
        //ციფრები ერთნაირი რაოდენობით შეგვხვდა, მაგალითად 11223(1 და 2 გვხვდება 2-2-ჯერ). იმისთვის რომ პროგრამამ გაიგოს
        //რომელი დაბეჭდოს უპირატესობას მიანიჭებს იმ ციფრს რომელიც უფრო პატარააა და ასე ვთქვათ წყობით უფრო პირველია. ამ
        //მაგალითში კი დაბეჭდავს 1-ს რადგან ის 2-ზე  პატარა ციფრია. სწორედ ამას უზრუნველყოფს მეორე for ციკლი.
        for(int i=0;i<size;i++)
            if(arr[i]>='0' && arr[i]<='9')D[arr[i]]++;
        char p,j;
        for(p='0',j='1';j<='9';j++)
            if(D[j]>D[p])p=j;
        System.out.println(p);


    }



}


package saba;
    import java.util.*;

    public class A {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        Random rand = new Random();
        ArrayList arrayList = new ArrayList();
        LinkedList arrayList2 = new LinkedList();

        /*1. ჩაწერეთ კოლექციაშიში ხუთი შემთხვევითი მთელი რიცხვი და დაბეჭდეთ.*/
        public void method1(){

            for (int i=0;i<5;i++){
                arrayList.add(rand.nextInt(max-min+1)+min);
            }
            System.out.println(arrayList);

        }

        /*2. ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაბეჭდეთ პირდაპირი
    და შებრუნებული რიგით.*/
        public void method2(){

            for (int i=0;i<5;i++){
                arrayList.add(rand.nextInt(max-min+1)+min);
            }
            System.out.println(arrayList);
            Collections.reverse(arrayList);
            System.out.println(arrayList);

        }

        /*3. ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაალაგეთ ზრდადო-
        ბით და დაბეჭდეთ. */
        public void method3(){

            for (int i=0;i<5;i++){
                arrayList.add(rand.nextInt(max-min+1)+min);
            }
            Collections.sort(arrayList);
            System.out.println(arrayList);


        }

        /*4. ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაალაგეთ კლებადო-
        ბით და დაბეჭდეთ.*/
        public void method4(){
            for (int i=0;i<5;i++){
                arrayList2.add(rand.nextInt(max-min+1)+min);
            }
            Collections.sort(arrayList2);
            Collections.reverse(arrayList2);
            System.out.println(arrayList2);

        }

        /* 5.ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. ჩაამატეთ ბოლოში სამი
        შემთხვევითი რიცხვი. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია. */
        public void method5(){
            for (int i=0;i<5;i++){
                arrayList2.add(rand.nextInt(max-min+1)+min);
            }
            System.out.println(arrayList2);
            for(int j=0;j<3;j++){
                arrayList2.add(arrayList2.size()-1,(rand.nextInt(max-min+1)+min));
            }
            System.out.println(arrayList2);


        }

        /*6.ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. ჩაამატეთ შემ-
თხვევითი რიცხვები ყოველი მომდევნო ინდექსის შემდეგ. დაბეჭდეთ თავ-
დაპირველი და მიღებული კოლექცია. */
        public void method6(){
            for (int i=0;i<5;i++){
                arrayList2.add(rand.nextInt(max-min+1)+min);
            }
            System.out.println(arrayList2);
            for(int j=0;j<3;j+=2){
                arrayList2.add(j+1,(rand.nextInt(max-min+1)+min));
            }
            System.out.println(arrayList2);
        }

      /*  7. ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. ჩაამატეთ შემთხვევითი
        რიცხვი კლავიატურიდან შეტანილი n ინდექსის შემდეგ. დაბეჭდეთ თავდაპირვე-
        ლი და მიღებული კოლექცია.
*/
      public void method7(){
          Scanner input1 = new Scanner(System.in);
          int n = input1.nextInt();
          for (int i=0;i<5;i++){
              arrayList2.add(rand.nextInt(max-min+1)+min);
          }
          System.out.println(arrayList2);
          arrayList2.add(n+1,rand.nextInt(max-min+1)+min);
          System.out.println(arrayList2);

      }

      /*8.ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. წაშალეთ პირველი 3
რიცხვი. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია.*/
      public void method8(){
          for (int i=0;i<5;i++){
              arrayList2.add(rand.nextInt(max-min+1)+min);
          }
          System.out.println(arrayList2);

          for(int j=0;j<3;j++){
              arrayList2.remove(j);
          }
          System.out.println(arrayList2);
      }

      /*9.ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. წაშალეთ კლავიატუ-
რიდან შეტანილი n ინდექსზე მდგომი ელემენტი. დაბეჭდეთ თავდაპირველი და
მიღებული კოლექცია.*/
      public void ethod9() {
          Scanner input1 = new Scanner(System.in);
          int n = input1.nextInt();
          for (int i = 0; i < 5; i++) {
              arrayList2.add(rand.nextInt(max - min + 1) + min);
          }
          System.out.println(arrayList2);
          arrayList2.remove(n);
          System.out.println(arrayList2);
      }
      /*10. ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. წაშალეთ ლუწ
        ინდექსიანი ელემენტები. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია.*/
      public void method10(){
          for (int i = 0; i < 5; i++) {
              arrayList2.add(rand.nextInt(max - min + 1) + min);
          }
          System.out.println(arrayList2);
          for(int j=0;j<arrayList2.size();j++){
              if(j%2==0)arrayList2.remove(j);
          }
          System.out.println(arrayList2);
      }
      /*11. ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. წაშალეთ 30-ის ტოლი
ელემენტები. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია.*/
      public void method11(){
          for (int i = 0; i < 5; i++) {
              arrayList2.add(rand.nextInt(max - min + 1) + min);
          }
          System.out.println(arrayList2);
          for(int j=0;j<arrayList2.size();j++){
              if(j%2==0)arrayList2.remove(j);
          }

          System.out.println(arrayList2);
      }
      /*12. ჩაწერეთ კოლექციაში 20 შემთხვევითი მთელი რიცხვი. გადაწერეთ ახალ
კოლექციაში 7-დან 15-მდე ინდექსებში მდგომი ელემენტები. დაბეჭდეთ ორივე
კოლექცია.*/
      public void method12(){
          ArrayList arrayList3 = new ArrayList();
          for (int i = 0; i < 20; i++) {
              arrayList2.add(rand.nextInt(max - min + 1) + min);
          }
          System.out.println(arrayList2);

          for(int j=7;j<15;j++){
              arrayList3.add(arrayList2.get(j));
          }
          System.out.println(arrayList3);

      }

      /*13. ჩაწერეთ კოლექციაში 5  10 სიმბოლოიანი სტრიქონი. გადაწერეთ
ახალ კოლექციაში ყველა ის ელემენტი, რომელიც შეიცავს ‘x’ სიმბოლოს.დაბეჭდეთ ორივე კოლექცია.*/
      public void method13(){
          ArrayList<String> list=new ArrayList<String>();
          ArrayList list2 = new ArrayList();
          list.add("xinwdoqnqo");
          list.add("pnwonqwpmq");
          list.add("dmsxnfbwod");
          list.add("wfoiwnonww");
          list.add("xsowfnwonw");
          System.out.println(list);
          for (String  i : list){
              for (int j=0;j<i.length();j++){
                  //System.out.println(list.get(j));
                if(i.charAt(j)=='x')list2.add(i);
              }
          }
          System.out.println(list2);
      }
    }

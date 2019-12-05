package saba;

/*პირველ რიგში მინდა ავღნიშნო, რომ დაკომენტარებული რაც არ მაქვს ეგ პროგრამა ასრულებს ძირითად დავალებას სრულყოფილად
ანუ ბონუსის გარეშე ვგულისხმობ. ხოლო დაკომენტარებულიანად კი ბონუს დავალებასაც.(კი ვიცი შეიძლება ამ ბონუს დავალებისთვის
ლოგიკა ძალიან ცუდი გამოვიდა მეც ვატყობ, რომ ასე მაგრამ მაქსიმუმი ჩავდე ამ საქმეში და ისე გამოვიდა როგორც არის(კარგიც
ეს გამოვიდა და ცუდიც :)   */


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Generator implements  GeneratorIterface {
    String defaultParameters = "p-2-4-s-2-5-w-2-5";
    boolean wronginput = false;

    private Hashtable alphabet;/*დიქშინარის ვარიანტი */
    private String language;
    private String parameters;
    private ArrayList param;
    Random random = new Random();

    public Generator(String language, String parameters) {
        this.language = language;
        this.parameters = parameters;
        param = new ArrayList();
        alphabet = new Hashtable();
    }

//    public String checkParameters(String parameters){
//        /*შეიძლება ითქვას რომ ძირითად დავალებას სრულყოფილად  ასრულებს. ანუ როცა ფორმატი არის სწორი მაგ.p-2-4-s-2-5-w-2-5
//        ამ დროს პროგრამა უპრობლემოდ მუშაობს.რაც შეეხება ბონუსს,ბევრი ვეცადე, ვეწვალე და მუშაობს ასე:ვთქვათ იმ შემთხვევაში
//        როცა მომხარებელი აკლებს რიცხვს ან რიცხვებს მაგალითად:p--4-s-2-5-w-2-5.აი ამ მაგალითში პროგრამა დეფაულტად
//        ჩასვამს 5-იანს. ანუ ლოგიკა მუშაობს ასე: თუ შეხვდა ზედიზედ 2 ცალი"-"(დეფისი), მაშინ მათ შორის ჩასვას სტრინგად "5",
//        რომელიც შემდეგ ჩვეულებრივ გაიპარსება parseStringToArray() მეთოდის საშუალებით. */
//
//        for(int i=0;i<parameters.length()-1;i++){
//            if(parameters.charAt(i) == parameters.charAt(i+1) && parameters.charAt(i)=='-'){
//                parameters=parameters.substring(0,i+1)+"5"+parameters.substring(i+1,parameters.length());
//            }
//
//        }
//        return parameters;
//    }

//    public String secondChecker(String parameters) {
//        /*აქ ხდება შემდეგი: რეალურად ეს checkParameters()-ის გაგრძელებაა.პირველ if-ში მოწმედება რომ მომხმარებელი
//        თუ სწორად შემოიყვანს მაშინ parameters გაუტოლდეს შემოტანილ parameters-ს და შემდეგ გაიპარსოს. ანუ აქ ყველა ის
//        შემთხვევაა განხილური ამ if-ში როცა შემოტანილი მონაცემი არის სწორი. ანუ ამოწმებს სიგრძეს. ანუ ხომ შეიძლება
//        მომხმარებელმა ორციფრიანი რიცხვი მიუთითოს, ამიტომაც შეძლებისდაგვარად ესგეც გათვალისწინებულია.კი ანუ შეიძლება
//        რომ ისეთი რამე შემოიტანოს მომხმარებელმა რომ სიგრძე 17-22-ის ჩათვლით ყველაფერი იყოს და თითქოსდა ეს სწორად
//        იმუშავებს მაგრამ პარსვის დროს ამოუგდებს შეცდომას.
//         */
//        for (int i = 0; i < parameters.length(); i++) {
//            if (parameters.length() == 17 || parameters.length() == 18 || parameters.length() == 19 ||
//                    parameters.length() == 20 || parameters.length() == 21 || parameters.length() == 22)
//                parameters = parameters;
//            else {
//                parameters = defaultParameters;
//                wronginput = true;
//            }
//        }
//        return parameters;
//    }




    public void parseStringToArray() {
        //parameters = checkParameters(parameters);
        //arameters=secondChecker(parameters);

        String[] par = parameters.split("-");
        for (String item : par) {
            try {
                param.add(Integer.parseInt(item));
            } catch (NumberFormatException e) {
                //e.printStackTrace();
            }
        }
    }



    public String generateAlpha(char startSymbol, char endSymbol) {
        String alphabet = "";
        for (int i = (int) startSymbol; i <= (int) endSymbol; i++) {
            alphabet += (char) i;
        }
        return alphabet;


    }


    public void generateAlphabet() {

        alphabet.put("ge", generateAlpha('ა', 'ჰ'));
        alphabet.put("en", generateAlpha('a', 'z'));
        alphabet.put("ru",generateAlpha('а','я'));
        //System.out.println(alphabet);

    }


    public char generateRandomChar() {
        String a = alphabet.get(language).toString();
        char symbol = a.charAt(random.nextInt(a.length()));
        return symbol;


    }


    public String generateRandomWord() {
        int a=(int)param.get(4);
        int b=(int)param.get(5);
        int word_min_number =Math.min(a,b);
        int word_max_number = Math.max(a,b);
        String word = "";
        int rand = random.nextInt(word_max_number - word_min_number + 1) + word_min_number;
        for (int j = 0; j < rand; j++) {
            word += generateRandomChar();
        }
        return word;
    }

    public void generateRandomSentence() {
        int a=(int) param.get(0);
        int b=(int) param.get(1);
        int c=(int)param.get(2);
        int d=(int)param.get(3);
        int e=(int)param.get(4);
        int f=(int)param.get(5);
        int sentenese_number_min= Math.min(a,b);
        int sentenese_number_max=Math.max(a,b);
        int word_min_number_sentense =Math.min(c,d);
        int word_max_number_sentense =Math.max(c,d);
        int word_min_number = Math.min(e,f);
        int word_max_number = Math.max(e,f);
        int rand=random.nextInt(sentenese_number_max-sentenese_number_min+1)+sentenese_number_min;

        for(int i=0;i<rand;i++) {
            String sentence = "";
            int rand_word = random.nextInt(word_max_number_sentense - word_min_number_sentense + 1) + word_min_number_sentense;
            for (int j = 0; j < rand_word; j++) {
                sentence += generateRandomWord() + " ";

            }

            System.out.println(sentence);

            }
//        if(wronginput){
//            System.out.println("Thi sentences was generated by default parameters,beacause input parameters was wrong");
//        }

    }

}
import java.util.ArrayList;
import java.util.Scanner;

public class Ch1_Practice_set {
    public static void main(String[] args) {
        // Question1
//        int a = 4;
//        int b = 17;
//        int c = 6;
//        int sum = a +b+c;
//        System.out.println(sum);
//
        //   Question2
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 49;
        float cgpa = (subject1 + subject2 + subject3) / 30;
        System.out.println(cgpa);

        // Question3
        //  System.out.println("what is your name?");
        //  Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        //   System.out.println("Hello" + name + "have a good day");


        //create string
        String first = "java";
        String second = "python";
        String third = "java script";

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


        String greet = "Hello! Shalini";
        System.out.println("string:" + greet);
        //Length of string
        int length = greet.length();
        System.out.println("length :" + length);

        String s1 = "Shalini";
        System.out.println("string s1 :" + s1);
        String s2 = "Biswas";
        System.out.println("string s2:" + s2);
        // joined two string
        String joinedstring = s1.concat(s2);
        System.out.println(" Joined string :" + joinedstring);

        String f1 = "java programming";
        String f2 = "java programming";
        String f3 = "python programing";
        // compare two string
        boolean result1 = f1.equals(f2);
        System.out.println("f1 is equal to f2:" + result1);

        boolean result2 = f1.equals(f3);
        System.out.println("f1 is equal to f3:" + result2);

       /* String one = "Shalini Biswas";
        String two = "Shalini";
        String three = "oni Biswas";
        if (one.contains(two)) ;{
            System.out.println(one + "contains" + two);
        }else{
            System.out.println(one + "dose not contains" + two);
        }
        if (one.contains(three)) ;{
            System.out.println(one + "contains" + three);
        }else{
            System.out.println(one + "dose not contains" + three);
        }*/
        String str1 = "Shalini";
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(0,  3));
        System.out.println(str1.substring(3,  5));


        ArrayList<String> text = new ArrayList<>();
        text.add("java");
        text.add("is");
        text.add("fun");
        String result;
        result = String.join("-", text);
        System.out.println(result);

        String str2 = "My name is Shalini";
        int res = str2.indexOf('a' , 7);
        System.out.println(res);

        String str3 = "java programming";
        result = str3.toUpperCase();
        System.out.println(result);


    }

}

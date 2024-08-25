import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OddPalindromeChecker {

    public static boolean isOddPalindrome(String str) {
        if (str == null || str.length() % 2 == 0) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static boolean oddPalindromeOrNot(String str) {

        int left1;
        int right1;

        if (str.length() % 2 == 0) {
            left1 = 1;
            right1 = str.length() - 1;
        } else {
            left1 = 1;
            right1 = str.length() - 2;
        }
        while (left1 < right1 && right1 >= 0 && left1 < str.length()) {
            if (str.charAt(left1) == str.charAt(right1)) {
                return true;
            }
            left1++;
            right1--;
        }
        return false;
    }

    public static boolean validAnagram(String str1, String str2) {


        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for (int i = 0; i < str1.length(); i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;

            }

        }
        return true;


    }

    public static String removeConsecutiveDuplicate(String input) {
        if (input.length() <= 1)
            return input;

        if (input.charAt(0) == input.charAt(1)) {
            return removeConsecutiveDuplicate(input.substring(1));
        } else {
            return input.charAt(0) + removeConsecutiveDuplicate(input.substring(1));
        }
    }

    public static String removeDuplicate(String input) {

        Set<Character> character = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!character.contains(c)) {
                character.add(c);
                result.append(c);
            }
        }
        return result.toString();


    }

    public static String removeDuplicateWords(String str) {
        String[] words = str.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        return String.join(" ", uniqueWords);


    }

    public static void evenLengthWords(String input) {
        for (String even : input.split(" ")) {
            if (even.length() % 2 == 0) {
                System.out.println(even);
            }

        }

    }
    public static void countLetter(String str) {
        char[] ch = str.toCharArray();
        int i;
        for (i = 0; i < ch.length; i++) ;

        String s = "";
    }


    public static void main(String[] args) {
        String ts1 = "osafdfgsg";
        String ts2 = "level";
        String ts3 = "Dona";
        String ts4 = "aeafacafae";


        System.out.println("Is ts1 oddPalindrome" + isOddPalindrome(ts1));
        System.out.println("Is ts2 oddPalindrome" + isOddPalindrome(ts2));
        System.out.println("Is ts3 oddPalindrome" + isOddPalindrome(ts3));
        System.out.println(oddPalindromeOrNot(ts4));

        String tr1 = "Gram";
        String tr2 = "ram";
        System.out.println("Is valid anagram" + " " + validAnagram(tr1, tr2));

        String s = "aabbbcc";
        String s1 = "doonaa";
        System.out.println("Remove consecutive " + " " + removeConsecutiveDuplicate(s));
        System.out.println("Remove consecutive " + " " + removeConsecutiveDuplicate(s1));
        System.out.println(("Remove duplicates" + " " + removeDuplicate(s1)));

        String t = "This is a test test String with with duplicate words string test";
        System.out.println(removeDuplicateWords(t));

        String str = "Helloo Shalini";
        evenLengthWords(str);

        String a = "1010";
        String a1 = "2335";
        int sum = Integer.parseInt(a) + Integer.parseInt(a1);
        System.out.println(sum);

        String word = "Welcome to Java world";
        String[] splitArray = word.split(" ");
        for (int i = splitArray.length - 1; i >= 0; i--) {
            System.out.println(splitArray[i]);
        }
        String string = "My name is Shalini";
        String[] r = string.split(" ");
        System.out.println(r.length);

        String name1 = "Shalini";
        String name2 = "Suparno";
        for(int i = 0; i < name1.length();i++){
            if(name1.charAt(i)!=name2.charAt(i)){
                System.out.println("Not equal");
            }else{
                System.out.println("It is equal");
            }
        }
        String number = "091-123456";
        String [] n = number.split("-");
        for(String nom : n){
            System.out.println(nom);
        }
        String str1 = "Hello world";

    }


}






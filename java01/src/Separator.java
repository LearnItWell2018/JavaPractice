import java.util.*;

public class Separator {
    public static void splitString(String str) {
        StringBuffer alpha = new StringBuffer();
        StringBuffer special = new StringBuffer();
        StringBuffer digit = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                alpha.append(str.charAt(i));
            } else if (Character.isDigit(str.charAt(i))) {
                digit.append(str.charAt(i));

            } else {
                special.append(str.charAt(i));
            }

        }
        System.out.println(alpha + " ");
        System.out.println(digit);
        System.out.println(special);

    }

    public static String largestString(String[] str1) {
        int maxi = 0;
        String result = " ";
        for (String word : str1) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                set.add(word.charAt(i));
            }
            if (set.size() > maxi) {
                maxi = set.size();
                result = word;

            }

        }

        return result;

    }

    public static String firstRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return Character.toString(str.charAt(i));
                }
            }
        }
        return "-1";
    }


    public static void main(String[] args) {

        String str = "We live in Ivy botanica; Flat no. E602, we are tenants living here for 6 months in a 2 bhk flat. We have 2 balconies with 4 flower pots. My email id : shalinibsws@gmail.com. and phone no - 9593947288";


        str = str.replaceAll(";", " ");
        str = str.replaceAll(",", " ");
        str = str.replaceAll("\\.", " ");
        str = str.replaceAll(":", " ");
        String[] s = str.split(" ");


        List<String> wordList = Arrays.asList(str);
        for (String sen : wordList) {
            System.out.print(sen);
        }


        splitString(str);

        //Find upper case, lower case, number nad special character in a string.
        int upper = 0, lower = 0;
        int number = 0;
        int special = 0;
        for (
                int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upper++;

            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lower++;

            } else if (str.charAt(i) >= 0 && str.charAt(i) <= 9) {
                number++;

            } else {
                special++;
            }

        }
        System.out.println("Upper case" + " " + upper);
        System.out.println("lower case" + " " + lower);
        System.out.println("Number" + " " + number);
        System.out.println("Special Character" + " " + special);

        String[] str1 = new String[]{"I am a girl", "Nutritionist", "Coder"};
        System.out.println(largestString(str1));

        firstRepeating(str);


    }
}


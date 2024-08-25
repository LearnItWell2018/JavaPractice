import java.util.*;

public class StringDemo {

    public boolean method1(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
            if (ch >= 'A' && ch <= 'Z') {
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }

        }
        return set.size() == 26;
    }

    public static void printPrime(int x) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 3; i <= x; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }

            }
            if (isPrime) {
                primeList.add(i);
            }


        }
        System.out.println(primeList);


    }


    public static void main(String[] args) {
        printPrime(1000);

       /* String name = "Oni";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

        if (name.equals(rev)) {
            System.out.println("Palindrome strings");
        } else {
            System.out.println("Not palindrome strings");
        }

        String str = "The quick brown fox jump over the lazy dog";

        StringDemo sd = new StringDemo();
        if (sd.method1(str)) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not pangram");
        }
        String num = "7256";
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.charAt(i) - '0'; j++) {
                System.out.print((int) num.charAt(i));

            }
            System.out.println();


        }
        String letter1 = "LAPTOUCH";
        String letter2 = "UCTOPA";
        char[] letter = letter1.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < letter.length; i++) {
            hm.put(letter[i], i);

        }
        System.out.println(hm);

        char[] word = letter2.toCharArray();
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < hm.get(word[i]); j++) {
                System.out.print(word[i]);
            }
            System.out.println();

        }*/



       /* String number = "2 3 1 4 8 4 3 7 9";
        String[] string = number.split(" ");
        System.out.println(Arrays.toString(string));
        Integer[] arr = new Integer[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer num : arr) {
            System.out.println(num.toString());
        }


        String numb = "2 3 1 4 8 4 3 7 9";
        String[] input = numb.split(" ");
        int[] array = new int[input.length];
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            array[i] = Integer.parseInt(string[i]) ;
            if (array[i] > array[max]) {
                max=i;
                System.out.println(Arrays.toString(array));
            }*/


    }


}




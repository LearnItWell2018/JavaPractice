import java.util.*;

public class Strings {


    public static void main(String[] args) {

        String input = "We live in Ivy botanica; Flat no. E602, we are tenants living here for 6 months in a 2 bhk flat. We have 2 balconies with 4 flower pots. ";
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed string" + " " + reversed);


        input = input.replaceAll("\\.", "");

        input = input.replaceAll(";", "");

        input = input.replaceAll(",", "");

        String[] words = input.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
       for(Map.Entry<String,Integer> entry : wordCountMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
    }


    HashSet<Integer> lengthsOfAllWords = new HashSet<>();

        for(String word :words)

    {
        lengthsOfAllWords.add(word.length());
    }

    HashMap<Integer, ArrayList<String>> masterList = new HashMap<Integer, ArrayList<String>>();

        for(Integer length :lengthsOfAllWords)

    {
        masterList.put(length, new ArrayList<String>());
    }

        for(
    String word :words)

    {
        ArrayList<String> wordOfSpecificLength = masterList.get(word.length());
        wordOfSpecificLength.add(word);
        masterList.put(word.length(), wordOfSpecificLength);
    }

        System.out.println(masterList);

        HashMap<String,Integer> findDuplicates = new HashMap<>();
        for(String dup : words){
            findDuplicates.put(dup, findDuplicates.get(dup)+1);
        }
        for(Map.Entry<String,Integer> entry : findDuplicates.entrySet() ){
            if(entry.getValue()>1){
                System.out.println("Words" + entry.getKey() + entry.getValue());

            }
        }


}

public void method() {
    String str = "My name is Shalini";
    int size = str.length();
    System.out.println(size);
    String[] arrOfStr = str.split(" ");
    for (String a : arrOfStr) {
        System.out.println(a + "-" + a.length());

    }

    str = str.replaceAll("a", " ");
    str = str.replaceAll("e", " ");
    str = str.replaceAll("i", " ");

    System.out.println(str);


}


    }















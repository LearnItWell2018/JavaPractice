import java.util.*;

public class DuplicateArrays {


    public static void main(String[] args) {
        String input = "My name is Shalini Biswas. I live in Ivy Botanica, pune. My flat num is E602. I am shy by nature. My parents are staying with me.";
        String[] words = input.split(" ");
        Map<String, Integer> duplicate = new HashMap<>();
        for (String word : words) {
            if (duplicate.get(word) != null) {
                duplicate.put(word, duplicate.get(word) + 1);

            } else {
                duplicate.put(word, 1);
            }


        }
        for (Map.Entry<String, Integer> entry : duplicate.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        Integer[] OriginalArray = {1, 2, 4, 5, 6};
        int newElement = 3;
        int newPosition = 2;
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(OriginalArray));
        arrayList.add(newPosition, newElement);

        Integer[] newArray = arrayList.toArray(new Integer[0]);
        System.out.println("After insertion of element" + ":" + Arrays.toString(newArray));


        int index = 4;
        for (int i = 0; i < OriginalArray.length; i++) {
            if (index == OriginalArray[i]) {
                for (int j = i; j < OriginalArray.length; j++) {
                    OriginalArray[j] = OriginalArray[j + 1];
                }
                
            }
        }
        for (int i = 0; i < OriginalArray.length - 1; i++) {
            System.out.println(OriginalArray[i]);
        }


    }
}

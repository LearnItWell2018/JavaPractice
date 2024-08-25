import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Arraylist<S> {

    public S add;

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
    private static boolean containsIgnoreCase(ArrayList<String> list, String soughtFor) {
        for (String current : list) {
            if (current.equalsIgnoreCase(soughtFor)) {
                return true;
            }
        }
        return false;
    }
    public static void getMaxMin(ArrayList<Integer> list){
        if(list!=null && !list.isEmpty()){
            if(list.get(0)< list.get(list.size()-1)){
                System.out.println("Maximum value is" + list.get(list.size()-1)); // if the list is in increasing order.
                System.out.println(("minimum value is " + list.get(0)));
            }else {
                System.out.println(("Minimum value" + list.get(list.size()-1)));
                System.out.println("Maximum value" + list.get(0));
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 2, 1, 3, 4, 5, 4, 5, 6, 7, 9, 9));
        System.out.println("Integer List with Duplicates value" + list);

        System.out.println(list.size());

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("Integer List without duplicate values" + newList);


        String s = "My name is Shalini Biswas. Shalini is my name and Biswas is my surname.";
        String [] words = s.split(" ");
        ArrayList<String> list1 = new ArrayList<String>();
        for (String dup : words) {
            boolean t = containsIgnoreCase(list1,dup);

            if (!t) {
                list1.add(dup);
            }

        }
        System.out.println(list1);
        ArrayList<Integer> arr = new ArrayList<>(9);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(5);
        arr.add(7);
        int element = arr.lastIndexOf(5);
        if(element != -1){
            System.out.println("Last index of 5 is" + element);
        }else{
            System.out.println("Element is not present");
        }
        System.out.println("The numbers are");
        ListIterator <Integer> it = arr.listIterator(1);
        while(it.hasNext()){
            System.out.println( it.next());
        }
        getMaxMin(arr);




    }
}

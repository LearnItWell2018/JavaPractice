import java.util.HashSet;

public class sorting {
    public static void printArray(int array[]) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }
    public static void findDuplicate(int [] array){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(Integer elements : array){
            if(!set.add(elements)){
                duplicates.add(elements);
            }
        }
        System.out.println("Duplicate elements" + ":" + duplicates);
    }


    public static void main(String[] args) {
        int[] array = {7, 9, 12, 15, 17};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { //swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        printArray(array);

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("maximum element" + ":" + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum element" + ":" + min);

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int numbers : array) {
            if (numbers > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers;

                }else if (numbers > secondLargest && numbers != firstLargest) {
                    secondLargest = numbers;
                }
            }
            if(secondLargest==Integer.MIN_VALUE){
                System.out.println("There is no second largest");
            }else {
                System.out.println("the second largest element is" + " " + secondLargest);
                System.out.println("The largest element is " + " " + firstLargest);
            }
            int [] arr = {1,2,3,1,5,6,5,2,7};
            findDuplicate(arr);
        }
    }

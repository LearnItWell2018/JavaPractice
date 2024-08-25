public class SelectionSort {


    public static void main (String[]args){
        String [] a = { "Shalini", "Sounak", "Suparna", "Goutam"};
        System.out.println("Print unsorted array");
        printArray(a);

        selection(a);

        System.out.println("Print sorted array");
        printArray(a);
    }



    public static void selection(String [] arr){

        String temp;
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                int min = i;
                if(arr[j].compareTo(arr[min])<0){
                    min = j;

                }
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }
    }

    public static void printArray(String []arr){
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}

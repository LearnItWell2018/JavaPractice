import org.w3c.dom.ls.LSOutput;

public class BubbleSort {

    public static void main (String []args){
        int []a = { 50,45,40,35,30};
        System.out.println("Unsorted array");
        printArray(a);

        bubbleSort(a);

        System.out.println("sorted array");
        printArray(a);
    }

    public static void bubbleSort(int []arr){
        int n = arr.length;
        for(int i=0; i <= n-1;i++){
            for(int j=0; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void printArray(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}

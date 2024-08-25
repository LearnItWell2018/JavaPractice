public class MergeSort {
    public static void sort(int[]arr,int right,int left){
        if(left <right){
            int mid = left+(right-left)/2;

             sort(arr, left,mid );
             sort(arr, right,mid+1);

             merged(arr,left,right,mid);
        }
    }
    public static void merged(int[]arr, int right, int left,int mid){
      //size of two sub arrays to be merged.
        int n1 = mid-left+1;
        int n2 = right-mid;

        //create temporary array.
        int []leftArray = new int[n1];
        int[] rightArray = new int[n2];
        // copy data to temporary array

        for(int i = 0; i <n1;++i) {
            leftArray[i] = arr[left + i];
        }
        for(int j =0; j <n2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int i = 0; int j=0;
        int k = left;

        while (i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;

            }else {
                arr[k]= rightArray[j];
                j++;
            }
            k++;
        }
        //copy remaining elements of leftArray
        while (i<n1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }




    }
    public static void printArray(int []arr){
        for(int i = 0; i < arr.length;++i)
            System.out.print(arr[i] + " ");
            System.out.println();



    }






























    public static void main(String[] args){
        int[] arr ={6,3,9,5,8,10};
        int n = arr.length;

        System.out.println("Given array");
        printArray(arr);

        MergeSort ob = new MergeSort();

       sort(arr,0, arr.length-1);



        System.out.println("sorted array");
        printArray(arr);

    }
}

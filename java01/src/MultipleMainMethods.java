public class MultipleMainMethods {

    public static void main(String [] args){
        System.out.println("Inside main 1");
        main("");
        main(1);
    }

    public static  void main(String args ){
        System.out.println("Inside main 2");
    }

    public static int main(int args){
        System.out.println("Inside main 3");
        return 0;
    }
    //so we can create multiple main method by method overloading.
}

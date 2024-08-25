import java.util.Scanner;

public class Solutions {


    public static void main(String[] args) {
      /*  int positive = 0; int negative = 0; int zeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue and press 0 to stop");
        int input = sc.nextInt();
        while(input==1){
            System.out.println("Enter your number");
            int number = sc.nextInt();
            if(number>0){
                positive++;
                System.out.println(number + "is positive");
            }else if(number<0){
                negative++;
                System.out.println(number + "is negative");
            }else{
                zeros++;
                System.out.println(" number is zeros");
            }
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int X = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * X;
        }
        System.out.println("X to the power n is:" + result);




    }
}

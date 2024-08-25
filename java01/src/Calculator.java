import java.util.Scanner;

public class Calculator {



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator");

        while (true){
            System.out.println("Please enter 1st number");
            double num1= sc.nextDouble();

            System.out.println("Please enter operator");
            String symbol = sc.next();

            System.out.println("Please enter second number");
            double num2 = sc.nextDouble();

            double result;

            switch (symbol){
                case "+" :
                    result= num1 + num2;
                    break;
                case "-" :
                    result = num1-num2;
                    break;
                case "*" :
                    result = num1 * num2;
                    break;

                case "/" :
                    if(num2 !=0){
                        result = num1/ num2;
                    }else{
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error Invalid operator");
                    continue;



            }
            System.out.println("The result is" + result );


        }
    }
}

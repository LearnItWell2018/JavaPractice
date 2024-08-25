import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main (String[] args){
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win =false;


        while(!win){
            System.out.println("Please Guess your number");
            guess = input.nextInt();
            numberOfTries++;

            if(guess<1 || guess>100){
                System.out.println("Guess the number between 1 to 100");
            }else if(guess<numberToGuess){
                System.out.println("Your number is too low");
            }else if(guess>numberToGuess){
                System.out.println("your number is too high");
            }else{
                win = true;

            }
        }
        System.out.println("your guess is correct " + "You win the match");
        System.out.println("Your number of tries" +   numberOfTries);
    }
}

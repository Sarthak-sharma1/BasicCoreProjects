package CWHExercises;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    int number;
    int userInput;
    int noOfGuesses=0;

    GuessGame(){
         Random random = new Random();
         number = random.nextInt(100);
     }
     void takeUserInput(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter any Number less than 100");
         userInput = scanner.nextInt();
     }
     boolean isCorrectNumber(){
        noOfGuesses++;
        if (userInput==number){
            System.out.format("You Guessed it right, it was %d\nYou Guessed it in %d attempts",number,noOfGuesses);
            return  true;
        } else if (userInput<number) {
            System.out.println("Too Low");
        }
        else {
            System.out.println("too High");
        }
         return  false;

     }

    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        boolean b = false;
        while (!b){
            guessGame.takeUserInput();
            b = guessGame.isCorrectNumber();
        }
    }
}

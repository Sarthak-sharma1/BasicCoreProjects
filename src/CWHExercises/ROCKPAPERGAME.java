package CWHExercises;

import java.util.*;
public class ROCKPAPERGAME {
    public static void main(String[] args) {
        System.out.println("0 for Rock 1 for Paper 2 for Scissor");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

          if (userInput==computerInput)
              System.out.println("Draw Match");
         else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("You Win");
        } else {
              System.out.println("you Lose");
        }

         if (computerInput==2){
             System.out.println("computer : Scissor");
         } else if (computerInput==1) {
             System.out.println("computer : paper");
         }
         else
             System.out.println("computer : Rock");
    }
}

package SimpleProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class lotteryGameUsingArrays {
   public static void main(String[] args) {

      // generate winning numbers
      List<Integer> winningNum = new ArrayList<>();
      Random random = new Random();
      for (int i = 0; i < 6; i++) {
         while (true) {
            // get a random number between 1 to 49
            int winning = random.nextInt(49) + 1;
            // add it to list if it is not exist
            if (!winningNum.contains(winning)) {
               winningNum.add(winning);
               break;
            }
         }
      }

      // take input from user
      Scanner scan = new Scanner(System.in);
      System.out.println("================ Java Lottery Program Array " +
                         "================");
      System.out.println("Please enter the 6 numbers you want to " + 
                     "choose between 1 and 49");
      List<Integer> guessedNum = new ArrayList<>();
      
      for (int i = 0; i < 6; i++) {
         System.out.println("The numbers you have chosen are: " 
                        + guessedNum);
         System.out.print("Enter a number between 1-49: ");
         while (true) {
            try {
               String numberString = scan.nextLine();
               int number = Integer.parseInt(numberString);
               if (number >= 1 && number <= 49) {
                  guessedNum.add(number);
                  break;
               } else {
                  System.out.println(number + 
                    " is not between 1 and 49. Please try again.");
               }
            } catch (NumberFormatException nfe) {
               System.out.println("Hey, that's not even a number. "+
                              "Please try again.");
            }
         }
      }

      System.out.println("\nThe winning numbers were: " + winningNum);
      System.out.println("Your numbers are: " + guessedNum);

      guessedNum.retainAll(winningNum);
      System.out.println("Your matched numbers are: " + guessedNum);

      if (guessedNum.containsAll(winningNum)) {
         System.out.println("Holy crap, you actually won. "+
                        "How did you do that?");
      } else {
         System.out.println("Sorry, you lost. Not surprising.");
      }

      scan.close();
   }
}

package NumberPrograms;

import java.util.Scanner;

public class factorsOfTheNumbers {

   public static void findFactor(int n) {
       for(int i=1; i <= n; i++) {
           if(n % i == 0)
               System.out.print(i+"\t");
       }
   }

   public static void main(String[] args) {
   
       int number = 0;
 
       Scanner scan = new Scanner(System.in);
 
       System.out.print("Enter a number:: ");
       number = scan.nextInt();

       System.out.print("The factors are:: ");
       findFactor(number);

     

   }
}

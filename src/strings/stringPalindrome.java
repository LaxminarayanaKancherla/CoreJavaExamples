package strings;

import java.util.Scanner;

public class stringPalindrome {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String string = scan.nextLine();
      StringBuilder sb = new StringBuilder(string);
      sb.reverse();
      String data = sb.toString();
      if (string.equals(data)) {
         System.out.println("Palindrome");
      } else {
         System.out.println("Not Palindrome");
      }
      scan.close();
   }
}

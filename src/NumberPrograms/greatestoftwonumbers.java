package NumberPrograms;

import java.util.Scanner;

public class greatestoftwonumbers {

    public static void main(String[] args) {

       
       double num1 = 0.0, num2 = 0.0, num3 = 0.0;
       double largestNumber = 0.0;

      
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter three numbers:: ");
       num1 = scan.nextDouble();
       num2 = scan.nextDouble();
       num3 = scan.nextDouble();

     
       if(num1 >= num2) 
	{
            if(num1 >= num3) 
		largestNumber = num1;
            else 
		largestNumber = num3;
       } else 
	{
            if(num2>=num3) 
                largestNumber = num2;
            else largestNumber = num3;
       }

       System.out.println("Largest number = "+ largestNumber);
    

     }
 }

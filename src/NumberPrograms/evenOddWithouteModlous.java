package NumberPrograms;

import java.util.Scanner;
public class evenOddWithouteModlous {

public static boolean isEvenOdd(int n)
{
	boolean result;
   if((n/2)*2 == n) 
   {
	   return result=true;
   }
return result=false;
}
 public static void main(String []args) {
	 Scanner sc= new Scanner(System.in);
	 int n= sc.nextInt();
	boolean result1;
	result1= isEvenOdd(n);
	if(result1)
	{
		System.out.println("number is even");
	}
	else
	{
		System.out.println("number is odd");
	}
	 
 }
}

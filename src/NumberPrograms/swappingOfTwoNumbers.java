package NumberPrograms;

import java.util.Scanner;

//simple swapping of two numbers

public class swappingOfTwoNumbers {

public static void main(String[] args) {

	int x=10, y=20;
	int temp;

	temp = x;
	x = y;
	y = temp;

	System.out.println("Values After Swapping,");
	System.out.println("x="+x+"\t y="+y);
}
}
/*-----------------------------------------------------------------------------------
*/
//giving inputs in runtime using sccaner class



class Swap2 {

 //public static void main(String[] args)
 {

    // declare variables
    int x, y;
    int temp;

    // create Scanner class object
    // to read input
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    x = scan.nextInt();
    y = scan.nextInt();

    // displaying values before swapping
    System.out.println("Values before Swapping,");
    System.out.println("x="+x+"\t y="+y);

    // swap the numbers
    temp = x;
    x = y;
    y = temp;

    // displaying values after swapping
    System.out.println("Values After Swapping,");
    System.out.println("x="+x+"\t y="+y);

    // close Scanner class object
    scan.close();
 }
}

/*-----------------------------------------------------------------------------------
*/
//Swapping of two numbers in Java using + and – operator

class Swap3 {

// public static void main(String[] args) 
 {

    int x=10, y=20;

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("Values After Swapping,");
    System.out.println("x="+x+"\t y="+y);
 }
}

/*------------------------------------------------------------------------------------
//*/
class Swap4 {

 //public static void main(String[] args) 
 {

    int x=10, y=20;

    x = (x + y) - (y = x);

    System.out.println("Values After Swapping,");
    System.out.println("x="+x+"\t y="+y);
 }
}
/*-------------------------------------------------------------------------------------*/
//Swap two numbers in Java using * and / operator

class Swap5 {

 //public static void main(String[] args) 
 {

    int x=10, y=20;

    x = x * y;
    y = x / y;
    x = x / y;

    System.out.println("Values After Swapping,");
    System.out.println("x="+x+"\t y="+y);
 }
}


